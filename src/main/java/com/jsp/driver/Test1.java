package com.jsp.driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entities.Account;
import com.jsp.entities.Person;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account> list = new ArrayList<Account>();
		
		Account acc = new Account();
		acc.setBankName("SBI");
		acc.setAddress("Marathalli");
		acc.setAcNum(794223879);
		
		Account acc2 = new Account();
		acc2.setBankName("HDFC");
		acc2.setAddress("Bangalore");
		acc2.setAcNum(1267898719);
		
		Account acc3 = new Account();
		acc3.setBankName("Axis");
		acc3.setAddress("Mysore");
		acc3.setAcNum(319823879);
		
		Account acc4 = new Account();
		acc4.setBankName("Axis");
		acc4.setAddress("Mysore");
		acc4.setAcNum(319823879);
		
		list.add(acc);
		list.add(acc2);
		list.add(acc3);
		list.add(acc4);
		
		Person p = new Person();
		p.setName("Rahul");
		p.setLoc("Bangalore");
		p.setAge(22);
		p.setAccounts(list);
		
//		Person p2 = new Person();
//		p2.setName("Raj");
//		p2.setLoc("Bangalore");
//		p2.setAge(22);
//		p2.setAccounts(list);

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction() ;
		et.begin();
//		em.persist(acc); //Commented as we are using Cascade.ALL
//		em.persist(acc2);
//		em.persist(acc3);
		em.persist(p);
//		em.persist(p2);
		et.commit();

	}

}
