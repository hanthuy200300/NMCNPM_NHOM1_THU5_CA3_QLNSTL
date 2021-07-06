package DAO;

import java.util.List;

import Model.NhanVien;
import mapper.NhanVienMapper;

public class NhanVienDAO extends AbstractDAO implements GenericDAO<NhanVien>{
	
	public boolean add(NhanVien nv) {
		String sql="Insert INTO `nhanvien`(`maNhanVien`, `tenNhanVien`, `maPhongBan`, `hocVan`, `chuyenNganh`, `ngaySinh`, `gioiTinh`, `CMND`, `soDienThoai`, `maChucVu`,`maHDLD`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		return 	update(sql,nv.getMaNhanVien(),nv.getTenNhanVien(),nv.getMaPhongBan(),nv.getHocVan(),nv.getChuyenMon(),nv.getNgaySinh(),nv.getGioiTinh(),nv.getCMND(),nv.getSoDienThoai(),nv.getMaChucVu(),nv.getMaHDLD());

	}
	public List<NhanVien> findAll() {
		String sql= "select * from nhanvien";
		return query(sql, new NhanVienMapper());
	}
	public NhanVien findById(String id) {
		String sql="select * from nhanvien where maNhanVien =? ";
		return query(sql, new NhanVienMapper(),id).isEmpty()?null:query(sql, new  NhanVienMapper(),id).get(0);
	}
	public static void main(String[] args) {
		NhanVienDAO  nhanVienDAO =new NhanVienDAO();
		System.out.println(nhanVienDAO.findById("A006"));
	}
	@Override
	public boolean delete(NhanVien t) {
		String sql = "DELETE FROM `nhanvien` WHERE maNhanVien = ?";
		return update(sql, t.getMaNhanVien());
	}
	@Override
	public boolean update(NhanVien nv) {
		String sql="UPDATE `nhanvien` SET `tenNhanVien`=?,`maPhongBan`=?,`hocVan`=?,`chuyenNganh`=?,`ngaySinh`=?,`gioiTinh`=?,`CMND`=?,`soDienThoai`=?,`maChucVu`=?,`maHDLD`=? WHERE `maNhanVien`=?";
		return 	update(sql,nv.getTenNhanVien(),nv.getMaPhongBan(),nv.getHocVan(),nv.getChuyenMon(),nv.getNgaySinh(),nv.getGioiTinh(),nv.getCMND(),nv.getSoDienThoai(),nv.getMaChucVu(),nv.getMaHDLD(),nv.getMaNhanVien());
	}
}
