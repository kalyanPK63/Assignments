package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sp=" ";
        System.out.println("Enter the Username");
        String credentials_ID = sc.nextLine();
        if((credentials_ID.contains(sp)) || credentials_ID.length()<4){
            System.out.println("Invalid Username");
            return;
        }

        System.out.println("Enter the Password");
        String credentials_Pass = sc.nextLine();
        if((credentials_Pass.contains(sp)) || credentials_Pass.length()<8){
            System.out.println("Invalid Password");
            return;
        }

        System.out.println(credentials_ID+" you are Registered Successfully");


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter userId");
        String userId = scan.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter Password");
        String password = scan2.nextLine();
        while (!userId.equals(credentials_ID) || !password.equals(credentials_Pass)){
            System.out.println("You have entered wrong credentials ,please enter the right credentials.");
            for (int i =0; i<2; i++){
                System.out.println("Enter userId");
                userId = scan.nextLine();
                System.out.println("Enter Password");
                password = scan2.nextLine();
                if(userId.equals(credentials_ID) && password.equals(credentials_Pass))
                    break;
                if (i==1)
                    System.out.println("You have entered wrong credentials 3 times");
                else
                    System.out.println("You have entered wrong credentials ,please enter the right credentials.");
            }
            break;
        }
        if(userId.equals(credentials_ID) && password.equals(credentials_Pass))
            System.out.println("Welcome "+userId);
    }
}
