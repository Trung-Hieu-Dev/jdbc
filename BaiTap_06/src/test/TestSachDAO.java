package test;

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
		
		for (int i = 0; i < 100; i++) {
			Sach sach = new Sach("LT"+i, "Lap trinh 0" +i, 10000, 2015);
			SachDAO.getInstance().delete(sach);
		}
	}
}
