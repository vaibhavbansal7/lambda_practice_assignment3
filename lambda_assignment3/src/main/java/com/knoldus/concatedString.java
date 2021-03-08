package com.knoldus;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface inputString {
    String merge(String a, String b, String c, String d, String e, String f, String g);
}

public class concatedString {
    public static void main (String[] args){

        inputString concat =  (a, b, c, d, e, f, g) -> (a + b + c + d + e + f + g).toUpperCase();
        String concatedString = concat.merge("The", "lambda", "has","too", "many" ,"string", "arguments");

        System.out.println(concatedString);
    }
}
