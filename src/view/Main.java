package view;

import Model.TaiKhoan;

public class Main {
	public static TaiKhoan tk;
	
	public static void main(String[] args) {
		  login();
     
	}
	public static void login() {
		CHECKVALIDView checkvalidView = new CHECKVALIDView();
		checkvalidView.setVisible(true);
		checkvalidView.setLocationRelativeTo(null);
		checkvalidView.setResizable(false);
	}
}
