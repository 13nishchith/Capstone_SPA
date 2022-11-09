package com.spa_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Employee")
@SequenceGenerator(name = "seq",initialValue = 2435,allocationSize = 100)
public class Employee {
	
//	Below Variables are the attributes/columns of employee table
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
	@Column(name = "employeeId")
	private int employeeId;
	
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
	
	@Column(name = "bloodGroup")
	@Pattern(regexp = "[A,B,AB,O][ ][Posivite,Negative]+.?",message = "Please enter valid bloodGroup")
	private String bloodGroup;
	
	@Column(name = "emailId")
	@Email(message = "please enter valid emailid")
	private String emailId;
	
	@Column(name = "phoneNo")
	@Pattern(regexp = "[0-9]+.?",message = "Must be 10 digits only")
	@Size(max = 10,min = 10)
	@NotBlank(message = "phoneno field is mandatory")
	private String phoneNo;
	
	@Column(name = "designation")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "please enter valid designation")
	@NotBlank(message = "designation field is mandatory")
	private String designation;
	
	@Column(name = "officeLocation")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Please enter valid officeLocation")
	private String officeLocation;
//	A setter updates the value of a variable, while a getter reads the value of a variable.
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
//	Default constructor is used to provide the default values to the object like 0, null depending on the type.
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Parameterized constructor is used to provide different values to distinct objects.
	public Employee(int employeeId, String firstName,String middleName, String lastName, String bloodGroup, String emailId, String phoneNo, String designation, String officeLocation) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.bloodGroup = bloodGroup;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.designation = designation;
		this.officeLocation = officeLocation;
	}
// toString() method return the employee object in string 
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", bloodGroup=" + bloodGroup + ", emailId=" + emailId + ", phoneNo="
				+ phoneNo + ", designation=" + designation + ", officeLocation=" + officeLocation + "]";
	}

		
}
