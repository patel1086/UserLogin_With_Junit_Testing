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
            System.out.println("Valid last Name");
            found = true;
        }
        if(!found)
        {
            System.out.println("Invalid last name");

        }
        return found;

    }
    public static boolean MobileValidate(String name)
    {
        Pattern pattern = Pattern.compile("^[0-9]{2}(\s{1}[0-9]{10})$");
        Matcher matcher =  pattern.matcher(name);
        boolean found = false;
        while (matcher.find())
        {
            System.out.println("Valid Number");
            found = true;
        }
        if(!found)
        {
            System.out.println("Invalid Number");
        }
        return found;

    }
    public static boolean PasswordValidation(String name)
    {

        Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[0-9])[a-zA-z0-9].{8,}$"); 
	Matcher m=pattern.matcher(name); 
	 boolean found = false;
        while (matcher.find())
        {
            System.out.println("Valid Password");
            found = true;
        }
        if(!found)
        {
            System.out.println("Invalid Password");
        }
        return found;
    }
}