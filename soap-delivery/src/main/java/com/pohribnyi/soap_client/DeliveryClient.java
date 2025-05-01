package com.pohribnyi.soap_client;

import java.net.URL;

public class DeliveryClient {
	public static void main(String[] args) throws Exception {
		URL wsdlURL = new URL("http://localhost:8080/delivery?wsdl");
		DeliveryServiceClient service = new DeliveryServiceClient(wsdlURL);
		DeliveryService port = service.getDeliveryServicePort();

		System.out.println("Вартість доставки: " + port.calculateDeliveryCost(3.5, "USA"));
		System.out.println("Вартість доставки: " + port.calculateDeliveryCost(5.5, "Ukraine"));
	}
}
