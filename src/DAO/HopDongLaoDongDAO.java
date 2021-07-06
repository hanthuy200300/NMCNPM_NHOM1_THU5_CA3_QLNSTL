package DAO;

import Model.HDLD;
import mapper.HDLDMapper;

public class HopDongLaoDongDAO extends AbstractDAO implements GenericDAO<HDLD> {

	public boolean add(HDLD hdld) {
		String sql = "INSERT INTO `hopdonglaodong`(`maHDLD`, `loaiHD`, `luongCB`, `heSoLuong`, `ngayBD`, `ngayKT`) VALUES (?,?,?,?,?,?)";
		return update(sql, hdld.getIdHDLD(), hdld.getTypeHD(), hdld.getLuongCB(), hdld.getHeSoLuong(), hdld.getNgayBD(),
				hdld.getNgayKT());

	}

	public HDLD findById(String id) {
		String sql = "select * from hopdonglaodong where maHDLD='" + id + "'";
		return query(sql, new HDLDMapper()).isEmpty() ? null : query(sql, new HDLDMapper()).get(0);
	}

	public HDLD findByMaNhanVien(String maNhanVien) {
		String sql = "select * from hopdonglaodong where maNhanVien='" + maNhanVien + "'";
		return query(sql, new HDLDMapper()).isEmpty() ? null : query(sql, new HDLDMapper()).get(0);
	}

	@Override
	public boolean delete(HDLD t) {
		return false;
	}

	@Override
	public boolean update(HDLD t) {
		// TODO Auto-generated method stub
		return false;
	}

}
