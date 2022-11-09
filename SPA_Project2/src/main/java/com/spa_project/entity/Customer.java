package com.spa_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Customer")
@SequenceGenerator (name = "seq", initialValue = 3454,allocationSize = 100)
public class Customer {
	
//	Below Variables are the attributes/columns of customer table
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
	@Column(name = "customerId")
	private int customerId;
	
	@Column(name = "firstName")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Please enter valid firstname")
	@NotBlank(message = "firstName field is mandatory")
	private String firstName;
	
	@Column(name = "middleName")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Please enter valid middlename")
	private String middleName;
	
	@Column(name = "lastName")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Please enter valid lastname")
	@NotBlank(message = "lastName field is mandatory")
	private String lastName;
	
	@Column(name = "customerGender")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Please enter valid customerGender")
	private String customerGender;
	
	@Column(name = "customerAge")
	@Max(100)
	@Min(15)
	private int customerAge;
	
	@Column(name = "phoneNo")
	@Pattern(regexp = "[0-9]+.?",message = "Must be 10 digits only")
	@Size(max = 10,min = 10)
	@NotBlank(message = "phoneno field is mandatory")
	private String phoneNo;	
	
	@Column(name = "customerAddress")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Please enter valid address")
	@NotBlank(message = "customeraddress field is mandatory")
	private String customerAddress;
	
	@Column(name = "postalCode")
	@Pattern(regexp = "[0-9]+.?",message = "Please enter valid postalcode")
	private String postalCode;

//	A setter updates the value of a variable, while a getter reads the value of a variable.
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

//	Default constructor is used to provide the default values to the object like 0, null depending on the type.
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
// Parameterized constructor is used to provide different values to distinct objects.
	public Customer(int customerId, String firstName, String middleName, String lastName, String customerGender, int customerAge, String phoneNo, String customerAddress, String postalCode) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.customerGender = customerGender;
		this.customerAge = customerAge;
		this.phoneNo = phoneNo;
		this.customerAddress = customerAddress;
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", customerGender=" + customerGender + ", customerAge=" + customerAge
				+ ", phoneNo=" + phoneNo + ", customerAddress=" + customerAddress + ", postalCode=" + postalCode + "]";
	}
	
	
}
