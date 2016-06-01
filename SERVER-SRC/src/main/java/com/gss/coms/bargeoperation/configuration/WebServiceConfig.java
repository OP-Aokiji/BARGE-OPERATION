package com.gss.coms.bargeoperation.configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.context.support.ServletContextResource;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurationSupport;
import org.springframework.ws.server.EndpointAdapter;
import org.springframework.ws.server.endpoint.adapter.DefaultMethodEndpointAdapter;
import org.springframework.ws.server.endpoint.adapter.method.MarshallingPayloadMethodProcessor;
import org.springframework.ws.server.endpoint.adapter.method.MethodArgumentResolver;
import org.springframework.ws.server.endpoint.adapter.method.MethodReturnValueHandler;
import org.springframework.ws.soap.SoapMessageFactory;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.soap.server.SoapMessageDispatcher;
import org.springframework.ws.transport.http.WebServiceMessageReceiverHandlerAdapter;
import org.springframework.ws.transport.http.WsdlDefinitionHandlerAdapter;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

@Configuration
@EnableWs
@ComponentScan(basePackages = "com.gss.coms.bargeoperation.ws.endpoint")
public class WebServiceConfig extends WsConfigurationSupport {

	@Autowired
	private ServletContext servletContext;

	@Bean
	public WebServiceMessageReceiverHandlerAdapter webServiceMessageReceiverHandlerAdapter() {
		WebServiceMessageReceiverHandlerAdapter wsHandlerAdapter = new WebServiceMessageReceiverHandlerAdapter();
		wsHandlerAdapter.setMessageFactory(messageFactory());
		return wsHandlerAdapter;
	}
	
	@Bean
	public SoapMessageFactory messageFactory() {
		return new SaajSoapMessageFactory();
	}

	@Bean
	public WsdlDefinitionHandlerAdapter wsdlDefinitionHandlerAdapter() {
		WsdlDefinitionHandlerAdapter wsdlHandler = new WsdlDefinitionHandlerAdapter();
		wsdlHandler.setTransformLocations(true);
		return wsdlHandler;
	}
	
	@Bean
	public SimpleUrlHandlerMapping simpleUrlHandlerMapping() {
		Properties prop = new Properties();
		prop.put("/ws", "messageDispatcher");
		prop.put("/ws/facadeService.wsdl", "facadeService");
		
		SimpleUrlHandlerMapping mappingHandler = new SimpleUrlHandlerMapping();
		mappingHandler.setDefaultHandler(messageDispatcher());
		mappingHandler.setMappings(prop);
		return mappingHandler;
	}
	
	@Bean
	public SoapMessageDispatcher messageDispatcher() {
		List<EndpointAdapter> listAdapter = new ArrayList<EndpointAdapter>();
		listAdapter.add(defaultMethodEndpointAdapter());
		
		SoapMessageDispatcher msgDispatcher = new SoapMessageDispatcher();
		msgDispatcher.setEndpointAdapters(listAdapter);
		return msgDispatcher;
	}
	
	@Bean
	public SimpleWsdl11Definition facadeService() {
		SimpleWsdl11Definition service = new SimpleWsdl11Definition();
		ServletContextResource resource = new ServletContextResource(servletContext, "/WEB-INF/wsdl/WSFacade.wsdl");
		service.setWsdl(resource);
		return service;
	}
	
	@Bean
	@Override
	public DefaultMethodEndpointAdapter defaultMethodEndpointAdapter() {
		List<MethodArgumentResolver> argumentResolvers = new ArrayList<MethodArgumentResolver>();
		argumentResolvers.add(methodProcessor());
		List<MethodReturnValueHandler> returnValueHandlers = new ArrayList<MethodReturnValueHandler>();
		returnValueHandlers.add(methodProcessor());
		
		DefaultMethodEndpointAdapter adapter = new DefaultMethodEndpointAdapter();
		adapter.setMethodArgumentResolvers(argumentResolvers);
		adapter.setMethodReturnValueHandlers(returnValueHandlers);
		
		return adapter;
	}
	
	@Bean
	public MarshallingPayloadMethodProcessor methodProcessor() {
		return new MarshallingPayloadMethodProcessor(marshaller());
	}
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.gss.coms.bargeoperation.ws.schemas");
		return marshaller;
	}
}
