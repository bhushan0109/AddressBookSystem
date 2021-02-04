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

	// generate getter setter
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return ("Name : " + firstName + " " + lastName + "\n" + "Address : " + address + ", " + city + ", " + state
				+ "(" + zipCode + ")\n" + "Phone No. " + phoneNumber + "\n" + "Email : " + email);
	}
	//display method
	public void display() {
		System.out.println("------------------------ADDRESS BOOK-----------------------");

		System.out.println("Person details are :");

		System.out.println("FirstName is :				 " + firstName);
		System.out.println("LastName is  : 		 		 " + lastName);
		System.out.println("Address is   : 				 " + address);
		System.out.println("City is     : 				 " + city);
		System.out.println("state is   : 				 " + state);
		System.out.println("State is     : 				 " + state);
		System.out.println("Zipcode is   : 				 " + zipCode);
		System.out.println("tphone is     : 			" + phoneNumber);
		System.out.println("email id is     : 			 " + email);
	}
}
