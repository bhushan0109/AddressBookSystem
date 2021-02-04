package com.addressbook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class AddressBookMain<linkedList> implements AddressBook {
	Scanner scanner = new Scanner(System.in);
	ContactOfPerson ContactOfPerson = new ContactOfPerson();
	// implement the linkedlist and hashmap
	LinkedList<ContactOfPerson> linkedList = new LinkedList<ContactOfPerson>();
	HashMap<String, LinkedList> hashMap = new HashMap<String, LinkedList>();
	String addressBookName;

	// Create Address Book
	public void createAddressBook() {
		System.out.println("\nCreate address book ");
		System.out.println("\n give name to address book ");
		String addressBookName = scanner.next();
		System.out.println("Address book name is :" + addressBookName);
		if (hashMap.containsKey(addressBookName)) {
			System.out.println("\n address book is already exist with same name ,do u want to create another?(yes/no)");
			String ans = scanner.next();
			if (ans.equalsIgnoreCase("yes")) {
				createAddressBook();
			}
		} else {
			hashMap.put(addressBookName, new LinkedList<ContactOfPerson>());
		}
	}

	// add Contact to AddressBook
	public void addContactOfPerson(String addressBookName1) {
		if (hashMap.containsKey(addressBookName1)) {
			ContactOfPerson = new ContactOfPerson();
			// linkedList = new LinkedList<ContactOfPerson>();
			System.out.println("\nEnter first name :");
			String firstName = scanner.next();
			ContactOfPerson.setFirstName(firstName);
			System.out.println("\nEnter last name :");
			String lastName = scanner.next();
			ContactOfPerson.setLastName(lastName);
			System.out.println("\nEnter address :");
			String address = scanner.next();
			ContactOfPerson.setAddress(address);
			System.out.println("\nEnter city name :");
			String city = scanner.next();
			ContactOfPerson.setState(city);
			System.out.println("\nEnter state name :");
			String state = scanner.next();
			ContactOfPerson.setState(state);
			System.out.println("\nEnter zip code :");
			String zip = scanner.next();
			ContactOfPerson.setZipCode(zip);
			System.out.println("\nEnter 10 digit phone number :");
			String phone = scanner.next();
			ContactOfPerson.setPhoneNumber(phone);
			System.out.println("\nEnter email id :");
			String email = scanner.next();
			ContactOfPerson.setState(email);

			if (hashMap.get(addressBookName1) == null) {
				hashMap.put(addressBookName1, new LinkedList<ContactOfPerson>());
			}
			hashMap.get(addressBookName1).add(ContactOfPerson);

			linkedList = hashMap.get(addressBookName1);
			for (int i = 0; i < linkedList.size(); i++) {
				ContactOfPerson p1 = linkedList.get(i);
				System.out.println("Person name is :" + p1.getFirstName());
				p1.display();
			}
		} else {
			System.out.println("\n Address book is not in record,u first create address book ");
			createAddressBook();
		}
	}

	// edit Contact of Person
	public void editContactOfPerson() {
		System.out.println("\n Enter the name of address book which you want to update ....");
		String updateName = scanner.next();
		System.out.println("\nEnter  Name :");
		String first = scanner.next();
		boolean flag = hashMap.containsKey(updateName);
		if (flag) {
			LinkedList<ContactOfPerson> linkedList = hashMap.get(updateName);
			for (int i = 0; i < linkedList.size(); i++) {
				ContactOfPerson p1 = linkedList.get(i);
				if (p1.getFirstName().equalsIgnoreCase(first)) {
					System.out.println("\nU can update now   ");
					System.out.println("\nEnter first name :");
					String firstName = scanner.next();
					System.out.println("\nEnter address :");
					String address = scanner.next();
					ContactOfPerson.setAddress(address);
					System.out.println("\nEnter state name :");
					String state = scanner.next();
					ContactOfPerson.setState(state);
					System.out.println("\nEnter zip code :");
					String zip = scanner.next();
					ContactOfPerson.setZipCode(zip);
					System.out.println("\nEnter phone number :");
					String phone = scanner.next();
					ContactOfPerson.setPhoneNumber(phone);
					System.out.println("\nUpdate Success Full ....");
				}
			}
		}
		linkedList = hashMap.get(updateName);
		for (int i = 0; i < linkedList.size(); i++) {
			ContactOfPerson p1 = linkedList.get(i);
			System.out.println("Person name is :" + p1.getFirstName());
			p1.display();
		}

	}

	// delete Contact of Person
	public void deleteContactOfPerson() {
		System.out.println("\n Enter the name of address book which you want to delete ....");
		String deleteName = scanner.next();
		System.out.println("\n Enter the firstname of user which record you want to delete ");
		String first = scanner.next();
		LinkedList<ContactOfPerson> linkedList = hashMap.get(deleteName);

		if (linkedList != null) {
			for (int i = 0; i < linkedList.size(); i++) {
				ContactOfPerson p1 = linkedList.get(i);
				if (p1.getFirstName().equalsIgnoreCase(first)) {
					linkedList.remove(i);
					System.out.println("Delete Success Full");
					System.out.println("\n" + linkedList);
				}
			}

			System.out.println(linkedList.remove(deleteName));
		} else {
			System.out.println("no data available");
		}
		for (ContactOfPerson per : linkedList) {
			System.out.println(per);
		}
		System.out.println("\n" + hashMap);

	}

}