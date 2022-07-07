package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.bridgelabz.AddContact.arrayOfContacts;

public class AddressBookMain extends AddressBook{
    /*static ArrayList<AddressBook> contacts = new ArrayList<>();*/

    public static void main(String[] args) {
        System.out.println("Enter your choice from below:");
        System.out.println("1.Add contact\t" +
                "2.Edit contacts\t" +
                "3.Delete contacts\t" +
                "4.Display contact");
        Scanner scanner = new Scanner(System.in);
        int input  = scanner.nextInt();
        switch (input) {
            case 1:
                int i =1;
                do {
                    AddContact.addContact();
                    System.out.println("Do you want to add more contact? press 1 or press any key to exit.");
                    i = scanner.nextInt();
                } while (i==1);
                break;
            case 2:
                EditContact.editContact();
                break;
            case 3:
                DeleteContact.deleteContact((ArrayList<AddressBook>) arrayOfContacts);
                break;
            default:
                System.out.println("Enter a valid choice.");
        }
    }
}