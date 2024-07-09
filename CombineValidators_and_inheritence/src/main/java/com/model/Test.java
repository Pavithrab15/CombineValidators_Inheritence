package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
	public static void main(String[] args) {
		
	
	
   Transaction tr= null;
	try(Session ses=HBUtil.getSessionFactory().openSession()){
		tr=ses.beginTransaction();
		Employee e= new Employee();
		e.setName("akash");
		e.setEmail("pavi@gmail");
		Address a=new Address("VSB College","COVAI Road","Karur","Tamilnadu",626106);
		e.setAddr(a);
		a.setEmp(e);
		ses.persist(e);
		tr.commit();
		ses.close();
	
	}
	catch(Exception e) {
		e.printStackTrace();
		}
}
}