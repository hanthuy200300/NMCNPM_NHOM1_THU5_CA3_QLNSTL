package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.PhieuThuChi;

public class PhieuThuChiMapper implements RowMapper<PhieuThuChi> {

	@Override
	public PhieuThuChi mapRow(ResultSet rss) {
		PhieuThuChi phieuThuChi =new PhieuThuChi();
		try {
			phieuThuChi.setMaPhieu(rss.getString("maPhieu"));
			phieuThuChi.setTenChuPhieu(rss.getString("tenChuPhieu"));
			phieuThuChi.setDiaChi(rss.getString("diaChi"));
			phieuThuChi.setLyDo(rss.getString("lyDo"));
			phieuThuChi.setLoaiPhieu(rss.getString("loaiPhieu"));
			phieuThuChi.setThoiGian(rss.getString("thoiGian"));
			phieuThuChi.setTien(rss.getString("tien"));
			return phieuThuChi;
		} catch (SQLException e) {
			return null;
		}
	}

}
