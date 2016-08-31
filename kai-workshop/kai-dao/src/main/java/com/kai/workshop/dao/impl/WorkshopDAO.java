package com.kai.workshop.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kai.workshop.dao.mapper.WorkshopMapper;
import com.kai.workshop.dao.service.WorkshopService;
import com.kai.workshop.model.workshop.Workshop;

public class WorkshopDAO implements WorkshopService{

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void setDatasource(DataSource dataSource) {
		// TODO Auto-generated method stub
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Workshop> getWorkshopList() {
		// TODO Auto-generated method stub
		String query = "SELECT ID, NAMA, TGL_LAHIR, ALAMAT, TELP FROM WORKSHOP";
		
		List<Workshop> workshopList = jdbcTemplate.query(query, new WorkshopMapper().getWorkshopMapper);
		
		if(workshopList.size() == 0){
			return null;
		}
		return workshopList;
	}

	@Override
	public Workshop getWorkshopById(Integer id) {
		// TODO Auto-generated method stub
		String query = "SELECT ID, NAMA, TGL_LAHIR, ALAMAT, TELP FROM WORKSHOP WHERE ID = ?";
		
		Object[] params = new Object[]{id};
		
		List<Workshop> workshopList = jdbcTemplate.query(query, params, new WorkshopMapper().getWorkshopMapper);
		
		if(workshopList.size() == 0){
			return null;
		}
		
		return workshopList.get(0);
	}

	@Override
	public Boolean insertWorkshop(Workshop workshop) {
		// TODO Auto-generated method stub
		Boolean result = false;
		
		String query = "INSERT INTO WORkSHOP(ID, NAMA, TGL_LAHIR, ALAMAT, TELP) VALUES(?, ?, ?, ?, ?)";
		
		try {
			jdbcTemplate.update(query, new Object[] {
					workshop.getId(),
					workshop.getNama(),
					workshop.getTglLahir(),
					workshop.getAlamat(),
					workshop.getTelp()
			});
			
			result = true;
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Boolean updateWorkshop(Workshop workshop) {
		// TODO Auto-generated method stub
		Boolean result = false;
		
		String query = "UPDATE WORkSHOP SET NAMA = ?, TGL_LAHIR = ?, ALAMAT = ?, TELP = ? WHERE ID = ?";
		
		try {
			jdbcTemplate.update(query, new Object[] {
					workshop.getNama(),
					workshop.getTglLahir(),
					workshop.getAlamat(),
					workshop.getTelp(),
					workshop.getId()
			});
			
			result = true;
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Boolean deleteWorkshop(Integer idWorkshop) {
		// TODO Auto-generated method stub
		Boolean result = false;
		
		String query = "DELETE FROM WORKSHOP WHERE ID = ?";
		
		try {
			jdbcTemplate.update(query, new Object[] {
					idWorkshop
			});
			
			result = true;
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
