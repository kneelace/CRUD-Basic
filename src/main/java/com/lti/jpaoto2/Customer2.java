package com.lti.jpaoto2;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer_otm_bi2")
public class Customer2 {

	@Id
	@Column(name = "customer_id")
	private Long customerId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "mobile_no")
	private String mobileNo;
	
	
	@OneToMany(mappedBy="customer")

	private List<Address2> addressList;

	public Customer2() {
		super();
	}

	public Customer2(Long customerId, String firstName, String lastName, String mobileNo, List<Address2> addressList) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.addressList = addressList;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public List<Address2> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address2> addressList) {
		this.addressList = addressList;
	}

	@Override
	public String toString() {
		return "Customer \n customerId=" + customerId + ",\t firstName=" + firstName + ", \t lastName=" + lastName
				+ ", \t mobileNo=" + mobileNo + ", \t addressList=" + addressList;
	}

}
