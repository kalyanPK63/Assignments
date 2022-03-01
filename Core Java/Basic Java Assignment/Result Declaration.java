package Grading;

import java.util.Scanner;

public class ResultDeclaration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("marks =");
        int S1= scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        int S2 = scan2.nextInt();
        Scanner scan3 = new Scanner(System.in);
        int S3= scan3.nextInt();
        if (S1>60 && S2>60 && S3>60)
            System.out.println("Passed");
        else if((S1>60 && S2>60) || (S1>60 && S3>60) || (S2>60 && S3>60))
            System.out.println("Promoted");
        else if (S1<0 || S2<0 || S3<0)
            System.out.println("Enter Correct Marks");
        else
            System.out.println("Failed");
    }

}
