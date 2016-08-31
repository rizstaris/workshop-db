package com.kai.workshop.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.kai.workshop.model.workshop.Workshop;

public class WorkshopMapper {

	public RowMapper<Workshop> getWorkshopMapper = new RowMapper<Workshop>() {
		
		@Override
		public Workshop mapRow(ResultSet rs, int i) throws SQLException {
			// TODO Auto-generated method stub
			Workshop workshop = new Workshop();
			
			workshop.setId(rs.getInt("ID"));
			workshop.setNama(rs.getString("NAMA"));
			workshop.setTglLahir(rs.getDate("TGL_LAHIR"));
			workshop.setAlamat(rs.getString("ALAMAT"));
			workshop.setTelp(rs.getString("TELP"));
			
			return workshop;
		}
	};
	public RowMapper<Workshop> getWorkshopByIdMapper = new RowMapper<Workshop>() {
		
		@Override
		public Workshop mapRow(ResultSet arg0, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
	}; 
}
