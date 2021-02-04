package com.addressbook;

import java.util.Scanner;
//driving option
public class MenuBarOption {
	public static void menu() {

		Scanner scanner = new Scanner(System.in);
		Service service = new Service();
		System.out.println("**Menu***");

		String answer;

		do {

			System.out.println(
					"\nchoices are :\n1. create new AddressBook \n2. Add Person \n3. Delete Person \n4. Update Person . ");
			System.out.println("\nEnter your choice ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				service.createAddressBook();
				break;
			case 2:
				System.out.println("\nGive the name to address book ");
				String addressBookName1 = scanner.next();
				service.addPerson(addressBookName1);
				break;
			case 3:
				service.deletePerson();
				break;
			case 4:
				service.updatePerson();
				break;
			case 5:

				break;
			}
			System.out.println("\n Do you want to continue :? type (yes for y && no for n) ");
			answer = scanner.next();
		} while (answer.equalsIgnoreCase("y"));

		if (answer.equalsIgnoreCase("n")) {
			System.out.println("thank you.....");
		}

	}
}