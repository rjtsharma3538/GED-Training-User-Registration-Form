package com.example;

import java.util.Scanner;

public class userRegistration {
    String first_name;
    String last_name;
    String email_address;
    String number;

    userRegistration() {
        this.first_name = "";
        this.last_name = "";
        this.email_address = "";
        this.number = "";
    }

    void add_first_name() {
        System.out.println("Enter the first name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        firstName first = new firstName(name);

        while (first.is_valid() == false) {
            System.out.println("Entered name is not valid pls enter the first name again");
            name = scanner.nextLine();
            first = new firstName(name);
        }
        System.out.println("first name saved successfully");
        this.first_name = name;
    }

    void add_last_name(){
        System.out.println("Enter the last name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        lastName last = new lastName(name);

        while(last.is_valid()==false){
            System.out.println("Entered name is not valid pls enter the last name again");
            name = scanner.nextLine();
            last = new lastName(name);
        }

        System.out.println("last name saved successfully");
        this.last_name=name;
    }

}