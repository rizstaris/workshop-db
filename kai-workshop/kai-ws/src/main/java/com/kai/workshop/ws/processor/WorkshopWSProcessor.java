package com.kai.workshop.ws.processor;

import java.util.Date;

import org.apache.camel.Body;

import com.kai.workshop.dao.service.WorkshopService;
import com.kai.workshop.model.workshop.Workshop;
import com.kai.workshop.ws.schema.Request;
import com.kai.workshop.ws.schema.Response;
import com.kai.workshop.ws.schema.WorkshopSchema;

public class WorkshopWSProcessor {

	private WorkshopService workshopService;

	public Response getWorkshopById(@Body Integer id){
		
		Workshop workshop = workshopService.getWorkshopById(id);
		
		Response response = new Response();
		
		if(workshop == null){
			response.setCode("-1");
			response.setStatus("data tidak ditemukan");
		}else{
			WorkshopSchema schema = new WorkshopSchema();
			
			schema.setId(workshop.getId());
			schema.setNama(workshop.getNama());
			schema.setTglLahir(workshop.getTglLahir().toString());
			schema.setAlamat(workshop.getAlamat());
			schema.setTelp(workshop.getTelp());
			
			response.setSchema(schema);
		}
		return response;
	}
	
	public Response insertWorkshop(@Body Request request){
		
		Workshop workshop = new Workshop();
		
		workshop.setId(request.getSchema().getId());
		workshop.setNama(request.getSchema().getNama());
		workshop.setTglLahir(new Date(request.getSchema().getTglLahir()));
		workshop.setAlamat(request.getSchema().getAlamat());
		workshop.setTelp(request.getSchema().getTelp());
		
		Boolean result = workshopService.insertWorkshop(workshop);
		
		Response response = new Response();
		
		if(result){
			response.setCode("0");
			response.setStatus("DATA BERHASIL DI INSERT");
		}else{
			response.setCode("-1");
			response.setStatus("DATA GAGAL DI INSERT");
		}
		return response;
	}
	
	public WorkshopService getWorkshopService() {
		return workshopService;
	}

	public void setWorkshopService(WorkshopService workshopService) {
		this.workshopService = workshopService;
	}
}
