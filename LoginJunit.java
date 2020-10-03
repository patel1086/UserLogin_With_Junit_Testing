package com.bridgelabz.JunitTest;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.io.*;
import java.util.*;

public class LoginJunit {
    LoginMain user= new LoginMain();
    @Test
    public void first_name_validation_if_return_true()
    {
        try{
	String firstname="Jitendra";
        boolean result= user.firstname.validate(firstname);
        Assert.assertEquals(true,result);
	}
	catch (LoginException e)
        {
            System.out.println(e.eo+" "+e.getMessage());
            Assert.assertEquals(LoginException.ExceptionType.INVALID_FIRST_NAME,e.eo);
        }

    }
    @Test
    public void first_name_validation_if_return_false()
    {
        try{
	String firstname="jitendra";
        boolean result= user.firstname.validate(firstname);
        Assert.assertEquals(false,result);
	}
	catch (LoginException e)
        {
            System.out.println(e.eo+" "+e.getMessage());
            Assert.assertEquals(LoginException.ExceptionType.INVALID_FIRST_NAME,e.eo);
        }

    }
    @Test
    public void if_No_of_char_less_than_three_return_false()
    {
        try{
	String firstname="Ji";
        boolean result= user.firstname.validate(firstname);
        Assert.assertEquals(false,result);
	}
	catch (LoginException e)
        {
            System.out.println(e.eo+" "+e.getMessage());
            Assert.assertEquals(LoginException.ExceptionType.INVALID_FIRST_NAME,e.eo);
        }

    }
    @Test
    public void if_firstname_empty_return_false(){
	try{
		String firstname="";
		boolean result=user.firstname.validate(firstname);
	}catch(LoginException e){
		System.out.println(e.eo+"  "+e.getMessage());
		Assert.assertEquals(LoginException.ExceptionType.EMPTY,e.eo);
	}
    }
    @Test
    public void if_firstname_null_return_false()
    {
        try {
            String firstname = null;
            boolean result = user.firstname.validate(firstname);

        }
        catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.NULL,e.eo);
        }

    }
    @Test
    public void last_name_validation_if_return_true()
    {
        try{
	String lastname="Patel";
        boolean result= user.lastname.validate(lastname);
        Assert.assertEquals(true,result);
	}
	catch (LoginException e)
        {
            System.out.println(e.eo+" "+e.getMessage());
            Assert.assertEquals(LoginException.ExceptionType.INVALID_LAST_NAME,e.eo);
        }

    }
    @Test
    public void last_Name_validation_if_return_false()
    {
        try{
	String lastname="patel";
        boolean result= user.lastname.validate(lastname);
        Assert.assertEquals(false,result);
	}
	catch (LoginException e)
        {
            System.out.println(e.eo+" "+e.getMessage());
            Assert.assertEquals(LoginException.ExceptionType.INVALID_LAST_NAME,e.eo);
        }

    }
    @Test
    public void if_no_of_char_less_than_three_return_false()
    {
        try{
	String lastname="Pa";
        boolean result= user.lastname.validate(lastname);
        Assert.assertEquals(false,result);
	}
	catch (LoginException e)
        {
            System.out.println(e.eo+" "+e.getMessage());
            Assert.assertEquals(LoginException.ExceptionType.INVALID_LAST_NAME,e.eo);
        }

    }
     @Test
    public void if_lastname_empty_return_false(){
	try{
		String lastname="";
		boolean result=user.lastname.validate(lastname);
	}catch(LoginException e){
		System.out.println(e.eo+"  "+e.getMessage());
		Assert.assertEquals(LoginException.ExceptionType.EMPTY,e.eo);
	}
    }
     @Test
    public void if_lastname_null_return_false()
    {
        try {
            String lastname = null;
            boolean result = user.lastname.validate(lastname);

        }
        catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.NULL,e.eo);
        }

    }
    @Test
    public void mobile_pattern_matches_return_true()
    {
        try{
	String mobile="91 9636638082";
        boolean result= user.mobile.validate(mobile);
        Assert.assertEquals(true,result);
	}
	 catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_MOBILE_NUMBER,e.eo);
        }
	

    }
    @Test
    public void more_than_one_space_after_country_code_return_false()
    {
        try{
	String mobile="91  9636638082";
        boolean result= user.mobile.validate(mobile);
        Assert.assertEquals(false,result);
	}
	 catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_MOBILE_NUMBER,e.eo);
        }

    }
    @Test
    public void if_country_code_have_more_than_two_numers_return_false()
    {
        try{
	String mobile="911 9636638082";
        boolean result= user.mobile.validate(mobile);
        Assert.assertEquals(false,result);
	}
	 catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_MOBILE_NUMBER,e.eo);
        }

    }
    @Test
    public void No_space_after_country_code_return_false()
    {
        try{
	String mobile="919636638082";
        boolean result= user.mobile.validate(mobile);
        Assert.assertEquals(false,result);
	}
	 catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_MOBILE_NUMBER,e.eo);
        }

    }
    @Test
    public void if_countrycode_Not_given_return_false()
    {
       try{
	 String mobile="9636638082";
        boolean result= user.mobile.validate(mobile);
        Assert.assertEquals(false,result);
	}
	 catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_MOBILE_NUMBER,e.eo);
        }
    }
   @Test
    public void Moibile_number_is_more_than_ten_number_return_false()
    {
        try{
	String mobile="91 96366380823";
        boolean result= user.mobile.validate(mobile);
        Assert.assertEquals(false,result);
	}
	 catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_MOBILE_NUMBER,e.eo);
        }

    }
     @Test
    public void if_mobilenumber_empty_return_false(){
	try{
		String mobile="";
		boolean result=user.mobile.validate(mobile);
	}catch(LoginException e){
		System.out.println(e.eo+"  "+e.getMessage());
		Assert.assertEquals(LoginException.ExceptionType.EMPTY,e.eo);
	}
    }
     @Test
    public void if_mobilenumber_null_return_false()
    {
        try {
            String mobile = null;
            boolean result =user.mobile.validate(mobile);

        }
        catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.NULL,e.eo);
        }

    }
    @Test
    public void password_has_less_than_8_chars_return_false()
    {
        try{
	String password="Abc5@";
        boolean result= user.password.validate(password);
        Assert.assertEquals(false,result);
	}
	catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_PSWD,e.eo);
        }

    }
    @Test
    public void password_is_greater_than_or_equal_to_8_chars_return_true()
    {
        try{
	String password="Abc567@";
        boolean result= user.password.validate(password);
        Assert.assertEquals(true,result);
	}
	catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_PSWD,e.eo);
        }

    }
    @Test
    public void password_has_at_least_one_capital_char_return_true()
    {
        try{
	String password="Abcdrf567@";
        boolean result= user.password.validate(password);
        Assert.assertEquals(true,result);
	}
	catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_PSWD,e.eo);
        }

    }
    @Test
    public void password_have_not_at_least_1_cap_return_false()
    {
        try{
	String password="abcfd567@";
        boolean result= user.password.validate(password);
        Assert.assertEquals(false,result);
	}
	catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_PSWD,e.eo);
        }

    }
    @Test
    public void password_have_not_at_least_1_number_return_false()
    {
        try{
	String password="Abcdefghy@";
        boolean result= user.password.validate(password);
        Assert.assertEquals(false,result);
	}
	catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_PSWD,e.eo);
        }

    }
    @Test
    public void password_have_at_least_1_number_return_true()
    {
        try{
	String password="Abcef567@";
        boolean result= user.password.validate(password);
        Assert.assertEquals(true,result);
	}
	catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_PSWD,e.eo);
        }

    }
    @Test
    public void password_have_one_special_char_return_true()
    {
       try{
	 String password="Abcdefrg567@";
        boolean result= user.password.validate(password);
        Assert.assertEquals(true,result);
	}
	catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_PSWD,e.eo);
        }

    }
    @Test
    public void password_have_not_special_Char_return_false()
    {
        try{
	String password="Abcdfrg567";
        boolean result= user.password.validate(password);
        Assert.assertEquals(false,result);
	}
	catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_PSWD,e.eo);
        }


    }
     @Test
    public void if_password_empty_return_false(){
	try{
		String password="";
		boolean result=user.password.validate(password);
	}catch(LoginException e){
		System.out.println(e.eo+" "+e.getMessage());
		Assert.assertEquals(LoginException.ExceptionType.EMPTY,e.eo);
	}
    }
     @Test
    public void if_password_null_return_false()
    {
        try {
            String password = null;
            boolean result = user.password.validate(password);

        }
        catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.NULL,e.eo);
        }

    }
    @Test
    public void email_is_valid_return_true()
    {
        try{
	String email="abc.xyz@gmail.com";
        boolean result= user.email.validate(email);
        Assert.assertEquals(true,result);
	}
	catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_EMAIL,e.eo);
        }

    }
    @Test
    public void email_is_invalid_return_false()
    {
        try{
	String email="abc.xyz@@gmail.com";
        boolean result= user.email.validate(email);
        Assert.assertEquals(false,result);
	}
	catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.INVALID_EMAIL,e.eo);
        }

    }
      @Test
    public void if_email_empty_return_false(){
	try{
		String email="";
		boolean result=user.email.validate(email);
	}catch(LoginException e){
		System.out.println(e.eo+"  "+e.getMessage());
		Assert.assertEquals(LoginException.ExceptionType.EMPTY,e.eo);
	}
    }
     @Test
    public void if_email_null_return_false()
    {
        try {
            String email = null;
            boolean result = user.email.validate(email);

        }
        catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.NULL,e.eo);
        }

    }
	
    
}