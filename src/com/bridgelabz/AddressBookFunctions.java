package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.bridgelabz.AddressBook.*;

public class AddressBookFunctions {
    public static ArrayList<AddressBook> Contacts = new ArrayList<>();
    public static Scanner obj = new Scanner(System.in);
    public static HashMap<String,ArrayList<AddressBook>> hashMapOfAddressBook = new HashMap<>();

    public static void addContact(String bookName){
        System.out.print("First name: ");
        firstName = obj.next();
        AddressBook.setFirstName(firstName);

        System.out.print("Last name: ");
        lastName = obj.next();
        AddressBook.setLastName(lastName);
        if (AddressBookFunctions.checkDuplicate(bookName,firstName,lastName)) {

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

            AddressBook addressBook = new AddressBook(firstName, lastName, city, state, zip, phone, mail);
            if (findAddressBook(bookName) != null)
                hashMapOfAddressBook.get(bookName).add(addressBook);

            Contacts = new ArrayList<AddressBook>();
            Contacts.add(addressBook);
            hashMapOfAddressBook.put(bookName, Contacts);
        }
        else {
            System.out.println("The contact name with "+firstName+" already exist in "+hashMapOfAddressBook.get(bookName));
        }
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

    public static void deleteContact(ArrayList<AddressBook> Contacts){
        System.out.println("Enter the first name to delete contact");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if (name.equals(firstName)){
            Contacts.clear();
            System.out.println("Deletion completed.");
        } else {
            System.out.println("Wrong name input.");
        }
    }

    public static void addAddressBook(){
        System.out.println("Enter addressbook name:");
        String addressBookName = obj.next();
        if (findAddressBook(addressBookName)!=null){
            System.out.println("Already exists.");
            System.out.println(hashMapOfAddressBook.get(addressBookName));
        }
        System.out.println( addressBookName);
    }

    public static ArrayList<AddressBook> findAddressBook(String name){
        for (Map.Entry<String,ArrayList<AddressBook>> itr: hashMapOfAddressBook.entrySet()){
            if (itr.getKey().equals(name)){
                return itr.getValue();
            }
        }
        return null;
    }

    public static boolean checkDuplicate(String book_name, String first_name, String last_name){
        int f = 0;
        if (hashMapOfAddressBook.get(book_name)==null)
            return true;
        ArrayList<AddressBook> arrayList = hashMapOfAddressBook.get(book_name);
        for (AddressBook data : arrayList) {
            if (data.getFirstName().equals(first_name) && data.getLastName().equals(last_name))
                return false;
        }
        return true;
    }
}
