package com.bridgelabz.JunitTest;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginJunit {
    LoginMain user= new LoginMain();
    @Test
    public void first_name_validation_if_return_true()
    {
        String firstname="Jitendra";
        boolean result= user.FirstNameValidation(firstname);
        Assert.assertEquals(true,result);

    }
    @Test
    public void first_name_validation_if_return_false()
    {
        String firstname="jitendra";
        boolean result= user.FirstNameValidation(firstname);
        Assert.assertEquals(false,result);

    }
    @Test
    public void if_No_of_char_less_than_three_return_false()
    {
        String firstname="Ji";
        boolean result= user.FirstNameValidation(firstname);
        Assert.assertEquals(false,result);

    }
    @Test
    public void last_name_validation_if_return_true()
    {
        String lastname="Patel";
        boolean result= user.LastNameValidatation(lastname);
        Assert.assertEquals(true,result);

    }
    @Test
    public void last_Name_validation_if_return_false()
    {
        String lastname="patel";
        boolean result= user.LastNameValidatation(lastname);
        Assert.assertEquals(false,result);

    }
    @Test
    public void if_no_of_char_less_than_three_return_false()
    {
        String lastname="Pa";
        boolean result= user.LastNameValidatation(lastname);
        Assert.assertEquals(false,result);

    }
    @Test
    public void mobile_pattern_matches_return_true()
    {
        String mobile="91 9636638082";
        boolean result= user.MobileValidate(mobile);
        Assert.assertEquals(true,result);

    }
    @Test
    public void more_than_one_space_after_country_code_return_false()
    {
        String mobile="91  9636638082";
        boolean result= user.MobileValidate(mobile);
        Assert.assertEquals(false,result);

    }
    @Test
    public void if_country_code_have_more_than_two_numers_return_false()
    {
        String mobile="911 9636638082";
        boolean result= user.MobileValidate(mobile);
        Assert.assertEquals(false,result);

    }
    @Test
    public void No_space_after_country_code_return_false()
    {
        String mobile="919636638082";
        boolean result= user.MobileValidate(mobile);
        Assert.assertEquals(false,result);

    }
    @Test
    public void if_countrycode_Not_given_return_false()
    {
        String mobile="9636638082";
        boolean result= user.MobileValidate(mobile);
        Assert.assertEquals(false,result);

    }
   @Test
    public void Moibile_number_is_more_than_ten_number_return_false()
    {
        String mobile="91 96366380823";
        boolean result= user.MobileValidate(mobile);
        Assert.assertEquals(false,result);

    }
    @Test
    public void password_has_less_than_8_chars_return_false()
    {
        String password="Abc5@";
        boolean result= user.PasswordValidation(password);
        Assert.assertEquals(false,result);

    }
    @Test
    public void password_is_greater_than_or_equal_to_8_chars_return_true()
    {
        String password="Abc567@";
        boolean result= user.PasswordValidation(password);
        Assert.assertEquals(true,result);

    }
    @Test
    public void password_has_at_least_one_capital_char_return_true()
    {
        String password="Abcdrf567@";
        boolean result= user.PasswordValidation(password);
        Assert.assertEquals(true,result);

    }
    @Test
    public void password_have_not_at_least_1_cap_return_false()
    {
        String password="abcfd567@";
        boolean result= user.PasswordValidation(password);
        Assert.assertEquals(false,result);

    }
    @Test
    public void password_have_not_at_least_1_number_return_false()
    {
        String password="Abcdefghy@";
        boolean result= user.PasswordValidation(password);
        Assert.assertEquals(false,result);

    }
    @Test
    public void password_have_at_least_1_number_return_true()
    {
        String password="Abcef567@";
        boolean result= user.PasswordValidation(password);
        Assert.assertEquals(true,result);

    }
    @Test
    public void password_have_one_special_char_return_true()
    {
        String password="Abcdefrg567@";
        boolean result= user.PasswordValidation(password);
        Assert.assertEquals(true,result);

    }
    @Test
    public void password_have_not_special_Char_return_false()
    {
        String password="Abcdfrg567";
        boolean result= user.PasswordValidation(password);
        Assert.assertEquals(false,result);

    }
    
}