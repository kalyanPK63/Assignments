package Traders;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Trader> ls = Arrays.asList(new Trader("John", "Pune"),
                new Trader("Jacky", "Pune"),
                new Trader("Poul", "Delhi"),
                new Trader("Vicky", "Indore"),
                new Trader("James", "Assam"));

        ls.forEach(c -> System.out.println(c.getName()));

        ls.stream().filter(c -> c.getCity().equals("Pune"))
                .sorted(new NameComparator()).forEach(System.out::println);

        StringBuilder sb = new StringBuilder();
        ls.stream().sorted(new NameComparator()).forEach(p-> sb.append(p.getName()));
        System.out.println(sb);

        ls.forEach(c-> System.out.println(c.getCity().equals("Indore")));
    }
}
