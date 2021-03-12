package Banking;

import javax.swing.Spring;

/**
 * Represents a customer for a bank
 * @author Abdoulsalam
 *
 */
public class Customer {
	
	//instance varsw
	
	/**
	 * Name of customer
	 */
	String name;
	
	String address;
	
	//constructor 
	
	/**
	 * Creates a customer with the given name.
	 * @paren name of customer
	 */
	public Customer(String name) {
		//sets instance var name to given name
		this.name = name;
	}
	
	//methods
	/**
	 * Sets the address of customer to be given address.
	 * @param address for customer
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	 public String getName() {
		 return this.name;
	 }
	 /**
	  * Returns customer's address
	  * @return address of customer
	  */
	 public String getAddress() {
		 return this.address;
	 }
	
}
