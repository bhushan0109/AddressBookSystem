package com.addressbook;

public class ContactOfPerson {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String zipCode;
	public String phoneNumber;
	public String email;

	public ContactOfPerson(String firstName, String lastName, String address, String city, String state, String zipCode,
			String phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	// Overrides the toString function present in Object class

	@Override
	public String toString() {
		return ("Name : " + firstName + " " + lastName + "\n" + "Address : " + address + ", " + city + ", " + state
				+ "(" + zipCode + ")\n" + "Phone No. " + phoneNumber + "\n" + "Email : " + email);
	}
}