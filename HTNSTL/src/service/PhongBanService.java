package service;

import java.util.List;

import DAO.PhongBanDAO;
import Model.PhongBan;

public class PhongBanService {
	PhongBanDAO phongBanDAO =new PhongBanDAO();
	public List<PhongBan> findAll(){
		return phongBanDAO.findAll();
	}
	public boolean add(PhongBan phongBan) {
		return phongBanDAO.add(phongBan);
	}
	public PhongBan findById(String maPhongBan) {
		return phongBanDAO.findById(maPhongBan);
	}
	public PhongBan findByName(String tenPhongBan) {
		return phongBanDAO.findByName(tenPhongBan);
	}
	public boolean delete(String maPhongBan) {
		return phongBanDAO.delete(maPhongBan);
	}
	public boolean update(PhongBan phongBan) {
		return phongBanDAO.update(phongBan);
	}

}
