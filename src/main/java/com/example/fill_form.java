package com.example;

public class fill_form {

    userRegistration form = new userRegistration();

    fill_form()
    {
        form.add_first_name();
    }

    void display()
    {
        System.out.println("first name : " + form.first_name);
    }
}
