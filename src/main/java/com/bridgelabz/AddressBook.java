package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    //Attributes
    String name, address, city, state, email;
    String phoneNumber, zipCode;
    //Instantiating the DataValidation class
    DataValidation dataValidation = new DataValidation();
    Contact contact;
    //Scanner class to take Input
    Scanner sc = new Scanner(System.in);
    //taking arraylist to store the contacts
    List<Contact> contactsList = new ArrayList<>();
    List<Contact> validatedList = new ArrayList<>();


    /**
     * this method is to create a contact
     * by checking the user input
     */
    public void createContact() {
        try {
            System.out.println("Enter the name");
            //assigning the name given by user to the name
            name = sc.next();
            System.out.println("Enter the address");
            //defining the address given by user
            address = sc.next();
            //printing the statement
            System.out.println("Enter the city");
            //defining the city given by the user
            city = sc.next();
            System.out.println("Enter the state");
            //defining the state given by user
            state = sc.next();
            System.out.println("Enter the emailId");
            //defining the emailId given by user
            email = sc.next();
            System.out.println("Enter the Phone number");
            //defining the phoneNumber given by user
            phoneNumber = sc.next();
            System.out.println("Enter the zipcode");
            //defining the zipcode given by user
            zipCode = sc.next();
            //creating a contact with the user input
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (Exception exception) {
            System.out.println(exception);
        }
        contact = new Contact(name, address, city, state, email, phoneNumber, zipCode);
        contactsList.add(contact);
    }

    public void dataValidation() {
        try {
            contactsList.forEach(e -> {
                if ((dataValidation.nameValidation(e.name)) && (dataValidation.addressValidation(e.address))
                        && (dataValidation.cityValidation(city)) && (dataValidation.stateValidation(state)) &&
                        (dataValidation.numberValidation(phoneNumber)) && (dataValidation.zipCodeValidation(zipCode))) {
                    System.out.println("Data is Validated");
                }
            });
        }catch (InvalidUserDataException ie){
            System.out.println(ie.getMessage());
        }
    }
}
