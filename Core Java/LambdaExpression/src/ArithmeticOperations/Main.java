package ArithmeticOperations;

import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);
    double var1 = scan.nextDouble();
    Scanner scan2 = new Scanner(System.in);
    double var2 = scan2.nextDouble();

    public static void main(String[] args) {

        ArithmeticOperation sum = (a,b) -> a + b;
        ArithmeticOperation sub = (a,b) -> a - b;
        ArithmeticOperation prod = (a,b) -> a * b;
        ArithmeticOperation div = (a,b) -> a / b;

        Main calculate = new Main();
        System.out.println(calculate.operation(calculate.var1, calculate.var2, sum));
        System.out.println(calculate.operation(calculate.var1, calculate.var2, sub));
        System.out.println(calculate.operation(calculate.var1, calculate.var2, prod));
        System.out.println(calculate.operation(calculate.var1, calculate.var2, div));
    }

    private double operation(double a, double b, ArithmeticOperation ap){
        return ap.operation(a,b);
    }
}

interface ArithmeticOperation {
    double operation(double a, double b);
}
