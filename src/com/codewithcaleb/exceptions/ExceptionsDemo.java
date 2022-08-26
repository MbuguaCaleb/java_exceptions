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
           e.printStackTrace();
            // System.out.println(e.getMessage());
        }

    }

}
