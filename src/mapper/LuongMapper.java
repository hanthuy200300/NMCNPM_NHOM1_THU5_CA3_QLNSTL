package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Luong;

public class LuongMapper implements RowMapper<Luong> {

	@Override
	public Luong mapRow(ResultSet rss) {
		Luong luong =new Luong();
		try {
			luong.setIdNhanVien(rss.getString("maNhanVien"));
			luong.setLuongCb(rss.getInt("luongCB"));
			luong.setHsLuong(rss.getDouble("heSoLuong"));
			luong.setTienThuong(rss.getInt("tienThuong"));
			luong.setLuongUng(rss.getInt("luongUng"));
			luong.setTienPhat(rss.getInt("tienPhat"));
			luong.setTongLuong(rss.getLong("tongLuong"));
			return luong;
		} catch (SQLException e) {
			System.out.println("Error when map luong:"+e.getMessage());
			return null;		
		}
		// TODO Auto-generated method stub
		
	}
	

}
