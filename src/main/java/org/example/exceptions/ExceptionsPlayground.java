package org.example.exceptions;

import org.example.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionsPlayground {


    public void showMeSomething(){
        // exceptions are catched in hierarchy from youngest to oldest
       Object object = new Object();
        try {
            System.out.println(object.hashCode());
        }catch (NullPointerException e) {
            System.out.println("catched");
        }catch ( Exception exception){
            System.out.println("catched something else");
        }finally {
            // it is exectued no matter what;
            object = new ArrayList<String>();
            System.out.println(object);
        }
    }

    // try with resources closes the "resources" after operatons
    // we do not catch the exc just throws it in method signature
    public void doSomethingWithResources() throws FileNotFoundException{
        // when we want to get some files no matter the os etc we can put them in resources packet and then we can get it with URL below
        URL placeForFilesEtc = Main.class.getClassLoader().getResource("resources");
        try(Scanner scanner = new Scanner(new File(placeForFilesEtc.getPath()))){
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
    }

    public void frytMeBabyOneMoreTime() throws MyExc {
        throw new MyExc("test");
    }

}
