package SimpleIntrest;

import java.util.Scanner;

public class Main {
    interface Simple_Interest{
    double interest(int p, int t, int r);
}
    static Scanner scan = new Scanner(System.in);
    static int p = scan.nextInt();
    static Scanner scan2 = new Scanner(System.in);
    static int t = scan2.nextInt();
    static Scanner scan3 = new Scanner(System.in);
    static int r = scan3.nextInt();

    public static void main(String[] args) {
        Simple_Interest si = (p,t,r) -> p*t*r/100.0;
        System.out.println("Simple Interest = "+si.interest(p, t, r));
    }
}


