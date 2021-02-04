package com.addressbook;

public class Service {
	AddressBook addressBook = new AddressBookMain<>() {
	};

	public void createAddressBook() {
		addressBook.createAddressBook();
	}

	public void addPerson(String addressBookName1) {
		addressBook.addContactOfPerson(addressBookName1);
	}

	public void deletePerson() {
		addressBook.deleteContactOfPerson();
	}

	public void updatePerson() {
		addressBook.editContactOfPerson();
	}
}
