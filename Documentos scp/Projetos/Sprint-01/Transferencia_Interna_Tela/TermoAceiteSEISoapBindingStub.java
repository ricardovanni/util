/**
 * TermoAceiteSEISoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradesco.web.previdencia.webservice.termoaceite;

import br.com.bradesco.web.previdencia.service.dto.termoaceite.BeneficiarioDTO;
import br.com.bradesco.web.previdencia.service.dto.termoaceite.ListaPropostaDTO;
import br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO;

public class TermoAceiteSEISoapBindingStub extends org.apache.axis.client.Stub implements br.com.bradesco.web.previdencia.webservice.termoaceite.TermoAceiteSEI {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarPropostas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "correntista"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.service.previdencia.web.bradesco.com.br", "CorrentistaDTO"), br.com.bradesco.web.previdencia.service.dto.CorrentistaDTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "ListaPropostaDTO"));
        oper.setReturnClass(br.com.bradesco.web.previdencia.service.dto.termoaceite.ListaPropostaDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "consultarPropostasReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarTransferencia");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "transferenciaDTO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.service.previdencia.web.bradesco.com.br", "TransferenciaDTO"), br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto.service.previdencia.web.bradesco.com.br", "TransferenciaDTO"));
        oper.setReturnClass(br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "consultarTransferenciaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("efetivacaoTransferencia");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "transferenciaDTO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dto.service.previdencia.web.bradesco.com.br", "TransferenciaDTO"), br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dto.service.previdencia.web.bradesco.com.br", "TransferenciaDTO"));
        oper.setReturnClass(br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "efetivacaoTransferenciaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "proposta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "PropostaDTO"), br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "PropostaDTO"));
        oper.setReturnClass(br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "consultarReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("efetivar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "proposta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "PropostaDTO"), br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "PropostaDTO"));
        oper.setReturnClass(br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "efetivarReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public TermoAceiteSEISoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TermoAceiteSEISoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TermoAceiteSEISoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://aporteMobile.dto.service.previdencia.web.bradesco.com.br", "ResponseDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.aporteMobile.ResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.service.previdencia.web.bradesco.com.br", "CorrentistaDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.CorrentistaDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.service.previdencia.web.bradesco.com.br", "PropostaDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.PropostaDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.service.previdencia.web.bradesco.com.br", "RequiredFields");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.RequiredFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dto.service.previdencia.web.bradesco.com.br", "TransferenciaDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "BeneficiarioDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.termoaceite.BeneficiarioDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "BeneficioRiscoDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.termoaceite.BeneficioRiscoDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "ListaPropostaDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.termoaceite.ListaPropostaDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "PropostaDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "RiscoDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.termoaceite.RiscoDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "ArrayOf_tns2_BeneficiarioDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.termoaceite.BeneficiarioDTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "BeneficiarioDTO");
            qName2 = new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "ArrayOf_tns2_BeneficioRiscoDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.termoaceite.BeneficioRiscoDTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "BeneficioRiscoDTO");
            qName2 = new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "ArrayOf_tns2_PropostaDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "PropostaDTO");
            qName2 = new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "ArrayOf_tns2_RiscoDTO");
            cachedSerQNames.add(qName);
            cls = br.com.bradesco.web.previdencia.service.dto.termoaceite.RiscoDTO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://termoaceite.dto.service.previdencia.web.bradesco.com.br", "RiscoDTO");
            qName2 = new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.com.bradesco.web.previdencia.service.dto.termoaceite.ListaPropostaDTO consultarPropostas(br.com.bradesco.web.previdencia.service.dto.CorrentistaDTO correntista) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "consultarPropostas"));

        setRequestHeaders(_call);
        setAttachments(_call);
        
        try { 							// MOCK PARA OS DADOS DA CONSULTA DE PROPOSTAS
			boolean isTest = true;

			if (isTest) {
				br.com.bradesco.web.previdencia.service.dto.termoaceite.ListaPropostaDTO ret = new ListaPropostaDTO();
				ret.setCodigoMensagem(1);
				ret.setDescricaoMensagem("TEXTO");
				ret.setNomePartic("USUARIO");
				ret.setTamanhoLista(1);
				
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
				prop.setNomeDoFundo("nomeDoFundo");
				prop.setNomeDoPlano("Plano Teste");
				prop.setNomeProponente("nomeProponente");
				prop.setNrProtocolo("03030351616821351365136541");
				prop.setNumeroDaProposta(1l);
				prop.setNumeroDaPropostaAporte(1l);
				prop.setNumeroDaPropostaAporteFormatado("nrFormatado");
				prop.setNumeroDaPropostaFormatado("654321");
				prop.setNumeroDoProcessoSUSEP("numeroDoProcessoSUSEP");
				prop.setPropostaSelecionada(prop);
				prop.setRegimeTributario("regimeTribut");
				prop.setSerieDaProposta("012");
				prop.setTipoDeProposta("T");
				prop.setTipoDePlano("A");
				BeneficiarioDTO bnf = new BeneficiarioDTO();
				bnf.setNome("Nome do Usuario Beneficiario");
				bnf.setAgencia(0123);
				bnf.setConta(123456);
				bnf.setCpf(35262478549L);
				bnf.setTitularidade("titular");
				
				BeneficiarioDTO[] listBnf = {bnf};
				
				prop.setBeneficiarios(listBnf);
				
				PropostaDTO[] lista = {prop};
				
				ret.setLista(lista);
				
				return ret;
			} else {
				java.lang.Object _resp = _call.invoke(new java.lang.Object[] { correntista });
				
				if (_resp instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) _resp;
				} else {
					extractAttachments(_call);
					try {
						return (br.com.bradesco.web.previdencia.service.dto.termoaceite.ListaPropostaDTO) _resp;
					} catch (java.lang.Exception _exception) {
						return (br.com.bradesco.web.previdencia.service.dto.termoaceite.ListaPropostaDTO) org.apache.axis.utils.JavaUtils
								.convert(_resp,
										br.com.bradesco.web.previdencia.service.dto.termoaceite.ListaPropostaDTO.class);
					}
				}
				
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

    public br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO consultarTransferencia(br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO transferenciaDTO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "consultarTransferencia"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {transferenciaDTO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO efetivacaoTransferencia(br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO transferenciaDTO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "efetivacaoTransferencia"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {transferenciaDTO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradesco.web.previdencia.service.dto.TransferenciaDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO consultar(br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO proposta) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "consultar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        
	 	boolean isTest = true;

		if (isTest) {
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
			
			return prop;
		} else {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proposta});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)_resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO) _resp;
				} catch (java.lang.Exception _exception) {
					return (br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO.class);
				}
			}
		}
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO efetivar(br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO proposta) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://termoaceite.webservice.previdencia.web.bradesco.com.br", "efetivar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proposta});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradesco.web.previdencia.service.dto.termoaceite.PropostaDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
