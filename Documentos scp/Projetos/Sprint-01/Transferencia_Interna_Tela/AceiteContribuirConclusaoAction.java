package br.com.bradesco.mobile.bvp.aceite.apresentacao;

import java.net.MalformedURLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.bradesco.mobile.bvp.comum.util.Constantes;
import br.com.bradesco.mobile.comum.action.MobileBaseAction;
import br.com.bradesco.web.aq.application.util.BradescoCommonServiceFactory;
import br.com.bradesco.web.bvp.service.aceitedigital.exception.AceiteDigitalServiceException;
import br.com.bradesco.web.previdencia.service.AceiteMobileServico;
import br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO;
import br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO;

public class AceiteContribuirConclusaoAction extends MobileBaseAction {

	public PropostaDTO efetivar(PropostaDTO proposta) throws AceiteDigitalServiceException {

		PropostaDTO propostas;
		AceiteMobileServico servico = AceiteMobileServico.getInstance();
		propostas = servico.efetivar(proposta);

		return propostas;
	}

	public TransferenciaDTO efetivarTransferencia(TransferenciaDTO transferencia) throws AceiteDigitalServiceException, MalformedURLException, ServiceException {

		TransferenciaDTO transferencias;
		AceiteMobileServico servico = AceiteMobileServico.getInstance();
		transferencias = servico.efetivacaoTransferencia(transferencia);

		return transferencias;
	}
	@Override
	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest request,
			final HttpServletResponse response) {

		ActionForward direciona = null;

		AceiteForm aceiteForm = (AceiteForm) form;

		if ("T".equalsIgnoreCase(aceiteForm.getTipoDeProposta())){
			direciona = efetivaTransferencia(mapping, request, aceiteForm);
		} else {
			direciona = efetivaProposta(mapping, request, aceiteForm);
		}
		
		return direciona;
	}

	private ActionForward efetivaProposta(final ActionMapping mapping, final HttpServletRequest request,
			AceiteForm aceiteForm) {
		ActionForward direciona;
		PropostaDTO efetivaProposta = null;

		try {
			efetivaProposta = efetivar(aceiteForm.getDetalheProposta());

			if (efetivaProposta.getStatusCode() != 0)
				throw new AceiteDigitalServiceException(efetivaProposta.getStatusMessage(),
						String.valueOf(efetivaProposta.getStatusCode()));

			aceiteForm.getDetalheProposta().setNrProtocolo(efetivaProposta.getNrProtocolo());

			if ("I".equalsIgnoreCase(aceiteForm.getTipoDeProposta())) {
				direciona = mapping.findForward("inscricao");
				
				if (aceiteForm.getDetalheProposta().getRiscos() != null) {
					request.setAttribute("temRisco", true);
					request.setAttribute("sizeBeneficioRisco", aceiteForm.getDetalheProposta().getRiscos().length);
				} else {
					request.setAttribute("temRisco", false);
					request.setAttribute("sizeBeneficioRisco", 0);
				}
				
				if (aceiteForm.getDetalheProposta().getBeneficiarios() != null) {
					request.setAttribute("temBeneficiarios", true);
					request.setAttribute("sizeBeneficiarios",
							aceiteForm.getDetalheProposta().getBeneficiarios().length);
				} else {
					request.setAttribute("temBeneficiarios", false);
					request.setAttribute("sizeBeneficiarios", 0);
				}
			} else if ("A".equalsIgnoreCase(aceiteForm.getTipoDeProposta())) {
				direciona = mapping.findForward("aceiteAporte");
			} else {
				direciona = mapping.findForward("Falha");
			}

			request.setAttribute("proposta", aceiteForm.getDetalheProposta());
		} catch (AceiteDigitalServiceException e) {

			super.gravarLogExcecao("ERRO Conclusao", "AceiteContribuirConclusaoAction", "executar()", e);

			String message = null;

			if (e.getMessage() != null)
				message = e.getMessage().substring(e.getMessage().indexOf(":") + 1);

			if ("15".equals(e.getCode())) {
				request.setAttribute("ERRO_GENERICO", false);
				request.setAttribute("MENSAGEM_ERRO", "15");
			} else if ("16".equals(e.getCode())) {
				request.setAttribute("ERRO_GENERICO", false);
				request.setAttribute("CODIGO_ERRO", "16");
				request.setAttribute("MENSAGEM_ERRO", "Serviço indisponível, tente novamente.");
			} else {
				request.setAttribute("ERRO_GENERICO", true);
			}

			direciona = mapping.findForward("Falha");

			if (aceiteForm.getDetalheProposta().getTipoDeProposta().equalsIgnoreCase("A"))
				direciona = mapping.findForward("FalhaAporte");

			return direciona;
		} catch (Exception ex) {
			BradescoCommonServiceFactory.getLogManager().error(this.getClass(), ex);
			direciona = mapping.findForward(Constantes.ERRO_GERAL);
		}
		return direciona;
	}
	
	private ActionForward efetivaTransferencia(final ActionMapping mapping, final HttpServletRequest request,
			AceiteForm aceiteForm) {
		Boolean isMock = Boolean.TRUE;
		
		if(isMock){
			ActionForward direciona = null;

			PropostaDTO propTeste = aceiteForm.getDetalheProposta();
			propTeste.setNrProtocolo("032546885621234589");
//			request.setAttribute("proposta", propTeste);
			request.setAttribute("transferencia", aceiteForm.getDetalheTransferencia());
			request.setAttribute("proposta", propTeste);
			direciona = mapping.findForward("transferenciaInterna");
			return direciona;
		}
		
		
		
		ActionForward direciona;
		TransferenciaDTO efetivaTransf = null;

		
		try {
			efetivaTransf = efetivarTransferencia(aceiteForm.getDetalheTransferencia());

			if (efetivaTransf.getStatusCode() != 0)
				throw new AceiteDigitalServiceException(efetivaTransf.getStatusMessage(),
						String.valueOf(efetivaTransf.getStatusCode()));

			aceiteForm.getDetalheTransferencia().setNrProtocolo(efetivaTransf.getNrProtocolo());

			direciona = mapping.findForward("transferenciaInterna");
			
			request.setAttribute("transferencia", aceiteForm.getDetalheTransferencia());
			request.setAttribute("proposta", aceiteForm.getDetalheProposta());
			
		} catch (AceiteDigitalServiceException e) {

			super.gravarLogExcecao("ERRO Conclusao", "AceiteContribuirConclusaoAction", "executar()", e);

			String message = null;

			if (e.getMessage() != null)
				message = e.getMessage().substring(e.getMessage().indexOf(":") + 1);

			if ("15".equals(e.getCode())) {
				request.setAttribute("ERRO_GENERICO", false);
				request.setAttribute("MENSAGEM_ERRO", "15");
			} else if ("16".equals(e.getCode())) {
				request.setAttribute("ERRO_GENERICO", false);
				request.setAttribute("CODIGO_ERRO", "16");
				request.setAttribute("MENSAGEM_ERRO", "Serviço indisponível, tente novamente.");
			} else {
				request.setAttribute("ERRO_GENERICO", true);
			}

			direciona = mapping.findForward("Falha");

			if (aceiteForm.getDetalheProposta().getTipoDeProposta().equalsIgnoreCase("A"))
				direciona = mapping.findForward("FalhaAporte");

			return direciona;
		} catch (Exception ex) {
			BradescoCommonServiceFactory.getLogManager().error(this.getClass(), ex);
			direciona = mapping.findForward(Constantes.ERRO_GERAL);
		}
		return direciona;
	}
}
