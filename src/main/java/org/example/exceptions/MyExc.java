package org.example.exceptions;

public class MyExc extends Exception{


    public MyExc(String message){
        super(message);

    }

    public void testCause(){
       super.getCause();
    }
}
