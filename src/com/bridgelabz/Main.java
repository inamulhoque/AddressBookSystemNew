package com.bridgelabz;

public class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program on Master Branch");
        AddressBook obj = new AddressBook();
        obj.addressBook();
        DeleteContact del = new DeleteContact();
        del.delete();
    }
}
