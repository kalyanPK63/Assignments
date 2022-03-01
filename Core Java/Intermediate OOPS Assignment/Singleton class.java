package com.oops;

public class Main {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
    }
}

class Singleton {
    private Singleton(){
    }
    private static Singleton object;
    public static Singleton getInstance() {
        if (object==null)
            object = new Singleton();
        return object;
    }
}
