package com.bridgelabz.JunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class EmailParamaterizedValidate {

    public String email;

    public EmailParamaterizedValidate(String email) {
        this.email = email;
    }

    @Parameters
    public static Collection input() {

        return Arrays.asList(new Object[]{"abc@yahoo.com",
        		"abc-100@yahoo.com","abc.100@yahoo.com",
                "abc-100@abc.net",
                "abc111@abc.com",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com",
               });
    }
    @Test
    public void given_correct_Email_must_return_true() throws LoginException {
        LoginMain l= new LoginMain();
        try {
            boolean result = l.EmailValidation(this.email);
            Assert.assertTrue(result);
        }
        catch (LoginException e)
        {
            System.out.println(e.eo+" "+e.getMessage());
            Assert.assertEquals(LoginException.ExceptionType.INVALID_EMAIL,e.eo);
        }
    }
}