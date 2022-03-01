import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0, temp_number=0, rem=0;
        temp_number = number;
        while(temp_number>0){
            rem = temp_number%10;
            temp_number = temp_number/10;
            sum += (rem*rem*rem);
        }
        if(sum==number)
            System.out.println("the given number is an Armstrong number");
        else
            System.out.println("the given number is not an Armstrong number");
    }
}