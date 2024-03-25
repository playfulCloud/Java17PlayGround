package org.example.stringsAndIOs;

import java.util.List;

public class ShowMeSomeIOs {

    public void more(){
        System.out.println("0  0".length());
        System.out.println("".isEmpty());


        // to remember indexOf can take substring
        // if substring is not present it returns the negative value
        System.out.println("  *** indexMe *****".indexOf("indexMe"));
        regularExpr("wrong");
    }

    public void regularExpr(String toSeekFrom){
        // we can use matches to check whenever string matches some regular exp
        // convinient
        System.out.println(toSeekFrom.matches("[a-z]+"));

        System.out.println("Foo".equalsIgnoreCase("fOO"));
        // content equals -> checks char  | equlas -> checks strings
        // contetnEquals can also check StringBuilder StringBuffer etc.
        System.out.println("Foo".contentEquals("fOO"));

        //check if string contains substring
        System.out.println("John".contains("Doe"));

        // startsWith and endsWith pretty similar to contains but without first and last character
        System.out.println("IOStrainings".startsWith("IOStraining"));
        // but it must contains begging or ending
        System.out.println("IOStrainings".startsWith("trai"));

        //Compares string lexicographically
        System.out.println("aBc".compareTo("Abc"));

        // substring return
        System.out.println("FooBar".substring(2));

        System.out.println(String.format("%s , %d , %s","first",2,"third"));

        var separateMeWithAsterix = List.of("foo", "bar","john","doe");
        // join is awesome but it join -> seperate with something only between words
        System.out.println(String.join(" *** ",separateMeWithAsterix));
    }
}
