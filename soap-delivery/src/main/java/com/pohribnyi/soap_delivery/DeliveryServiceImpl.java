package com.pohribnyi.soap_delivery;

import com.pohribnyi.soap_client.DeliveryService;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.pohribnyi.soap_client.DeliveryService")
public class DeliveryServiceImpl implements DeliveryService {

	@Override
	public double calculateDeliveryCost(double weight, String country) {
		System.out.println("Received weight: " + weight + ", country: " + country); 
		double rate = country.equalsIgnoreCase("USA") ? 10.0 : 15.0;
		return rate * weight;
	}
}
