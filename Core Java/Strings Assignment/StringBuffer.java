package com.oops;

public class SB {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("StringBuffer ");
        System.out.println(str.append("is a peer class of String " + "that provides much of " + "the functionality of strings"));
        StringBuffer str2 = new StringBuffer("It is used to at the specified index position");
        System.out.println(str2.insert(14, "insert text "));
        StringBuffer str3 = new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println(str3.reverse());
    }
}
