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
public class PhieuThuChi {
	 	private String maPhieu;
	    private String tenChuPhieu;
	    private String diaChi;
	    private String lyDo;
	    private String thoiGian;
	    private String tien;
	    private String loaiPhieu;
		public String getMaPhieu() {
			return maPhieu;
		}
		public void setMaPhieu(String maPhieu) {
			this.maPhieu = maPhieu;
		}
		public String getTenChuPhieu() {
			return tenChuPhieu;
		}
		public void setTenChuPhieu(String tenChuPhieu) {
			this.tenChuPhieu = tenChuPhieu;
		}
		public String getDiaChi() {
			return diaChi;
		}
		public void setDiaChi(String diaChi) {
			this.diaChi = diaChi;
		}
		public String getLyDo() {
			return lyDo;
		}
		public void setLyDo(String lyDo) {
			this.lyDo = lyDo;
		}
		public String getThoiGian() {
			return thoiGian;
		}
		public void setThoiGian(String thoiGian) {
			this.thoiGian = thoiGian;
		}
		public String getTien() {
			return tien;
		}
		public void setTien(String tien) {
			this.tien = tien;
		}
		public String getLoaiPhieu() {
			return loaiPhieu;
		}
		public void setLoaiPhieu(String loaiPhieu) {
			this.loaiPhieu = loaiPhieu;
		}
		@Override
		public String toString() {
			return "PhieuThuChi [maPhieu=" + maPhieu + ", tenChuPhieu=" + tenChuPhieu + ", diaChi=" + diaChi + ", lyDo="
					+ lyDo + ", thoiGian=" + thoiGian + ", tien=" + tien + ", loaiPhieu=" + loaiPhieu + "]";
		}
	    

}
   
   