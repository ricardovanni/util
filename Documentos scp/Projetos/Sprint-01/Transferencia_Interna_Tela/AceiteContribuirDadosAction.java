package br.com.bradesco.mobile.bvp.aceite.apresentacao;

import java.math.BigDecimal;
import java.net.MalformedURLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.bradesco.mobile.bvp.comum.util.Constantes;
import br.com.bradesco.mobile.bvp.util.FormatadorUtil;
import br.com.bradesco.mobile.comum.action.FuncionalidadeBaseAction;
import br.com.bradesco.mobile.comum.action.ObterException;
import br.com.bradesco.mobile.comum.action.TratarException;
import br.com.bradesco.mobile.comum.util.GeralConfig;
import br.com.bradesco.modelo.Conta;
import br.com.bradesco.web.aq.application.util.BradescoCommonServiceFactory;
import br.com.bradesco.web.bvp.service.aceitedigital.exception.AceiteDigitalServiceException;
import br.com.bradesco.web.previdencia.enums.RegimeTributario;
import br.com.bradesco.web.previdencia.enums.TipoTransferencia;
import br.com.bradesco.web.previdencia.service.AceiteMobileServico;
import br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO;
import br.com.bradesco.web.previdencia.service.dto.termoaceite.BeneficiarioDTO;
import br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO;
public class AceiteContribuirDadosAction extends FuncionalidadeBaseAction {


	private static GeralConfig geralConfig = GeralConfig.getInstance();

	private static final String URL_REGULAMENTO = geralConfig.getProperty("urlPFD");

	public PropostaDTO consultar(PropostaDTO proposta) throws AceiteDigitalServiceException {
		AceiteMobileServico servico = AceiteMobileServico.getInstance();
		
		PropostaDTO propostas = servico.consultar(proposta);

		return propostas;
	}
	
	public TransferenciaDTO consultarTransferencia(TransferenciaDTO transf) throws AceiteDigitalServiceException, MalformedURLException, ServiceException {
		AceiteMobileServico servico = AceiteMobileServico.getInstance();
		
		TransferenciaDTO propostas = servico.consultarTransferencia(transf);

		return propostas;
	}

