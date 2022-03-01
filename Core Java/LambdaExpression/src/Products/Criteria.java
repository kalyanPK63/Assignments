package Products;

import java.util.Arrays;
import java.util.List;


public class Criteria {

    public static void main(String[] args) {

        List<Orders> order = Arrays.asList(
                new Orders(10111,"ACCEPTED"),
                new Orders(15000,"COMPLETED"),
                new Orders(7999,"COMPLETED"),
                new Orders(19999,"CANCELLED"));

        printAll(order, o -> o.getPrice()>10000 && (o.getStatus().equals("ACCEPTED") || o.getStatus().equals("COMPLETED")));
    }

    private static void printAll(List<Orders> order,Condition condition){
        for (Orders o: order) {
            if (condition.test(o))
                System.out.println(o);
        }
    }
}
interface Condition{
    boolean test(Orders o);
}
