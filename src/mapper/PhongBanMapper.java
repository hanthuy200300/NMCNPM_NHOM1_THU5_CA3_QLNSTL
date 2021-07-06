package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.PhongBan;

public class PhongBanMapper implements RowMapper<PhongBan>{

	@Override
	public PhongBan mapRow(ResultSet rss) {
		PhongBan phongBan =new PhongBan();
		try {
			phongBan.setMaPhongBan(rss.getString(1));
			phongBan.setTenPhongBan(rss.getString(2));
			return phongBan;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error when map phongban : "+e.getMessage());
			return null;
		}
	}
	

}
