package FunctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Interface {
    static String name = "James";
    public static void main(String[] args) {
        Consumer<Integer> output = System.out::println;
        for (int i = 0; i < 4; i++) {
            output.accept(i);
        }

        Supplier<Integer> output2 = () -> name.length();
        System.out.println("Length of String = "+ output2.get());

        Predicate<String> output3 = y -> name.length() == 10;
        System.out.println(output3.test(name));

        double b = 5.0;
        Function<Integer, Double> division = t -> t/b;
        System.out.println(division.apply(10));
    }
}
