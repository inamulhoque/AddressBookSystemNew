package com.bridgelabz;

import java.util.Scanner;

public class EditAddressBook extends AddressBook{
    public void editAddressBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the FirstName to edit the details: ");
        String name = sc.next();
        if(name.equals(firstName))
        {
            System.out.println("Please edit the details of "+name);
            addressBook();
        }
    }
}
