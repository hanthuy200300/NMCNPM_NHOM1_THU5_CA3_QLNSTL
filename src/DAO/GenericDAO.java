package DAO;

public interface GenericDAO<T>{
	boolean add(T t);
	boolean delete(T t);
	boolean update(T t);
	

}
