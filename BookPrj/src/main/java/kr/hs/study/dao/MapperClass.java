package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import kr.hs.study.dto.LoginDTO;

@Component
public class MapperClass implements RowMapper<LoginDTO>{

	public LoginDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		LoginDTO dto = new LoginDTO();
		dto.setUserid(rs.getString("userid"));
		dto.setUserpass(rs.getInt("userpass"));

		return dto;
	}

}
