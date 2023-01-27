package test;

import java.sql.Date;

import dao.KhachHangDAO;
import model.KhachHang;

public class TestKhachHangDAO {
	public static void main(String[] args) {
		Date d1 = new Date(1987, 5, 10);
		
		KhachHang kh = new KhachHang("Trung Hieu", d1, "HCM");
		
		KhachHangDAO.getInstance().insert(kh);
	}
}
