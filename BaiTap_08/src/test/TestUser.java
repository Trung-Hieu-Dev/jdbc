package test;

import dao.UserDAO;
import model.User;

public class TestUser {
	public static void main(String[] args) {
		User u1 = new User("u1", "u123", "UUU");
		
		UserDAO.getInstance().insert(u1);
		
		//get user by id
		User u_find = new User();
//		u_find.setUsername("u1");
		
		//sql injection -> hacker
		u_find.setUsername("x\' or 1=1; -- "); //return null -> can not inject
		
		User u2 = UserDAO.getInstance().selectById(u_find);
		System.out.println(u2);
	}
}
