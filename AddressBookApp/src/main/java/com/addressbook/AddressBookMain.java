package com.addressbook;

import java.util.*;

public class AddressBookMain {
	ArrayList<ContactOfPerson> al = null;

	AddressBookMain() {
		al = new ArrayList<>();
	}

	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details of person Details");
		System.out.println("Enter the first name");
		String firstName = sc.next();
		System.out.println("Enter the Last name");
		String lastName = sc.next();
		System.out.println("Enter the Address");
		String address = sc.next();
		System.out.println("Enter the City");
		String city = sc.next();
		System.out.println("Enter the State");
		String state = sc.next();
		System.out.println("Enter the ZipCode");
		String zipCode = sc.next();
		System.out.println("Enter the contact number...");
		String phoneNumber = sc.next();
		System.out.println("Enter your email id...");
		String email = sc.next();

		al.add(new ContactOfPerson(firstName, lastName, address, city, state, zipCode, phoneNumber, email));
	}

	public void edit(ContactOfPerson ContactDetails) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Address");
		ContactDetails.address = sc.next();
		System.out.println("Enter the City");
		ContactDetails.city = sc.next();
		System.out.println("Enter the State");
		ContactDetails.state = sc.next();
		System.out.println("Enter the ZipCode");
		ContactDetails.zipCode = sc.next();
		System.out.println("Enter the contact number...");
		ContactDetails.phoneNumber = sc.next();

	}

	public void delete(ContactOfPerson Contact) {

		al.remove(Contact);

	}

}
