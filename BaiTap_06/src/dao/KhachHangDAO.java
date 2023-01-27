package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhachHang;

public class KhachHangDAO implements DAOInterface<KhachHang> {
	
	public static KhachHangDAO getInstance() {
		return new KhachHangDAO();
	}

	@Override
	public int insert(KhachHang t) {
		
		return 0;
	}

	@Override
	public int update(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
