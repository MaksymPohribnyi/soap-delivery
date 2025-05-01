package com.pohribnyi.soap_client;

import java.net.URL;

import javax.xml.namespace.QName;


import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;

@WebServiceClient(name = "DeliveryServiceImplService", targetNamespace = "http://soap_delivery.pohribnyi.com/", wsdlLocation = "http://localhost:8080/delivery?wsdl")
public class DeliveryServiceClient extends Service {

	private static final QName SERVICE_QNAME = new QName("http://soap_delivery.pohribnyi.com/", "DeliveryServiceImplService");

	public DeliveryServiceClient(URL wsdlURL) {
		super(wsdlURL, SERVICE_QNAME);
	}

	@WebEndpoint(name = "DeliveryServiceImplPort")
	public DeliveryService getDeliveryServicePort() {
		return super.getPort(DeliveryService.class);
	}
}