package com.spa_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Producer")
@SequenceGenerator (name = "seq", initialValue = 5434,allocationSize = 100)
public class Producer {

//	Below Variables are the attributes/columns of producer table
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
	@Column(name = "producerId")
	private int producerId;
	
	@Column(name = "firstName")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Please enter valid firstname")
	@NotBlank(message = "firstName field is mandatory")
	private String firstName;
	
	@Column(name = "lastName")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Please enter valid lastname")
	@NotBlank(message = "lastName field is mandatory")
	private String lastName;
	
	@Column(name = "companyName")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Please enter valid companyName")
	private String companyName;
	
	@Column(name = "productName")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Enter valid productname")
	@NotBlank(message = "productname field is mandatory")
	private String productName;
	
	@Column(name = "productPrice")
	private float productPrice;
	
	@Column(name = "phoneNo")
	@Pattern(regexp = "[0-9]+.?",message = "Must be 10 digits only")
	@Size(max = 10,min = 10)
	@NotBlank(message = "phoneno field is mandatory")
	private String phoneNo;
	
	@Column(name = "address")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Enter valid address")
	@NotBlank(message = "address field is mandatory")
	private String address;
	
	@Column(name = "stateCode")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Enter valid statecode")
	private String stateCode;
	
//	A setter updates the value of a variable, while a getter reads the value of a variable.
	public int getProducerId() {
		return producerId;
	}

	public void setProducerId(int producerId) {
		this.producerId = producerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
//	Default constructor is used to provide the default values to the object like 0, null depending on the type.
	public Producer() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Parameterized constructor is used to provide different values to distinct objects.
	public Producer(int producerId,String firstName, String companyName, String lastName, String productName,
			float productPrice, String phoneNo, String address, String stateCode) {
		super();
		this.producerId = producerId;
		this.firstName = firstName;
		this.companyName = companyName;
		this.lastName = lastName;
		this.productName = productName;
		this.productPrice = productPrice;
		this.phoneNo = phoneNo;
		this.address = address;
		this.stateCode = stateCode;
	}

	@Override
	public String toString() {
		return "Producer [producerId=" + producerId + ", firstName=" + firstName + ", companyName=" + companyName
				+ ", lastName=" + lastName + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", phoneNo=" + phoneNo + ", Address=" + address + ", stateCode=" + stateCode + "]";
	}
	
		
	

}