	@Override
	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest request,
			final HttpServletResponse response) {

		ActionForward direciona = null;

		AceiteForm aceiteForm = (AceiteForm) form;
		
		if ("T".equalsIgnoreCase(aceiteForm.getTipoDeProposta())){
			direciona = getTransferencia(mapping, request, aceiteForm);
		} else {
			direciona = getProposta(mapping, request, aceiteForm);
		}	

		return direciona;
	}

	private ActionForward getProposta(final ActionMapping mapping, final HttpServletRequest request,
			AceiteForm aceiteForm) {
		ActionForward direciona;
		PropostaDTO detalheProposta = null;
		PropostaDTO propostaIn = new PropostaDTO();
		
		propostaIn.setNumeroDaProposta(aceiteForm.getNumeroDaProposta());
		propostaIn.setSerieDaProposta(aceiteForm.getSerieDaProposta());
		propostaIn.setTipoDeProposta(aceiteForm.getTipoDeProposta());
		propostaIn.setCpf(aceiteForm.getCpf());
		propostaIn.setCpfControle(aceiteForm.getCpfControle());
		
		try {
			HttpSession sessao = request.getSession(false);
			Conta conta = (Conta) sessao.getAttribute("PeclInf.conta");

			request.setAttribute("tecnologia", sessao.getAttribute("tecnologia"));
			
			propostaIn.setAgencia(conta.getAgencia());
			propostaIn.setConta(conta.getConta());
			detalheProposta = consultar(propostaIn);
			
			if ("I".equalsIgnoreCase(aceiteForm.getTipoDeProposta())) {
				direciona = mapping.findForward("inscricao");
				if (detalheProposta.getRiscos() != null) {
					request.setAttribute("temRisco", true);
					request.setAttribute("sizeBeneficioRisco", detalheProposta.getRiscos().length);
				} else {
					request.setAttribute("temRisco", false);
					request.setAttribute("sizeBeneficioRisco", 0);
				}
				if (detalheProposta.getBeneficiarios() != null) {
					request.setAttribute("temBeneficiarios", true);
					request.setAttribute("sizeBeneficiarios", detalheProposta.getBeneficiarios().length);
				} else {
					request.setAttribute("temBeneficiarios", false);
					request.setAttribute("sizeBeneficiarios", 0);
				}
			} else if ("A".equalsIgnoreCase(aceiteForm.getTipoDeProposta())) {
				direciona = mapping.findForward("aceiteAporte");
			} else {
				direciona = mapping.findForward("Falha");
			}
			
			String urlReg = URL_REGULAMENTO + detalheProposta.getNumeroDoProcessoSUSEP().replaceAll("[^0-9]", " ")
					+ ".pdf";
			
			aceiteForm.setDetalheProposta(detalheProposta);
			
			request.setAttribute("urlRegulamento", urlReg);
			request.setAttribute("proposta", detalheProposta);
			request.setAttribute("propostaDTO", aceiteForm);
		} catch (AceiteDigitalServiceException e) {
			BradescoCommonServiceFactory.getLogManager().error(this.getClass(), e);
			direciona = mapping.findForward(Constantes.ERRO_GERAL);
		} catch (Exception ex) {
			BradescoCommonServiceFactory.getLogManager().error(this.getClass(), ex);
			direciona = mapping.findForward(Constantes.ERRO_GERAL);
		}
		return direciona;
	}

	private ActionForward getTransferencia(final ActionMapping mapping, final HttpServletRequest request,
			AceiteForm aceiteForm) {
		
		ActionForward direciona;
		PropostaDTO detalheProposta = null; //verificar
		TransferenciaDTO detalheTransferencia = null;

		Boolean isMock = Boolean.TRUE;
		
		if(isMock){
			// *************** REMOVER ESSES DADOS APOS O TESTE ****************************
						String st = "XXXXXXXXXXXXXXXXX";
						TransferenciaDTO t = new TransferenciaDTO();
						t.setAgencia(7131);
						t.setConta(19579);
						t.setDigitoConta(9);
						t.setBaseTecnicaDestino(st);
						t.setBaseTecnicaOrigem(st);
						t.setIndiceCorrPorpostaDestino("10");
						t.setNomePlanoOrigem("PLANO-A");
						t.setNomePlanoDestino("PLANO-B");
						t.setProcessoSusep(st);
						t.setPropostaOrigem(1010101010);
						t.setPropostaDestino(2020202020);
						t.setRegimeTributarioOrigem(RegimeTributario.PROGRESSIVO.getTipo());
						t.setRegimeTributarioDestino(RegimeTributario.REGRESSIVO.getTipo());
						t.setTipoTransferenciaOrigem(TipoTransferencia.PARCIAL.getTipo());
						t.setTpPlanoOrigem("EMPRESARIAL");
						t.setTpPlanoDestino("INDIVIDUAL");
						t.setVlrTaxaAdmOrigem(new BigDecimal(10));
						t.setVlrTaxaAdmDestino(new BigDecimal(5));
						t.setVlrTransferenciaOrigem(new BigDecimal(100999500.55));
						t.setVlTransferencia(new BigDecimal(700.8));
						t.setIndiceCorrPorpostaOrigem("5");
						t.setIndiceCorrPorpostaDestino("2");
						t.setDtPedidoTransferenciaOrigem("10.09.2018");
						request.setAttribute("transferencia", t);
						// *************** REMOVER ESSES DADOS APOS O TESTE ****************************
			
						String urlReg = "TESTE.pdf";
						
						PropostaDTO prop = new PropostaDTO();
						prop.setAgencia(3977);
						prop.setConta(43000);
						prop.setCpf(35262478549L);
						prop.setQtdOcorrenciaRisco(3);
						prop.setCaminhoProtocolo("caminhoProtocolo");
						prop.setCarregamentoDeEntrada(0001111L);
						prop.setCarregamentoDeEntradaFormatado("carregamentoEntradaFormatado");
						prop.setCarregamentoDeSaida("carregamentoSaida");
						prop.setCobertura("Cobertura");
						prop.setCorrentista(true);
						prop.setCpfControle(1);
						prop.setDigitoAgencia(0);
						prop.setDtProposta("1");
						prop.setFormaDePagamento("vista");
						prop.setIdProposta(2);
						prop.setNmParticipante("nmParticipante");
						prop.setNomeDoFundo("PLANO-B");
						prop.setNomeDoPlano("Plano Teste");
						prop.setNomeProponente("Total/Parcial");
						prop.setNrProtocolo("123");
						prop.setNumeroDaProposta(1l);
						prop.setNumeroDaPropostaAporte(1l);
						prop.setNumeroDaPropostaAporteFormatado("nrFormatado");
						prop.setNumeroDaPropostaFormatado("654321");
						prop.setNumeroDoProcessoSUSEP("numeroDoProcessoSUSEP");
						prop.setPropostaSelecionada(prop);
						prop.setRegimeTributario("regimeTribut");
						prop.setSerieDaProposta("012");
						prop.setTipoDeProposta("T");
						prop.setTipoDePlano("PLANO-A");
						BeneficiarioDTO bnf = new BeneficiarioDTO();
						bnf.setNome("Nome do Usuario Beneficiario");
						bnf.setAgencia(0123);
						bnf.setConta(123456);
						bnf.setCpf(35262478549L);
						bnf.setTitularidade("titular");
						
						BeneficiarioDTO[] listBnf = {bnf};
						
						prop.setBeneficiarios(listBnf);
						
						aceiteForm.setDetalheTransferencia(t);
						
						aceiteForm.setDetalheProposta(prop);
						
						formatarDadosTransferencia(t);
						
						direciona = mapping.findForward("transferenciainterna");
						request.setAttribute("transferencia", t);
						request.setAttribute("urlRegulamento", urlReg);
						request.setAttribute("propostaDTO", aceiteForm);
						request.setAttribute("proposta", prop);
						
		} else {
			TransferenciaDTO transferenciaIn = new TransferenciaDTO();
			
			transferenciaIn.setPropostaDestino((int) aceiteForm.getNumeroDaProposta());
			transferenciaIn.setSeriePropostaDestino(Integer.parseInt(aceiteForm.getSerieDaProposta()));
			
			try {
				HttpSession sessao = request.getSession(false);
				Conta conta = (Conta) sessao.getAttribute("PeclInf.conta");
				
				getProposta(mapping, request, aceiteForm);
				
				request.setAttribute("tecnologia", sessao.getAttribute("tecnologia"));
				
				transferenciaIn.setAgencia(conta.getAgencia());
				transferenciaIn.setConta(conta.getConta());
				detalheTransferencia = consultarTransferencia(transferenciaIn);
				
				formatarDadosTransferencia(detalheTransferencia);	
				
				direciona = mapping.findForward("transferenciainterna");
				
				String urlReg = URL_REGULAMENTO + detalheTransferencia.getProcessoSusep().replaceAll("[^0-9]", " ")
						+ ".pdf";
				
				aceiteForm.setDetalheTransferencia(detalheTransferencia);
				
				request.setAttribute("transferencia", detalheTransferencia);
			} catch (AceiteDigitalServiceException e) {
				BradescoCommonServiceFactory.getLogManager().error(this.getClass(), e);
				direciona = mapping.findForward(Constantes.ERRO_GERAL);
			} catch (Exception ex) {
				BradescoCommonServiceFactory.getLogManager().error(this.getClass(), ex);
				direciona = mapping.findForward(Constantes.ERRO_GERAL);
			}
						
		}
		
		
		
		return direciona;
	}

	private void formatarDadosTransferencia(TransferenciaDTO detalheTransferencia) {
		detalheTransferencia.setVlrTaxaAdmOrigem(FormatadorUtil.formatarInteiroParaDecimal(detalheTransferencia.getVlrTaxaAdmOrigem()));
		detalheTransferencia.setVlrTaxaAdmDestino(FormatadorUtil.formatarInteiroParaDecimal(detalheTransferencia.getVlrTaxaAdmDestino()));
		detalheTransferencia.setVlrTransferenciaOrigem(FormatadorUtil.formatarInteiroParaDecimal(detalheTransferencia.getVlrTransferenciaOrigem()));
		detalheTransferencia.setDtPedidoTransferenciaOrigem(FormatadorUtil.formatarDataBRZ(detalheTransferencia.getDtPedidoTransferenciaOrigem()));
	}

	
	@Override
	protected Object obter(ActionMapping arg0, ActionForm arg1, HttpServletRequest arg2, HttpServletResponse arg3,
			HttpSession arg4) throws ObterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ActionForward tratar(ActionMapping arg0, ActionForm arg1, HttpServletRequest arg2,
			HttpServletResponse arg3, HttpSession arg4, Object arg5) throws TratarException {
		// TODO Auto-generated method stub
		return null;
	}

}
