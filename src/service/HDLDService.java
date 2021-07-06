package service;

import DAO.HopDongLaoDongDAO;
import Model.HDLD;

public class HDLDService {
	HopDongLaoDongDAO hdldDAO =new HopDongLaoDongDAO();
	public HDLD findById(String id){
		return hdldDAO.findById(id);
	}
	public HDLD findByMaNhanVien(String maNhanVien){
		return hdldDAO.findByMaNhanVien(maNhanVien);
	}
	public boolean add(HDLD hdLD){
		return hdldDAO.add(hdLD);
	}
	public boolean update(HDLD hdLD){
		return hdldDAO.update(hdLD);
	}
}
