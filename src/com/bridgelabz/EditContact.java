package com.bridgelabz;

import java.util.Scanner;

import static com.bridgelabz.AddressBook.*;

public class EditContact{
    public static void editContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name to edit contact details.");
        String name = scanner.next();
        if (name.equals(firstName)){
            System.out.println("New First Name:");
            firstName = scanner.next();
            System.out.println("New Last Name:");
            lastName = scanner.next();
            System.out.println("New City:");
            city = scanner.next();
            System.out.println("New State:");
            state = scanner.next();
            System.out.println("New Zip:");
            zip = scanner.nextInt();
            System.out.println("New Phone:");
            phone = scanner.nextLong();
            System.out.println("New E-mail:");
            mail = scanner.next();
        }
    }
}
