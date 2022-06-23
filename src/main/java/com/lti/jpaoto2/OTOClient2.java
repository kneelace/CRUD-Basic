package com.lti.jpaoto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.lti.util.JPAUtil;

public class OTOClient2 {

	private static EntityManager entityManager = JPAUtil.getEntityManager();

	public void OtoClient2(String[] args) {
		Scanner sc = new Scanner(System.in);

		EntityTransaction tx = entityManager.getTransaction();
				
				Address2 address = new Address2();
				address.setAddressId(1562L);
				address.setAddLine1("101 ");
				address.setAddLine2("Block 1 LTI");
				address.setCity("Navi Mumbai");
				address.setState("Maharashtra");
				address.setCountry("Pakistan");
				address.setPincode("400001");
				
				Address2 address1 = new Address2();
				address1.setAddressId(1276L);
				address1.setAddLine1("101 ");
				address1.setAddLine2("Block 1 LTI");
				address1.setCity("Navi Mumbai");
				address1.setState("Maharashtra");
				address1.setCountry("Pakistan");
				address1.setPincode("400001");
				
				List<Address2> addressList = new ArrayList<>();
				addressList.add(address1);
				addressList.add(address);
				
				Customer2 customer = new Customer2();
				customer.setCustomerId(00423L);
				customer.setFirstName("Priya");
				customer.setLastName("Zutshi");
				customer.setMobileNo("98764563120");
				customer.setAddressList(addressList);

				address.setCustomer(customer);
				address1.setCustomer(customer);
				
				tx.begin();
				
				entityManager.persist(address);
				entityManager.persist(address1);
				entityManager.persist(customer);
				
				tx.commit();
				
				entityManager.close();
				
				System.out.println(customer);
		
	}
}
