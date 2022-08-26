package com.codewithcaleb.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {


    //Static methods can be easily called without having to keep instantiating an Object
    public static void show(){

        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }


    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
