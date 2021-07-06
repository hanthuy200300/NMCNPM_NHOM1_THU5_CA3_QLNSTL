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
public class Luong {
    private String idNhanVien;
    private int luongCb;
    private double hsLuong;
    private int tienThuong;
    private int luongUng;
    private int tienPhat;
    private long tongLuong;


    public Luong() {
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }


  
    
    public int getLuongCb() {
		return luongCb;
	}

	public void setLuongCb(int luongCb) {
		this.luongCb = luongCb;
	}

	public double getHsLuong() {
		return hsLuong;
	}

	public void setHsLuong(double hsLuong) {
		this.hsLuong = hsLuong;
	}

	public int getTienThuong() {
		return tienThuong;
	}

	public void setTienThuong(int tienThuong) {
		this.tienThuong = tienThuong;
	}

	public int getLuongUng() {
		return luongUng;
	}

	public void setLuongUng(int luongUng) {
		this.luongUng = luongUng;
	}

	public int getTienPhat() {
		return tienPhat;
	}

	public void setTienPhat(int tienPhat) {
		this.tienPhat = tienPhat;
	}

	public long getTongLuong() {
		return tongLuong;
	}

	public void setTongLuong(long tongLuong) {
		this.tongLuong = tongLuong;
	}

	public Object[] toArrayParameter() {
    	Object[] rs = {
    			 idNhanVien, luongCb, hsLuong,tienThuong, luongUng, tienPhat, tongLuong    	};
    	return rs;
    }

	@Override
	public String toString() {
		return "Luong [idNhanVien=" + idNhanVien + ", luongCb=" + luongCb + ", hsLuong=" + hsLuong + ", tienThuong="
				+ tienThuong + ", luongUng=" + luongUng + ", tienPhat=" + tienPhat + ", tongLuong=" + tongLuong + "]";
	}
   
    
}
