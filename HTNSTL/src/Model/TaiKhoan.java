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
public class TaiKhoan {
    private long stt;
    private String tenDangNhap;
    private String matKhau;
    private String quyen;
	public String getQuyen() {
		return quyen;
	}
	public void setQuyen(String quyen) {
		this.quyen = quyen;
	}
	@Override
	public String toString() {
		return "TaiKhoan [stt=" + stt + ", tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + "]";
	}
	public long getStt() {
		return stt;
	}
	public void setStt(long stt) {
		this.stt = stt;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}


}
