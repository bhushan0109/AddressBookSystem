package com.addressbook;

import java.util.*;

public class AddressBookMain {
	static ContactDetails readDataFromConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details of ContactDetails");
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
		int zipCode = sc.nextInt();
		System.out.println("Enter the contact number...");
		String phoneNumber = sc.next();

		return new ContactDetails(firstName, lastName, address, city, state, zipCode, phoneNumber);
	}

	static ContactDetails editContactDetailsDetails(ContactDetails ContactDetails) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Address");
		ContactDetails.address = sc.next();
		System.out.println("Enter the City");
		ContactDetails.city = sc.next();
		System.out.println("Enter the State");
		ContactDetails.state = sc.next();
		System.out.println("Enter the ZipCode");
		ContactDetails.zipCode = sc.nextInt();
		System.out.println("Enter the contact number...");
		ContactDetails.phoneNumber = sc.next();
		return ContactDetails;

	}

	static ContactDetails deleteContactDetailsDetails(ContactDetails ContactDetails) {

		return null;

	}

	static void menu() {
		ContactDetails ContactDetails = null;
		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ur choice \n 1 : Add \n 2 : Edit \n 3 : Delete \n 4 : Display ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				ContactDetails = readDataFromConsole();
				break;
			case 2:

				System.out.println("Enter the ContactDetails Name to edit details..");
				String firstName = sc.next();
				if (firstName.equals(ContactDetails.firstName)) {
					ContactDetails = editContactDetailsDetails(ContactDetails);
				} else {
					System.out.println(firstName + " is not exists ");
				}
				break;
			case 3:

				System.out.println("Enter the ContactDetails name to Delete the Details");
				String firstName1 = sc.next();
				if (firstName1.equals(ContactDetails.firstName)) {
					ContactDetails = deleteContactDetailsDetails(ContactDetails);
				} else {
					System.out.println(firstName1 + " is not exists ");
				}
				break;

			case 4:
				System.out.println(ContactDetails);
				break;
			default:
				System.out.println("Enter numer from 1 to 4");
			}
		} while (choice < 5);
	}

	public static void main(String[] args) {

		menu();

	}

}