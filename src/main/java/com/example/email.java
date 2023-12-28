package com.example;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class email {
    private String email_name;

    email(String email_name) {
        this.email_name = email_name;
    }

    public boolean is_valid() {
        return check(this.email_name);
    }

    private boolean check(String name1) {

        String name = "^[A-Za-z0-9]+[.+-]?[A-Za-z0-9]+[.+-]?[A-Za-z0-9]@[A-Za-z0-9]{1,}[.][A-Za-z]{2,}$";
        String name2 = "^[A-Za-z0-9]+[.+-]?[A-Za-z0-9]+[.+-]?[A-Za-z0-9]@[A-Za-z0-9]{1,}[.][A-Za-z0-9]{2,}[.][A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(name1);

        if (matcher.matches())
            return true;

        pattern = Pattern.compile(name2);
        matcher = pattern.matcher(name1);

        if (matcher.matches())
            return true;

        return false;
    }
}
