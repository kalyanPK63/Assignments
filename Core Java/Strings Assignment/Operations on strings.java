package com.oops;

import java.util.Locale;

public class Operations {
    public static void main(String[] args) {
        String str = "Java String pool refers to collection of Strings which are stored in heap memory";
        String str2 = "java string pool refers to collection of strings which are stored in heap memory";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('a', '$'));
        if (str.contains("collection"))
            System.out.println("original String contains the word “collection”");
        System.out.println(str.equals(str2));
        System.out.println(str.toLowerCase().equals(str2));


    }
}


