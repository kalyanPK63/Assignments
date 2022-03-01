package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter CTC : ");
        int ctc = scan.nextInt();
        if(ctc>=1_81_001 && ctc<=3_00_000)
            System.out.println(ctc*.1);
        else if (ctc>=300001&& ctc<=500000)
            System.out.println(ctc*.2);
        else if (ctc>=500001 && ctc<=1000000)
            System.out.println(ctc*.3);
        else
            System.out.println("Nil");
    }
}
