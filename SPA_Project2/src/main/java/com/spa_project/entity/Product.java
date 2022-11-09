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

@Entity
@Table(name = "Product")
@SequenceGenerator (name = "seq", initialValue = 6454,allocationSize = 100)
public class Product {

//	Below Variables are the attributes/columns of product table
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
	@Column(name = "productId")
	private int productId;
	
	@Column(name = "productName")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Enter valid productname")
	@NotBlank(message = "productname field is mandatory")
	private String productName;
	
	@Column(name = "productCompany")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Please enter valid productCompany")
	private String productCompany;
	
	@Column(name = "productCategory")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Enter valid productcategory")
	@NotBlank(message = "productcategory field is mandatory")
	private String productCategory;
	
	@Column(name = "productType")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Enter valid productType")
	@NotBlank(message = "productType field is mandatory")
	private String productType;
	
	@Column(name = "availability")
	@Pattern(regexp = "[A-Za-z ]+.?",message = "Please enter valid availability name")
	private String availability;
	
	@Column(name = "productQuantity")
	private int productQuantity;
	
	@Column(name = "productPrice" )
	private float productPrice;

//	A setter updates the value of a variable, while a getter reads the value of a variable.
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCompany() {
		return productCompany;
	}

	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
//	Default constructor is used to provide the default values to the object like 0, null depending on the type.
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Parameterized constructor is used to provide different values to distinct objects.
	public Product(int productId, String productName, String productCompany, String productCategory, String productType,
			String availability,int productQuantity, float productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCompany = productCompany;
		this.productCategory = productCategory;
		this.productType = productType;
		this.availability = availability;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCompany=" + productCompany
				+ ", productCategory=" + productCategory + ", productType=" + productType + ", availability="
				+ availability + ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + "]";
	}
	
		
	
	

}
