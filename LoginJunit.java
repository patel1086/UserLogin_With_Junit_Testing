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
	    boolean result= user.firstname.validate("Jitendra");
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
	    boolean result= user.firstname.validate("jitendra");
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
        boolean result= user.firstname.validate("Ji");
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
	   boolean result=user.firstname.validate("");
	}catch(LoginException e){
		System.out.println(e.eo+"  "+e.getMessage());
		Assert.assertEquals(LoginException.ExceptionType.EMPTY,e.eo);
	}
    }
    @Test
    public void if_firstname_null_return_false()
    {
        try {
            boolean result = user.firstname.validate(null);

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
        boolean result= user.lastname.validate("Patel");
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
        boolean result= user.lastname.validate("patel");
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
	    boolean result= user.lastname.validate("Pa");
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
	    boolean result=user.lastname.validate("");
	}catch(LoginException e){
		System.out.println(e.eo+"  "+e.getMessage());
		Assert.assertEquals(LoginException.ExceptionType.EMPTY,e.eo);
	}
    }
     @Test
    public void if_lastname_null_return_false()
    {
        try {
             boolean result = user.lastname.validate( null);

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
        boolean result= user.mobile.validate("91 9636638082");
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
	    boolean result= user.mobile.validate("91  9636638082");
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
        boolean result= user.mobile.validate("911 9636638082");
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
        boolean result= user.mobile.validate("919636638082");
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
        boolean result= user.mobile.validate("9636638082");
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
        boolean result= user.mobile.validate("91 96366380823");
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
	try {
		boolean result=user.mobile.validate("");
	}catch(LoginException e){
		System.out.println(e.eo+"  "+e.getMessage());
		Assert.assertEquals(LoginException.ExceptionType.EMPTY,e.eo);
	}
    }
     @Test
    public void if_mobilenumber_null_return_false()
    {
        try {
            boolean result =user.mobile.validate(null);

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
        boolean result= user.password.validate("Abc5@");
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
        boolean result= user.password.validate("Abc567@");
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
        boolean result= user.password.validate("Abcdrf567@");
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
        boolean result= user.password.validate("abcfd567@");
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
        boolean result= user.password.validate("Abcdefghy@");
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
        boolean result= user.password.validate("Abcef567@");
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
        boolean result= user.password.validate("Abcdefrg567@");
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
        boolean result= user.password.validate("Abcdfrg567");
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
		boolean result=user.password.validate("");
	}catch(LoginException e){
		System.out.println(e.eo+" "+e.getMessage());
		Assert.assertEquals(LoginException.ExceptionType.EMPTY,e.eo);
	}
    }
     @Test
    public void if_password_null_return_false()
    {
        try {
            boolean result = user.password.validate( null);

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
        boolean result= user.email.validate("abc.xyz@gmail.com");
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
        boolean result= user.email.validate("abc.xyz@@gmail.com");
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
		boolean result=user.email.validate("");
	}catch(LoginException e){
		System.out.println(e.eo+"  "+e.getMessage());
		Assert.assertEquals(LoginException.ExceptionType.EMPTY,e.eo);
	}
    }
     @Test
    public void if_email_null_return_false()
    {
        try {
            boolean result = user.email.validate(null);

        }
        catch (LoginException e)
        {
           System.out.println(e.eo+" "+e.getMessage());
           Assert.assertEquals(LoginException.ExceptionType.NULL,e.eo);
        }

    }
	
    
}