package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password {
    private String pass;

    password(String pass) {
        this.pass = pass;
    }

    public boolean is_valid() {
        return check(this.pass);
    }

    public String get_password() {
        return this.pass;
    }

    private boolean check(String name) {
        // TC - 1 8 characters
        // String name1 = "[A-Za-z0-9!@#%^&*()_+-=[]{}|;':\\\",./<>?~`]{8}";
        String name1 = "^.{8,}$";
        Pattern pattern = Pattern.compile(name1);
        Matcher matcher = pattern.matcher(name);

        if (!matcher.matches()) {
            System.out.println("password length must be greater than 8");
            return false;
        }

        // TC - 2 one uppercase

        String name2 = "^.*[A-Z].*$";
        pattern = Pattern.compile(name2);
        matcher = pattern.matcher(name);

        if (!matcher.matches()) {
            System.out.println("password must contain atlest one uppercase character");
            return false;
        }

        // Tc -3 one numeric

        String name3 = "^.*[0-9].*$";
        pattern = Pattern.compile(name3);
        matcher = pattern.matcher(name);

        if(!matcher.matches())
        {
            System.out.println("password must contain atleast one numeric character");
            return false;
        }

        // Tc -4 only one special character

        String name4 = "^[a-zA-Z0-9]*[^a-zA-Z0-9\\s][a-zA-Z0-9]*$";
        pattern = Pattern.compile(name4);
        matcher = pattern.matcher(name);

        if(!matcher.matches())
        {
            System.out.println("password must contain exactly one special character");
            return false;
        }

        return true;
    }
}
