package com.example;

public class Main {
    public static void main(String[] args) {

        // fill_form form = new fill_form();

        // System.out.println();
        // System.out.println("these are the form details : ");
        // System.out.println();

        // form.display();

        String words1[] = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };

        String words2[] = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
                "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
                "abc@gmail.com.1a", "abc@gmail.com.aa.au" };


        System.out.println("These are the valid mails : ");
        System.out.println();

        for (String word : words1) {
            email e = new email(word);
            System.out.println(e.is_valid());
        }

        System.out.println();
        System.out.println("These are the invalid mails : ");
        System.out.println();

        for (String word : words2) {
            email e = new email(word);
            System.out.println(e.is_valid());
        }

    }
}