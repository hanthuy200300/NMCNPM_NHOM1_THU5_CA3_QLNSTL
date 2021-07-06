package DAO;

import java.util.List;

import Model.Luong;
import mapper.LuongMapper;

public class LuongDAO extends AbstractDAO implements GenericDAO<Luong> {
	public void addList(List<Luong> list) {
		String sql="INSERT INTO `luong`(`maNhanVien`, `luongCB`, `heSoLuong`, `tienThuong`, `luongUng`, `tienPhat`, `tongLuong`) VALUES (?,?,?,?,?,?,?)";
		for(Luong luong : list) {
			update(sql, luong.toArrayParameter());
		}
	}
	public List<Luong> findAll(){
		String sql="select * from luong";
		return query(sql, new LuongMapper());
	}
	public Luong findByMaNhanVien(String maNhanVien){
		String sql="select * from luong where maNhanVien=? ";
		return query(sql, new LuongMapper(),maNhanVien).isEmpty()?null:query(sql, new LuongMapper(),maNhanVien).get(0);
	}
	@Override
	public boolean add(Luong luong) {
		String sql="INSERT INTO `luong`(`maNhanVien`, `luongCB`, `heSoLuong`, `tienThuong`, `luongUng`, `tienPhat`, `tongLuong`) VALUES (?,?,?,?,?,?,?)";
		return 	update(sql, luong.toArrayParameter());
	}
	@Override
	public boolean delete(Luong luong) {
		String sql="Delete from `luong` where `maNhanVien`= ?";
		return update(sql,luong.getIdNhanVien());
	}

	@Override
	public boolean update(Luong t) {
		String sql ="UPDATE `luong` SET `tienThuong`=?,`luongUng`=?,`tienPhat`=?,`tongLuong`=? WHERE `maNhanVien`=?";
		return update(sql,t.getTienThuong(),t.getLuongUng(),t.getTienPhat(),t.getTongLuong(),t.getIdNhanVien());
	}
	public List<Luong> findLuongByPhongBan(String maPhongBan) {
		String sql="SELECT * FROM `luong`,`nhanvien` WHERE `luong`.`maNhanVien`=`nhanvien`.`maNhanVien` AND `nhanvien`.`maPhongBan`=?";
		return query(sql, new LuongMapper(), maPhongBan);
	}

}
