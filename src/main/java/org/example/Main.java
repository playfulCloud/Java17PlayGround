package org.example;

import org.example.exceptions.ExceptionsPlayground;
import org.example.exceptions.MyExc;

import java.io.FileNotFoundException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException, MyExc {
        ExceptionsPlayground exceptionsPlayground = new ExceptionsPlayground();
        exceptionsPlayground.showMeSomething();
        exceptionsPlayground.doSomethingWithResources();
        exceptionsPlayground.frytMeBabyOneMoreTime();
    }

}