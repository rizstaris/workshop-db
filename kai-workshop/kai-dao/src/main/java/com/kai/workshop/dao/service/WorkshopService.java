package com.kai.workshop.dao.service;

import java.util.List;

import javax.sql.DataSource;

import com.kai.workshop.model.workshop.Workshop;

public interface WorkshopService {

	public void setDatasource(DataSource dataSource);
	public List<Workshop> getWorkshopList();
	public Workshop getWorkshopById(Integer id);
	public Boolean insertWorkshop(Workshop workshop);
	public Boolean updateWorkshop(Workshop workshop);
	public Boolean deleteWorkshop(Integer idWorkshop);
}
