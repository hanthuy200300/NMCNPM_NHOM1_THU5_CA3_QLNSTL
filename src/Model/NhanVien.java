/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author asus
 */
public class NhanVien{
    private String maNhanVien;
    private String tenNhanVien;
    private String ngaySinh;
    private String gioiTinh;
    private String soDienThoai; 
    private String hocVan;
    private String chuyenMon;
    private String CMND;
    private String maPhongBan;
    private String maHDLD;
    private String maChucVu;
    private ChucVu chucvu;    

    
	public String getMaChucVu() {
		return maChucVu;
	}
	public void setMaChucVu(String maChucVu) {
		this.maChucVu = maChucVu;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getHocVan() {
		return hocVan;
	}
	public void setHocVan(String hocVan) {
		this.hocVan = hocVan;
	}
	public String getChuyenMon() {
		return chuyenMon;
	}
	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public String getMaPhongBan() {
		return maPhongBan;
	}
	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}
	public ChucVu getChucVu() {
		return chucvu;
	}
	public void setChucVu(ChucVu chucvu) {
		this.chucvu = chucvu;
	}
	public String getMaHDLD() {
		return maHDLD;
	}
	public void setMaHDLD(String maHDLD) {
		this.maHDLD = maHDLD;
	}
	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", ngaySinh=" + ngaySinh
				+ ", gioiTinh=" + gioiTinh + ", soDienThoai=" + soDienThoai + ", hocVan=" + hocVan + ", chuyenMon="
				+ chuyenMon + ", CMND=" + CMND + ", maPhongBan=" + maPhongBan + ", chucvu=" + chucvu + ", maHDLD=" + maHDLD
				+ "]";
	}
	  public Object[] toArrayParameter() {
	    	Object[] rs = {
	    			maNhanVien,tenNhanVien,ngaySinh,gioiTinh,soDienThoai,hocVan,chuyenMon,CMND,maPhongBan,maChucVu,maHDLD
	    	};
	    	return rs;
	    }
}
