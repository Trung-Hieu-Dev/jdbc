package test;

import java.sql.Connection;

import database.JDBCUtil;

public class TestJDBCUtil {
	public static void main(String[] args) {
		Connection connection = JDBCUtil.getConnection();
		
		JDBCUtil.getInfo(connection);
		
		JDBCUtil.closeConnection(connection);
		
		
	}
}
