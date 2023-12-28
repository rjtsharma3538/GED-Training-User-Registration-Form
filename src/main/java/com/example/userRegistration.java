package com.example;

import java.util.Scanner;

public class userRegistration {
    String first_name;
    String last_name;
    String email_address;
    String number;
    String password;

    userRegistration() {
        this.first_name = "";
        this.last_name = "";
        this.email_address = "";
        this.number = "";
        this.password = "";
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


    void add_email(){
        System.out.println("Enter email Address");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        email e = new email(name);

        while(e.is_valid()==false)
        {
            System.out.println("Entered email address is not valid pls enter the email again");
            name = scanner.nextLine();
            e = new email(name);
        }

        System.out.println("email saved successfully");
        this.email_address = name;
    }

    void add_mobile()
    {
        System.out.println("Enter your mobile number : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        mobile mob = new mobile(name);

        while(mob.is_valid()==false)
        {
            System.out.println("Entered mobile number is wrong pls enter mobile number again");
            name = scanner.nextLine();
            mob = new mobile(name);
        }

        System.out.println("mobile number saved successfully");
        this.number = name;
    }

    void add_password()
    {
        System.out.println("Enter your password : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        password pass = new password(name);

        while(pass.is_valid()==false)
        {
            name = scanner.nextLine();
            pass = new password(name);
        }

        System.out.println("mobile number saved successfully");
        this.password = name;
    }
}