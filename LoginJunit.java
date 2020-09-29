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
        String firstname="Jitendra";
        boolean result= user.FirstNameValidation(firstname);
        Assert.assertEquals(false,result);

    }
    @Test
    public void if_No_of_char_less_than_three_return_false()
    {
        String firstname="Jp";
        boolean result= user.FirstNameValidation(firstname);
        Assert.assertEquals(false,result);

    }


}