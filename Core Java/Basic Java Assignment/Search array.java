package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 15 elements: ");
        int[] array = new int[15];
        for(int i = 0; i< array.length; i++)
            array[i] = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Value to check : ");
        int valueToCheck = scan.nextInt();
        boolean isThere=false;
        for (int j=0; j< array.length; j++) {
            if (array[j] == valueToCheck){
                 isThere=true;
                System.out.println("Array contains "+valueToCheck);
            }
        }if (!isThere)
            System.out.println("Array doesn't contain "+valueToCheck);
    }
}
