package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.TaiKhoan;

public class TaiKhoanMapper implements RowMapper<TaiKhoan> {

	@Override
	public TaiKhoan mapRow(ResultSet rss) {
		TaiKhoan tk =new TaiKhoan();
		try {
			tk.setStt(rss.getLong(1));
			tk.setTenDangNhap(rss.getString(2));
			tk.setMatKhau(rss.getString(3));
			tk.setQuyen(rss.getString(4));
			return tk;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error when map taikhoan :"+e.getMessage());
			return null;
		}
		
		
	}

}
