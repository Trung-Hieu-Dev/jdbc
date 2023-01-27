package dao;

import java.util.ArrayList;

public interface DAOInterface<T> {
	
	//insert
	public int insert(T t);
	
	//update
	public int update(T t);
	
	//delete
	public int delete(T t);
	
	//list
	public ArrayList<T> selectAll();
	
	//select by id
	public T selectById(T t);
	
	//select by condition
	public ArrayList<T> selectByCondition(String condition);
}
