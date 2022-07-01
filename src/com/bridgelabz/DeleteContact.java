package com.bridgelabz;

import java.util.Scanner;

public class DeleteContact extends AddressBook{
    public void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name of contact details to delete the record.");
        String name = sc.next();
        if (name.equals(firstName)){
            firstName = "";
            lastName = "";
            city = "";
            state = "";
            mail = "";
            zip = Integer.parseInt(null);
            phone = Long.parseLong(null);
        }
        System.out.println("Contact details have been deleted.");
    }
}
