package service;

import java.util.List;

import DAO.ChucVuDAO;
import Model.ChucVu;

public class ChucVuService {
	ChucVuDAO chucVuDAO = new ChucVuDAO();
	public List<ChucVu> findAll() {
		return chucVuDAO.findAll();
	}
	public ChucVu findById(String maChucVu) {
		return chucVuDAO.findById(maChucVu);
	}
	public ChucVu findByName(String tenChucVu) {
		return chucVuDAO.findByName(tenChucVu);
	}

}
