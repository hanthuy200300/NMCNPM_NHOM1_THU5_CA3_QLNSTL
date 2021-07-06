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
public class HDLD{
    private String idHDLD;
	private String typeHD;
    private int luongCB;
    private double heSoLuong;
    private String ngayBD;
    private String ngayKT;


    public String getTypeHD() {
        return typeHD;
    }

    public void setTypeHD(String typeHD) {
        this.typeHD = typeHD;
    }

   
    
    public int getLuongCB() {
		return luongCB;
	}

	public void setLuongCB(int luongCB) {
		this.luongCB = luongCB;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public HDLD() {
        
    }

    public String getIdHDLD() {
        return idHDLD;
    }



    public String getNgayBD() {
        return ngayBD;
    }

    public String getNgayKT() {
        return ngayKT;
    }

    public void setIdHDLD(String idHDLD) {
        this.idHDLD = idHDLD;
    }



    public void setNgayBD(String ngayBD) {
        this.ngayBD = ngayBD;
    }

    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }

	@Override
	public String toString() {
		return "HDLD [idHDLD=" + idHDLD + ", typeHD=" + typeHD + ", luongCB=" + luongCB + ", heSoLuong=" + heSoLuong
				+ ", ngayBD=" + ngayBD + ", ngayKT=" + ngayKT + "]";
	}
     
    public Object[] toArrayParameter() {
    	Object[] rs = {
    		idHDLD,typeHD,luongCB,heSoLuong,ngayBD,ngayKT
    	};
    	return rs;
    }
}
