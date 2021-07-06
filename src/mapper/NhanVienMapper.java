package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.NhanVien;

public class NhanVienMapper implements RowMapper<NhanVien>{

	@Override
	public NhanVien mapRow(ResultSet rss) {
		NhanVien nv = new NhanVien();
		try {
			nv.setMaNhanVien(rss.getString("maNhanVien"));
			nv.setTenNhanVien(rss.getString("tenNhanVien"));
			nv.setNgaySinh(rss.getString("ngaySinh"));
			nv.setGioiTinh(rss.getString("gioiTinh"));
			nv.setHocVan(rss.getString("hocVan"));
			nv.setChuyenMon(rss.getString("chuyenNganh"));
			nv.setMaHDLD(rss.getString("maHDLD"));
			nv.setSoDienThoai(rss.getString("soDienThoai"));
			nv.setCMND(rss.getString("CMND"));
			nv.setMaChucVu(rss.getString("maChucVu"));
			nv.setMaPhongBan(rss.getString("maPhongBan"));
			return nv;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
	
	}
	
}
