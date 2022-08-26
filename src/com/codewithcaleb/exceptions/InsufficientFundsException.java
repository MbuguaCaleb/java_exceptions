package com.codewithcaleb.exceptions;

//checked--->Exception
//we should antiticipte and recover from
//unchecked(runtime)---->Runtime Exception
public class InsufficientFundsException  extends Exception{
    //default constructor
    public  InsufficientFundsException(){
        super("Insufficient funds in your account");
    }
    //Adding my Custom Message
    public  InsufficientFundsException(String message){
        super(message);
    }
}
