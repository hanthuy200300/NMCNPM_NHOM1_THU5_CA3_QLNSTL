package DAO;

import java.util.List;

import Model.ChucVu;
import mapper.ChucVuMapper;

public class ChucVuDAO extends AbstractDAO {
	public List<ChucVu> findAll() {
		String sql ="Select * from chucvu";
		return query(sql, new ChucVuMapper());
	}
	public ChucVu findById(String maChucVu) {
		String sql="Select * from chucvu where maChucVu= ?";
		return query(sql, new ChucVuMapper(),maChucVu).isEmpty()?null:query(sql, new ChucVuMapper(),maChucVu).get(0);
	}
	public ChucVu findByName(String tenChucVu) {
		String sql="Select * from chucvu where tenChucVu= ?";
		return query(sql, new ChucVuMapper(),tenChucVu).isEmpty()?null:query(sql, new ChucVuMapper(),tenChucVu).get(0);
	}
	

}
