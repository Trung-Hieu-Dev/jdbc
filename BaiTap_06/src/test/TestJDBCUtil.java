package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUtil;

public class TestJDBCUtil {
	public static void main(String[] args) {
		try {
			//step 01: create connection
			Connection connection = JDBCUtil.getConnection();
			
			//step 02: create statement object
			Statement st = connection.createStatement();
			
			//step03: create statement query
			String sql = "INSERT INTO persons(last_name, first_name, gender, dob, income)"
					+ "VALUES (\"Tran\", \"Thi C\", \"M\", \"2000-09-10\", 10000000)";
			
			//step 04: handling result
			int check = st.executeUpdate(sql);
			
			System.out.println("Số dòng thay đổi: "+ check);
			
			if (check > 0) {
				System.out.println("Successfully");
			} else {
				System.out.println("Fail");
			}
			
			//step 05: close connection
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
