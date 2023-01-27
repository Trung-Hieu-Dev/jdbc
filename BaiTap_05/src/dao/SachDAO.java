package dao;

import java.util.ArrayList;

import model.Sach;

public class SachDAO implements DAOInterface<Sach> {
	
	public static SachDAO getInstance() {
		return new SachDAO();
	}

	@Override
	public int insert(Sach t) {
		return 0;
	}

	@Override
	public int update(Sach t) {
		return 0;
	}

	@Override
	public int delete(Sach t) {
		return 0;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		return null;
	}

	@Override
	public Sach selectById(Sach t) {
		return null;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condition) {
		return null;
	}

}
