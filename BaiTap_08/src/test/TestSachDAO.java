package test;

import java.util.ArrayList;

import dao.SachDAO;
import model.Sach;

public class TestSachDAO {
	public static void main(String[] args) {
		//test insert
		/*
		Sach sach1 = new Sach("LTJV", "Lap trinh Java", 100000, 2022 );
		Sach sach2 = new Sach("LTPT", "Lap trinh Python", 150000, 2021 );
		
		SachDAO.getInstance().insert(sach1);
		
		
		for (int i = 0; i < 100; i++) {
			Sach sach = new Sach("LT"+i, "Lap trinh 0" +i, 10000, 2015);
			SachDAO.getInstance().insert(sach);
		}
		*/
		
		//test update
		/*
		Sach sachUpdate = new Sach("LT0", "Lap trinh update", 50000, 2023);
		SachDAO.getInstance().update(sachUpdate);
		
		*/
		
		//test delete
		/*
		for (int i = 0; i < 100; i++) {
			Sach sach = new Sach("LT"+i, "Lap trinh 0" +i, 10000, 2015);
			SachDAO.getInstance().delete(sach);
		}
		*/
		
		//test get list
		ArrayList<Sach> list = SachDAO.getInstance().selectAll();
		for (Sach sach : list) {
			System.out.println(sach.toString());
		}
		
		//test get by id
		System.out.println("------------------");
		Sach find = new Sach();
		find.setId("LTPT");
		
		Sach sach = SachDAO.getInstance().selectById(find);
		System.out.println(sach);
		
		//test get by condition
		System.out.println("------------------");
		ArrayList<Sach> list2 = SachDAO.getInstance().selectByCondition("giaBan <= 100000");
		for (Sach sach2 : list2) {
			System.out.println(sach2.toString());
		}
	}
}
