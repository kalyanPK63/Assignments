package com.company;

public class Main {

    public static void main(String[] args) {
        int min=100, max=999;
        for (int i=min; i<=max; i++){
            int sum = 0, temp_number=i, rem=0;
            while(temp_number>0){
                rem = temp_number%10;
                temp_number = temp_number/10;
                sum += (rem*rem*rem);

            }
            if(sum==i)
                System.out.println(i);
        }

    }
}
