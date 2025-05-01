package com.pohribnyi.soap_client;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://soap_delivery.pohribnyi.com/", name = "DeliveryService")
public interface DeliveryService {

    @WebMethod
    @WebResult(name = "return")
    double calculateDeliveryCost(
        @WebParam(name = "weight") double weight,
        @WebParam(name = "country") String country
    );
}