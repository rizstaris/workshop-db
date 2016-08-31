package com.kai.workshop.ws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
	    "schema"
	})
@XmlRootElement(name="request")
public class Request {
	
	private WorkshopSchema schema;

	public WorkshopSchema getSchema() {
		return schema;
	}

	public void setSchema(WorkshopSchema schema) {
		this.schema = schema;
	}
}
