package com.addressbook;

public class AddressBookMain {

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zipCode;
	String phoneNumber;

	AddressBookMain(String firstName, String lastName, String address, String city, String state, int zipCode,
			String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "AddressBookMain [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + "]";
	}

	public static void main(String[] args) {
		AddressBookMain ab = new AddressBookMain("bhushan", "patil", "pune", "pune", "Maharastra", 411019,
				"89758912911");
		System.out.println(ab);
	}
}
