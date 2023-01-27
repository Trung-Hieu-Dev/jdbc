package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Sach;

public class SachDAO implements DAOInterface<Sach> {
	
	public static SachDAO getInstance() {
		return new SachDAO();
	}

	@Override
	public int insert(Sach t) {
		int result = 0;
		try {
			
			//step 01: create connection
			Connection con = JDBCUtil.getConnection();
			
			//step 02: create statement obj
			Statement st = con.createStatement();
			
			//step 03: create query
			String sql = "INSERT INTO sach (id, tenSach, giaBan, namXuatBan) "+
					" VALUES ('"+t.getId()+"' , '"+t.getTenSach()+"' , "+ t.getGiaBan()+" , '"+t.getNamXuatBan()+"')";
			
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
	public int update(Sach t) {
		
		int result = 0;
		
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "UPDATE sach "+
					 " SET " +
					 " tenSach='"+ t.getTenSach()+"'"+
					 ", giaBan="+ t.getGiaBan()+
					 ", namXuatBan="+ t.getNamXuatBan()+
					 " WHERE id='"+t.getId()+"\'";
			
			result = st.executeUpdate(sql);
			
			if (result > 0) {
				System.out.println("Update " + result + " successfully");
			} else {
				System.out.println("Update fail!");
			}
			
			JDBCUtil.closeConnection(con);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}

	@Override
	public int delete(Sach t) {
		
		int result = 0;
		
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "DELETE from sach "+
					 " WHERE id='"+t.getId()+"'";
			
			result = st.executeUpdate(sql);
			
			if (result > 0) {
				System.out.println("Delete " + result + " successfully");
			} else {
				System.out.println("Delete fail!");
			}
			
			JDBCUtil.closeConnection(con);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		ArrayList<Sach> result = new ArrayList<>();
		
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "SELECT * FROM sach";
			
			System.out.println(sql);
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				float giaBan = rs.getFloat("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");
				
				Sach sach = new Sach(id, tenSach, giaBan, namXuatBan);
				result.add(sach);
			}
			
			// Bước 5:
			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}

	@Override
	public Sach selectById(Sach t) {
		Sach rerult = null;
		
		try {
				
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "SELECT * FROM sach where id='"+t.getId()+"'";
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				float giaBan = rs.getFloat("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");
				
				rerult = new Sach(id, tenSach, giaBan, namXuatBan);
			}

			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return rerult;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condition) {
		ArrayList<Sach> result = new ArrayList<>();
		
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql = "SELECT * FROM sach where "+ condition;
			
			System.out.println(sql);
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				float giaBan = rs.getFloat("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");
				
				Sach sach = new Sach(id, tenSach, giaBan, namXuatBan);
				result.add(sach);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}

}
