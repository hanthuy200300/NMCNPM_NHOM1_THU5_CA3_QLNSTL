package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.ChucVu;

public class ChucVuMapper implements RowMapper<ChucVu> {

	@Override
	public ChucVu mapRow(ResultSet rss) {
		ChucVu chucVu =new ChucVu();
		try {
			chucVu.setMaChucVu(rss.getString(1));
			chucVu.setTenChucVu(rss.getString(2));
			return chucVu;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

}
