package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuBarOption {
	public static void menu() {
		ContactOfPerson ContactDetails = null;
		AddressBookMain ab = new AddressBookMain();
		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ur choice \n 1 : Add \n 2 : Edit \n 3 : Delete \n 4 : Display ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				ab.add();
				break;
			case 2:

				System.out.println("Enter the ContactDetails Name to edit details..");
				String firstName = sc.next();
				ArrayList<ContactOfPerson> personList = ab.al;
				for (int i = 0; i < personList.size(); i++) {
					if (personList.get(i).firstName.equals(firstName)) {
						ContactOfPerson ContactDetail = personList.get(i);

						ab.edit(ContactDetail);

					} else {
						System.out.println(firstName + " is not exists ");
					}
				}
				break;
			case 3:
				System.out.println("Enter the ContactDetails name to Delete the Details");
				firstName = sc.next();
				ArrayList<ContactOfPerson> personLists = ab.al;
				for (int i = 0; i < personLists.size(); i++) {
					if (personLists.get(i).firstName.equals(firstName)) {
						ContactOfPerson Contact = personLists.get(i);
						ab.delete(Contact);
					}
				}

				break;

			case 4:
				System.out.println(ab.al);
				break;
			default:
				System.out.println("Enter num from 1 to 4");
			}
		} while (choice < 5);
	}

}
