package org.singleton.after;

public class Main{
    public static void main (String[] args){
        new FirstPage().setAndPrintSettings();
        new SecondPage().printSettings();
    }
}