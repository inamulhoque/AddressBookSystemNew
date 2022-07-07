package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.bridgelabz.AddressBook.*;

public class AddContact {
    static String firstName;
    static String lastName;
    static String city;
    static String state;
    static int zip;
    static long phone;
    static String mail;

    public static ArrayList<AddressBook> arrayOfContacts = new ArrayList<AddressBook>();
    public static Scanner obj = new Scanner(System.in);
    public static void addContact(){
        AddressBook addressBook = new AddressBook(firstName,lastName,city,state,zip,phone,mail);

        System.out.print("First name: ");
        firstName = obj.next();
        AddressBook.setFirstName(firstName);

        System.out.print("Last name: ");
        lastName = obj.next();
        AddressBook.setLastName(lastName);

        System.out.print("City: ");
        city = obj.next();
        AddressBook.setCity(city);

        System.out.print("State: ");
        state = obj.next();
        AddressBook.setState(state);

        System.out.print("Zip: ");
        zip = obj.nextInt();
        AddressBook.setZip(zip);

        System.out.print("E-mail: ");
        mail = obj.next();
        AddressBook.setMail(mail);

        System.out.print("Phone number: ");
        phone = obj.nextLong();
        AddressBook.setPhone(phone);

        arrayOfContacts.add(addressBook);

        for (AddressBook data: arrayOfContacts){
            System.out.println(data);
        }
    }
}
