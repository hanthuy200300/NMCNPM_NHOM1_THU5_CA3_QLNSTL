package service;

import java.util.List;

import DAO.NhanVienDAO;
import Model.NhanVien;

public class NhanVienService {
	NhanVienDAO nhanVienDAO =new NhanVienDAO();
	public List<NhanVien> findAll(){
		return nhanVienDAO.findAll();
	}
	public NhanVien findById(String id){
		return nhanVienDAO.findById(id);
	}
	public boolean add(NhanVien nv) {
		return nhanVienDAO.add(nv);
	}
	public boolean delete(NhanVien nv) {
		return nhanVienDAO.delete(nv);
	}
	public boolean update(NhanVien nv) {
		return nhanVienDAO.update(nv);
	}
}
