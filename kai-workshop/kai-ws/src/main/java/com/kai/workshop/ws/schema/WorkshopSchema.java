package com.kai.workshop.ws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
	    "id",
	    "nama",
	    "tglLahir",
	    "alamat",
	    "telp"
	})
@XmlRootElement(name="workshopSchema")
public class WorkshopSchema {

	private Integer id;
	private String nama;
	private String tglLahir;
	private String alamat;
	private String telp;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getTglLahir() {
		return tglLahir;
	}
	public void setTglLahir(String tglLahir) {
		this.tglLahir = tglLahir;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getTelp() {
		return telp;
	}
	public void setTelp(String telp) {
		this.telp = telp;
	}
}
