package com.pohribnyi.soap_delivery;

import jakarta.xml.ws.Endpoint;

public class DeliveryPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/delivery", new DeliveryServiceImpl());
        System.out.println("SOAP-сервіс запущено: http://localhost:8080/delivery?wsdl");
    }
}