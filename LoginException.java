package com.bridgelabz.JunitTest;
import java.util.*;
import java.io.*;

public class LoginException extends  Exception{
enum ExceptionType
{
    NULL,EMPTY,INVALID_FIRST_NAME,INVALID_LAST_NAME,INVALID_MOBILE_NUMBER,INVALID_PSWD,INVALID_EMAIL;
}
ExceptionType e;
    public LoginException(ExceptionType e,String message) {
        super(message);
        this.e=e;
    }
}