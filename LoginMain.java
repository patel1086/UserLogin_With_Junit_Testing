package com.bridgelabz.JunitTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginMain {
    public static boolean FirstNameValidation(String firstname)
    {
        Pattern pattern = Pattern.compile("^[A-Z]{1}(?=.*[a-z]).{2,}$");
	Matcher matcher =  pattern.matcher(firstname);

        boolean found = false;
        while (matcher.find())
        {
            System.out.println("Valid First Name");
            found = true;
        }
        if(!found)
        {
            System.out.println("Invalid First Name");

        }
        return found;

    }
    public static boolean LastNameValidatation(String name)
    {
        Pattern pattern = Pattern.compile("^[A-Z]{1}(?=.*[a-z]).{2,}$");
        Matcher matcher =  pattern.matcher(name);
        boolean found = false;
        while (matcher.find())
        {
            System.out.println("Valid Last Name");
            found = true;
        }
        if(!found)
        {
            System.out.println("Invalid Last name");

        }
        return found;

    }
}