package DAO;

import java.util.List;

import Model.TaiKhoan;
import mapper.TaiKhoanMapper;

public class TaiKhoanDAO extends AbstractDAO implements GenericDAO<TaiKhoan>{
	
	public List<TaiKhoan> findAll(){
		String sql="select * from taikhoan";
		return query(sql, new TaiKhoanMapper());
	}
	public TaiKhoan findByUsernameAndPassword(String tendangnhap,String matkhau) {
		String sql="Select * from taikhoan where tenDangNhap= ? and matkhau = ?";
		return query(sql, new TaiKhoanMapper(), tendangnhap,matkhau).isEmpty()?null:query(sql, new TaiKhoanMapper(), tendangnhap,matkhau).get(0);
	}
	public TaiKhoan findByUsername(String tendangnhap) {
		String sql="Select * from taikhoan where tenDangNhap= ? ";
		return query(sql, new TaiKhoanMapper(), tendangnhap).isEmpty()?null:query(sql, new TaiKhoanMapper(), tendangnhap).get(0);
	} 
	@Override
	public boolean add(TaiKhoan t) {
		String sql ="INSERT INTO `taikhoan`( `tendangnhap`, `matkhau`, `quyen`) VALUES (?,?,?)";
		return update(sql, t.getTenDangNhap(),t.getMatKhau(),t.getQuyen());
	}
	@Override
	public boolean delete(TaiKhoan t) {
		String sql ="DELETE FROM `taikhoan` WHERE `stt`=?";		
		return update(sql, t.getStt());
	}
	@Override
	public boolean update(TaiKhoan t) {
		String sql ="UPDATE `taikhoan` SET `tendangnhap`=?,`matkhau`=?,`quyen`=? WHERE `stt`=?";		
		return update(sql, t.getTenDangNhap(),t.getMatKhau(),t.getQuyen(),t.getStt());
	}
}
