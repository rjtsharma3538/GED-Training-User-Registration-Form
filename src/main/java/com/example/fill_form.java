package com.example;

public class fill_form {

    userRegistration form = new userRegistration();

    public fill_form()
    {
        form.add_first_name();
        form.add_last_name();
        form.add_email();
        form.add_mobile();
        form.add_password();
    }

    void display()
    {
        System.out.println("first name : " + form.first_name);
        System.out.println("last name : " + form.last_name);
        System.out.println("email id : " + form.email_address);
        System.out.println("mobile number : " + form.number);        
        System.out.println("password : " + form.password);        

    }
}
