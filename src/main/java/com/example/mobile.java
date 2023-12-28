package com.example;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class mobile {
    String mobileNumber;

    mobile(String mobileNumber)
    {
        this.mobileNumber=mobileNumber;
    }

    public boolean is_valid()
    {
        return check(this.mobileNumber);
    }

    private boolean check(String name1)
    {
        String name = "^[+][1-9][0-9]*[\\s][0-9]{10}";
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(name1);

        if(matcher.matches())
            return true;
        
        String name2 = "^[+][1-9][0-9]*-[0-9]+[\\s][0-9]{10}";
        pattern =  Pattern.compile(name2);
        matcher = pattern.matcher(name1);

        if(matcher.matches())
            return true;

        return false;
    }
}
