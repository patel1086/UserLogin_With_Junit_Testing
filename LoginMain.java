package com.bridgelabz.JunitTest;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginMain {

    public static void ExceptionNullCheck(String usercredential) throws LoginException {

        try {
            if (usercredential.length() == 0) {
                throw new LoginException(LoginException.ExceptionType.EMPTY, "Please Enter something");
            }
        }
            catch(NullPointerException e)
        {
            throw new LoginException(LoginException.ExceptionType.NULL, "Place is null, please enter something");

        }
    }
    public static boolean FirstNameValidation(String firstname) throws LoginException
    {
	ExceptionNullCheck(firstname);
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
            throw new LoginException(LoginException.ExceptionType.INVALID_FIRST_NAME,"Invalid First Name");

        }
        return found;

    }
    public static boolean LastNameValidatation(String lastname) throws LoginException
    {
	ExceptionNullCheck(lastname);
        Pattern pattern = Pattern.compile("^[A-Z]{1}(?=.*[a-z]).{2,}$");
        Matcher matcher =  pattern.matcher(lastname);
        boolean found = false;
        while (matcher.find())
        {
            System.out.println("Valid last Name");
            found = true;
        }
        if(!found)
        {
            throw new LoginException(LoginException.ExceptionType.INVALID_LAST_NAME,"Invalid Last Name");

        }
        return found;

    }
    public static boolean MobileValidate(String mobile) throws LoginException
    {
	ExceptionNullCheck(mobile);
        Pattern pattern = Pattern.compile("^[0-9]{2}(\s{1}[0-9]{10})$");
        Matcher matcher =  pattern.matcher(mobile);
        boolean found = false;
        while (matcher.find())
        {
            System.out.println("Valid Number");
            found = true;
        }
        if(!found)
        {
            throw new LoginException(LoginException.ExceptionType.INVALID_MOBILE_NUMBER,"Invalid Mobile Number");
        }
        return found;

    }
    public static boolean PasswordValidation(String pswd) throws LoginException
    {
	ExceptionNullCheck(pswd);

        Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#!@%&])[a-zA-Z0-9].{8,}$"); 
	Matcher matcher=pattern.matcher(pswd); 
	 boolean found = false;
        while (matcher.find())
        {
            System.out.println("Valid Password");
            found = true;
        }
        if(!found)
        {
            throw new LoginException(LoginException.ExceptionType.INVALID_PSWd,"Invalid pswd");
        }
        return found;
    }

    public static boolean EmailValidation(String email) throws LoginException
    {
	ExceptionNullCheck(email);
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9+-]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	Matcher matcher =  pattern.matcher(email);

        boolean found = false;
        while (matcher.find()) {
            System.out.println("Valid email");
            found = true;
        }
        if(!found){
            throw new LoginException(LoginException.ExceptionType.INVALID_EMAIL,"Invalid Email");
        }
        return found;

    }
}