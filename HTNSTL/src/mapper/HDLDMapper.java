package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.HDLD;

public class HDLDMapper implements RowMapper<HDLD>{

	@Override
	public HDLD mapRow(ResultSet rss) {
		// TODO Auto-generated method stub
		HDLD hdld = new HDLD();
		try {
			hdld.setIdHDLD(rss.getString(1));

			hdld.setTypeHD(rss.getString(2));
			hdld.setLuongCB(rss.getInt(3));
			hdld.setHeSoLuong(rss.getDouble(4));
			hdld.setNgayBD(rss.getString(5));
			hdld.setNgayKT(rss.getString(6));
			return hdld;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
			
		}
		
	}

}
