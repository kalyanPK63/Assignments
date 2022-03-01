package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a =5;
        int b = 0;

        try{
            divide(a,b);
        }
        catch (ArithmeticException Excp ){
            System.out.println(Excp.getMessage());
        }
    }
     static int divide(int a, int b) throws ArithmeticException{
        if (b==0)
            throw new ArithmeticException("Shouldn't use 0 in denominator");
        else
            return a/b;
    }
}
