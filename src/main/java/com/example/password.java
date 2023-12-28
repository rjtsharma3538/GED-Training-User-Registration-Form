package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password {
    private String pass;

    password(String pass)
    {
        this.pass = pass;
    }

    public boolean is_valid()
    {
        return check(this.pass);
    }

    public String get_password()
    {
        return this.pass;
    }

    private boolean check(String name)
    {
        // TC - 1 8 characters
        //String name1 = "[A-Za-z0-9!@#%^&*()_+-=[]{}|;':\\\",./<>?~`]{8}";
        String name1 = "^.{8,}$";
        Pattern pattern = Pattern.compile(name1);
        Matcher matcher = pattern.matcher(name);

        if(!matcher.matches())
        {
            System.out.println("password length must be greater than 8");
            return false;
        }


        return true;
    }
}
