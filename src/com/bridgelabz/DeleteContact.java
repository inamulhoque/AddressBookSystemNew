package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteContact extends AddressBook{
    public static void deleteContact(ArrayList<AddressBook> contacts){
        System.out.println("Enter the first name to delete contact");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if (name.equals(firstName)){
            contacts.removeIf(addressBook -> addressBook.firstName.equals(name));
            System.out.println("Deletion completed.");
        } else {
            System.out.println("Wrong name input.");
        }
    }
}
