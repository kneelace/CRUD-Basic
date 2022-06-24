package com.lti.jpaotoui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.lti.util.JPAUtil;

public class OtoClient3 {

	static EntityManager entityManager = JPAUtil.getEntityManager();

	public static void otoMain3(String[] args) {

		Scanner sc = new Scanner(System.in);

		EntityTransaction tx = entityManager.getTransaction();
				
				Address3 address3 = new Address3();
				address3.setAddressId(101L);
				address3.setAddLine1("101 ");
				address3.setAddLine2("Block 1 LTI");
				address3.setCity("Navi Mumbai");
				address3.setState("Maharashtra");
				address3.setCountry("Pakistan");
				address3.setPincode("400001");
				
				
				Customer3 customer3 = new Customer3();
				customer3.setCustomerId(001L);
				customer3.setFirstName("Priya");
				customer3.setLastName("Zutshi");
				customer3.setMobileNo("98764563120");
				customer3.setAddress(address3);
				
				tx.begin();
				
				entityManager.persist(customer3);
				
				tx.commit();
				
				entityManager.close();
				

		
	}
}
