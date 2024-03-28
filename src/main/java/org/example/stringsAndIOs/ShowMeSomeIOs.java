package org.example.stringsAndIOs;


import org.example.Main;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.Objects;

public class ShowMeSomeIOs {

    public void more(){
        System.out.println("0  0".length());
        System.out.println("".isEmpty());


        // to remember indexOf can take substring
        // if substring is not present it returns the negative value
        System.out.println("  *** indexMe *****".indexOf("indexMe"));
//        regularExpr("wrong");
//        imNotReplaceable();
//        readSomeBytes();
        files();
        seriesOfSerializables();
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


    public void imNotReplaceable(){
        // we can replace substring
        //we can also replace first ocurrence of some substring
        System.out.println("fooobarfoooobarfooobar".replace("foo","john"));
        String imBadWithFunctionalMe = "playfulCloud";
        var filtredChars = imBadWithFunctionalMe.chars()
                .filter(x -> x == 97)
                .map(x -> x*x).boxed().toList();
        System.out.println(filtredChars);
        System.out.println("DoeDoWhatDoesDoes".repeat(3));
    }

    public void readSomeBytes(){
        byte[] bytes = new byte[]{83,93,73};
        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes)){
           int data = inputStream.read();
           while(data != -1){
               System.out.println((char) data);
               data = inputStream.read();
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void files(){
        String uri = Objects.requireNonNull(Main.class.getClassLoader().getResource("resources")).getFile();
        try(FileInputStream inputStream = new FileInputStream(uri)){
           while(inputStream.read() != -1) {
               System.out.println((char) inputStream.read());
           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void seriesOfSerializables(){
       try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("someClass.bin"));
           ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("someClass.bin"))
       ) {
         Dummy dummy = new Dummy();
         objectOutputStream.writeObject(dummy);

         Object readDummy = (Dummy) objectInputStream.readObject();

           System.out.println(((Dummy) readDummy).lvl);

       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }

    }


}















