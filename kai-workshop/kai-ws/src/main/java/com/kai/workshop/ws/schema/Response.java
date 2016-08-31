package com.kai.workshop.ws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
	    "schema",
	    "code",
	    "status"
	})
@XmlRootElement(name="response")
public class Response {
	
	private WorkshopSchema schema;
	private String code;
	private String status;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public WorkshopSchema getSchema() {
		return schema;
	}
	public void setSchema(WorkshopSchema schema) {
		this.schema = schema;
	}
}
