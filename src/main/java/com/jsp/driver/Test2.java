package com.jsp.driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entities.College;
import com.jsp.entities.University;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<College> clist = new ArrayList<College>();
		
		College c = new College();
		c.setCname("MVJ");
		c.setLoc("Whitefield");
		
		College c2 = new College();
		c2.setCname("CMRIT");
		c2.setLoc("Brookfield");
		
		College c3 = new College();
		c3.setCname("RV");
		c3.setLoc("Bangalore");
		
		clist.add(c);
		clist.add(c2);
		clist.add(c3);
		
		University u = new University();
		u.setUname("VTU");
		u.setUloc("Karnataka");
		u.setColleges(clist);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(u);
		et.commit();

	}

}
