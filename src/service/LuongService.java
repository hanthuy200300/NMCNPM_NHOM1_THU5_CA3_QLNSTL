package service;

import java.util.List;

import DAO.LuongDAO;
import Model.Luong;

public class LuongService {
	LuongDAO luongDAO = new LuongDAO();
	public List<Luong> findAll(){
		return luongDAO.findAll();
	}
	public boolean add(Luong luong) {
		return luongDAO.add(luong);
	}
	public boolean delete(Luong luong) {
		return luongDAO.delete(luong);
	}
	public Luong findByMaNhanVien(String maNhanVien) {
		return luongDAO.findByMaNhanVien(maNhanVien);
	}
	public boolean update(Luong luong) {
		return luongDAO.update(luong);
	}
	public long findTongLuongByPhongBan(String maPhongBan) {
		List<Luong> luongByPhongBan=luongDAO.findLuongByPhongBan(maPhongBan);
    	long tongLuong=0;
    	for (Luong luong : luongByPhongBan) {
			tongLuong += luong.getTongLuong();
		}
		return tongLuong;
	}
}
