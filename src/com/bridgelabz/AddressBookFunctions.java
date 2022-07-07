package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.bridgelabz.AddressBook.*;

public class AddressBookFunctions {
        public static ArrayList<AddressBook> arrayOfContacts = new ArrayList<>();
        public static Scanner obj = new Scanner(System.in);
        public static HashMap<String,ArrayList<AddressBook>> hashMapOfAddressBook = new HashMap<>();

        public static ArrayList<AddressBook> findAddressBook(String name){
            for (Map.Entry<String,ArrayList<AddressBook>> itr: hashMapOfAddressBook.entrySet()){
                if (itr.getKey().equals(name)){
                    return itr.getValue();
                }
            }
            return null;
        }
        public static String addAddressBook(){
            System.out.println("Enter addressbook name:");
            String addressBookName = obj.next();
            if (findAddressBook(addressBookName)!=null){
                System.out.println("Already exists.");
                System.out.println(hashMapOfAddressBook.get(addressBookName));
            }
            return addressBookName;
        }

        public static void addContact(String bookName){
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

            AddressBook addressBook = new AddressBook(firstName,lastName,city,state,zip,phone,mail);
            if (findAddressBook(bookName)!=null)
                hashMapOfAddressBook.get(bookName).add(addressBook);

            arrayOfContacts = new ArrayList<AddressBook>();
            arrayOfContacts.add(addressBook);
            hashMapOfAddressBook.put(bookName,arrayOfContacts);
        }
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
