package com.oops;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("StringBuffer ");
        System.out.println(str.append("is a peer class of String " + "that provides much of " + "the functionality of strings"));
        StringBuilder str2 = new StringBuilder("It is used to at the specified index position");
        System.out.println(str2.insert(14, "insert text "));
        StringBuilder str3 = new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println(str3.reverse());
    }
}
