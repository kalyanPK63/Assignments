package Fruits;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Fruits> fruit = Arrays.asList(new Fruits("Apple", 48, 60, "Red"),
                new Fruits("Orange", 47, 40, "Orange"),
                new Fruits("Pineapple", 55, 55, "Yellow"),
                new Fruits("Black berry", 44, 70, "Black"),
                new Fruits("Straw Berry", 41, 90, "Red"));

        fruit.stream()
                .filter(f -> f.calories<100)
                .forEach(f -> System.out.println(f.name));
        fruit.sort(new ColourComparator());
        System.out.println(fruit);
        for (Fruits f : fruit) {
            if(f.colour.equals("Red"))
                System.out.println(f);
        }

    }
}
