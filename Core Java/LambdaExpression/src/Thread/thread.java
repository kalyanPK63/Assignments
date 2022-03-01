package Thread;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class thread {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10,20,51,6,98,69,79,99);
        new Thread(() -> System.out.println(ls)).start();
        Consumer<List> c = i -> System.out.println(ls);
        c.accept(ls);
    }
}
