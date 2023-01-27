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
		
		int result = 0;
		try {
			
			//step 01: create connection
			Connection con = JDBCUtil.getConnection();
			
			//step 02: create statement obj
			Statement st = con.createStatement();
			
			//step 03: create query
			String sql = "INSERT INTO khachhang (hoVaTen, ngaySinh, diaChi) "+
					" VALUES ('"+t.getHoVaTen()+"' , '"+t.getNgaySinh()+"', '"+t.getDiaChi()+"')";
			
			//step 04: executing query
			result = st.executeUpdate(sql);
			
			if (result > 0) {
				System.out.println("Insert " + result + " successfully");
			} else {
				System.out.println("Insert fail!");
			}
			
			//step 05: close connection
			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
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
