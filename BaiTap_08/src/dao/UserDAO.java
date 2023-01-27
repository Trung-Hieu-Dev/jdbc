package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.User;

public class UserDAO implements DAOInterface<User> {
	
	public static UserDAO getInstance() {
		return new UserDAO();
	}

	@Override
	public int insert(User t) {
		int result = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			//using prepare statement to prevent sql injection
			String sql = "INSERT INTO user (username, password, hovaten) "+
					" VALUES (?, ? , ?)";

			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUsername());
			pst.setString(2, t.getPassword());
			pst.setString(3, t.getHovaten());
			
			result = pst.executeUpdate();
			
			if (result > 0) {
				System.out.println("Insert " + result + " successfully");
			} else {
				System.out.println("Insert fail!");
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}

	@Override
	public int update(User t) {
		
		int result = 0;
		
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			String sql = "UPDATE user "+
					 " SET " +
					 ", password= ?"+
					 ", hovaten= ?"+
					 " WHERE username= ?";
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getPassword());
			pst.setString(2, t.getHovaten());
			pst.setString(3, t.getUsername());
			
			result = pst.executeUpdate();
			
			System.out.println(sql);
			
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
	public int delete(User t) {
		
		int result = 0;
		
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			String sql = "DELETE from user "+
					 " WHERE id= ?";
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUsername());
			
			result = pst.executeUpdate();
			
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
	public ArrayList<User> selectAll() {
		ArrayList<User> result = new ArrayList<>();
		
		try {
			
			Connection con = JDBCUtil.getConnection();
			
			String sql = "SELECT * FROM user";
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			System.out.println(sql);
			
			ResultSet rs = pst.executeQuery(sql);
			
			while(rs.next()) {
				
				String username = rs.getString("username");
				String password = rs.getString("password");
				String hovaten = rs.getString("hovaten");
				
				User user = new User(username, password, hovaten);
				result.add(user);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}

	@Override
	public User selectById(User t) {
		User rerult = null;
		
		try {
				
			Connection con = JDBCUtil.getConnection();
			
			String sql = "SELECT * FROM user where username= ?";
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUsername());
			
			System.out.println(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				String hovaten = rs.getString("hovaten");
				
				rerult = new User(username, password, hovaten);
			}

			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return rerult;
	}

	@Override
	public ArrayList<User> selectByCondition(String condition) {
		ArrayList<User> result = new ArrayList<>();
		
		return result;
	}

}
