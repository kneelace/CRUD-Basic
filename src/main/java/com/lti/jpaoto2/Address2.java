package com.lti.jpaoto2;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address_otm_bi2")
public class Address2 {

	@Id
	@Column(name = "address_id")
	private Long addressId;

	@Column(name = "add_line1")
	private String addLine1;
	
	@Column(name = "add_line2")
	private String addLine2;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "pincode")
	private String pincode;
	
	@Column(name = "country")
	private String country;

	public Customer2 getCustomer() {
		return customer;
	}

	public void setCustomer(Customer2 customer) {
		this.customer = customer;
	}

	@ManyToOne(cascade=CascadeType.ALL,targetEntity=Customer2.class)
	@JoinColumn(name = "customer_id")
	private Customer2 customer;

	public Address2(Long addressId, String addLine1, String addLine2, String city, String state, String pincode,
			String country) {
		super();
		this.addressId = addressId;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}

	public Address2() {
		super();
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddLine2() {
		return addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address addressId=" + addressId + ", "+ addLine1 + "," + addLine2 + ","
				+ city + ", " + state + "," + pincode + "," + country;
	}

}
