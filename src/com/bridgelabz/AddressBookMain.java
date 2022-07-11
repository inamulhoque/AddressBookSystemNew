package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

import static com.bridgelabz.AddressBookFunctions.Contacts;

public class AddressBookMain{

    public static void main(String[] args) {
        int loop = 1;
        do {
            System.out.println("Enter your choice from below:");
            System.out.println("1.Add AddressBook" +
                    "2.Add contact\t" +
                    "3.Edit contacts\t" +
                    "4.Delete contacts\t");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    AddressBookFunctions.addAddressBook();
                case 2:
                    int i = 1;
                    do {
                        System.out.println("Enter addressbook name:");
                        String book = scanner.next();
                        AddressBookFunctions.addContact(book);
                        System.out.println("Do you want to add more contact? press 1 or press any key to exit.");
                        i = scanner.nextInt();
                    } while (i == 1);
                    break;
                case 3:
                    AddressBookFunctions.editContact();
                    break;
                case 4:
                    AddressBookFunctions.deleteContact((ArrayList<AddressBook>) Contacts);
                    break;
                default:
                    System.out.println("Enter a valid choice.");
                    break;
            }
            System.out.println("Press 1 to repeat the menu or quit.");
            loop = scanner.nextInt();
        }while (loop==1);
    }
}