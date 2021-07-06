package DAO;

import java.util.List;

import Model.PhongBan;
import mapper.PhongBanMapper;

public class PhongBanDAO extends AbstractDAO {
	public void addList(List<PhongBan> list) {
		String sql="INSERT INTO `phongban`(`maPhongBan`, `tenPhongBan`)  VALUES (?,?)";
		for(PhongBan luong : list) {
			update(sql, luong.getMaPhongBan(),luong.getTenPhongBan());
		}
	}
	public List<PhongBan> findAll(){
		String sql="select * from phongban";
		return query(sql, new PhongBanMapper());
	}
	public boolean add(PhongBan phongBan) {
		String sql="INSERT INTO `phongban`(`maPhongBan`, `tenPhongBan`) VALUES (?,?)";
		return update(sql, phongBan.getMaPhongBan(),phongBan.getTenPhongBan());
	}
	public PhongBan findById(String maPhongBan) {
		String sql="select * from phongban where maPhongBan = ?";
		return query(sql, new PhongBanMapper(), maPhongBan).isEmpty()?null:query(sql, new PhongBanMapper(), maPhongBan).get(0);
	}
	public PhongBan findByName(String tenPhongBan) {
		String sql="select * from phongban where tenPhongBan = ?";
		return query(sql, new PhongBanMapper(), tenPhongBan).isEmpty()?null:query(sql, new PhongBanMapper(), tenPhongBan).get(0);
	}
	public boolean delete(String maPhongBan) {
		String sql = "DELETE FROM `phongban` WHERE `maPhongBan` = ?";
		return update(sql, maPhongBan);
	}
	public boolean update(PhongBan phongBan) {
		String sql="UPDATE `phongban` SET `tenPhongBan`=? WHERE `maPhongBan`=?";
		return update(sql,phongBan.getTenPhongBan(),phongBan.getMaPhongBan() );
	}
}
