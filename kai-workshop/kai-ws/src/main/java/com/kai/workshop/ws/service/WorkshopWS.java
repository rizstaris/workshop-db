package com.kai.workshop.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.kai.workshop.ws.schema.Request;
import com.kai.workshop.ws.schema.Response;

@WebService(targetNamespace="http://kai.workshop.com/soap/service", name = "workshopWS")
public interface WorkshopWS {

	@WebResult(name = "response")
	@WebMethod(operationName = "getWorkshopById")
	public Response getWorkshopById(
			@WebParam(name = "id")
			Integer id
			);
	
	@WebResult(name = "response")
	@WebMethod(operationName = "insertWorkshop")
	public Response insertWorkshop(
			@WebParam(name = "request")
			Request request
			);
}
