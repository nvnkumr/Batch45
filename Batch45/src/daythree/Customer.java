package daythree;

public class Customer {
	
	private int customerId;
	private String customerCity;
	private String customerName;
	
	public Customer() {//Default Constructor
		System.out.println("Default constructor");
	}
	
	
	public Customer(int customerId,String customerName,String customerCity) {//Parameterized constructor
		this();
		System.out.println("parameterized Constructor");
		this.customerName = customerName;
		this.customerId= customerId;
		this.customerCity = customerCity;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerCity() {
		return customerCity;
	}


	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerCity=" + customerCity + ", customerName="
				+ customerName + ", getCustomerId()=" + getCustomerId() + ", getCustomerCity()=" + getCustomerCity()
				+ ", getCustomerName()=" + getCustomerName() + "]";
	}
	
	

}
