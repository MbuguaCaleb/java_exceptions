package com.codewithcaleb.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

    //When we throw an exception the caller of this method shouls handle the exception
    public static void show() throws IOException{
        var account = new Account();

        //handling the exception thrown by the withdraw method
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            var cause = e.getCause();

            //i can get the method that causes that paritcular exception when chaining exceptions
            System.out.println(cause);
            System.out.println(cause.getMessage());
           //e.printStackTrace();
            // System.out.println(e.getMessage());
        }

    }

}
