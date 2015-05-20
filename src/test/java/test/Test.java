package test;

import dao.DAO;

public class Test {
	public static void main(String[] args) {
		System.out.println("hello");
		DAO dao= new DAO();
		dao.open();
		dao.begin();
		dao.close();
		
	}
}
