package co.lucjay.shop.shopManager.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CompanyMasterMapper implements RowMapper<CompanyMasterVo> {

	@Override
	public CompanyMasterVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		CompanyMasterVo vo = new CompanyMasterVo();
		vo.setmRegister(rs.getString("mregister"));
		vo.setMadminId(rs.getString("madminid"));
		vo.setmName(rs.getString("mname"));
		vo.setmCeo(rs.getString("mceo"));
		vo.setmBusinessType(rs.getString("mbusinesstype"));
		vo.setmBusinessCategory(rs.getString("mbusinesscategory"));
		vo.setmAddress(rs.getString("maddress"));
		vo.setmTel(rs.getString("mtel"));
		vo.setmMobile(rs.getString("mmobile"));
		vo.setmEmail(rs.getString("memail"));
		vo.setmAuthority(rs.getString("mauthority"));
		vo.setmEmployeeNum(rs.getInt("memployeenum"));

		return vo;
	}
}
