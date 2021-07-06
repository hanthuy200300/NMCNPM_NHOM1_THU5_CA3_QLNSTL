package service;

import java.util.List;

import DAO.TaiKhoanDAO;
import Model.TaiKhoan;

public class TaiKhoanService {
	TaiKhoanDAO taiKhoanDAO=new TaiKhoanDAO();
	public TaiKhoan findByUsernameAndPassword(String tendangnhap,String matkhau) {
		return taiKhoanDAO.findByUsernameAndPassword(tendangnhap,matkhau);
	}
	public TaiKhoan findByUsername(String tendangnhap) {
		return taiKhoanDAO.findByUsername(tendangnhap);
	}
	public List<TaiKhoan> findAll(){
		return taiKhoanDAO.findAll();
	}
	public boolean add(TaiKhoan t) {
		return taiKhoanDAO.add(t);
	}
	public boolean delete(TaiKhoan t) {
		return taiKhoanDAO.delete(t);
	}
	public boolean update(TaiKhoan t) {
		return taiKhoanDAO.update(t);
	}
}
