package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    static String firstName;
    static String lastName;
    static String city;
    static String state;
    static int zip;
    static long phone;
    static String mail;
    static int i = 1;

    public void addressBook() {
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("First name: ");
            firstName = obj.next();
            System.out.print("Last name: ");
            lastName = obj.next();
            System.out.print("City: ");
            city = obj.next();
            System.out.print("State: ");
            state = obj.next();
            System.out.print("Zip: ");
            zip = obj.nextInt();
            System.out.print("E-mail: ");
            mail = obj.next();
            System.out.print("Phone number: ");
            phone = obj.nextLong();

            System.out.println("First name:" + firstName + "\tLast name:" + lastName + "\tCity:" + city + "\tState:" + state + "\tZip:" + zip +
                    "\tPhone:" + phone + "\tE-mail:" + mail);
            System.out.println("Do you want to add more? Press 1 or you can exit with any input exceept 1.");
            i = obj.nextByte();
        } while (i == 1);
    }
}
