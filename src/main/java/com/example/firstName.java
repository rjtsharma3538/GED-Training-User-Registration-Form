package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class firstName {

    String first_name;

    public firstName(String first_name) {

        this.first_name = first_name;

    }

    public boolean is_valid() throws InvalidDataException {

        if(check(this.first_name))
            return true;
        throw new InvalidDataException("First letter must be capital and must be of three words");
    }

    private boolean check(String name1){

        String name = "[A-Z][A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(name1);

        if (matcher.matches())
            return true;
        return false;
    }
}