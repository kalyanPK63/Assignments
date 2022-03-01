package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int p, time;
        double rate, SI, CI;
        Scanner input = new Scanner(System.in);
        System.out.print("p = ");
        p = input.nextInt();
        System.out.print("t (Years) = ");
        time =input.nextInt();
        System.out.print("r (Percentage) = ");
        rate = input.nextFloat();

        double r = rate/100;
        int t = time*12;

        SI = (p*t*r)/100;
        CI = p*(Math.pow((1+r),t))-p;

        System.out.println("Simple Interest = "+SI);
        System.out.println("Compound Interest = "+CI);
    }
}
