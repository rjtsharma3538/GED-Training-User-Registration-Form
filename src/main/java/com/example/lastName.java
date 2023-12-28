package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lastName {

    String last_name;

    lastName(String last_name) {

        this.last_name = last_name;

    }

    public boolean is_valid() {

        return check(this.last_name);

    }

    private boolean check(String name1) {

        String name = "^[A-Z][A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(name1);

        if (matcher.matches())
            return true;
        return false;

    }
}