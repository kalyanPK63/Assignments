package FirstletterOfEachWord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SB {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        StringBuilder str = new StringBuilder();

        perform(ls,c -> str.append(c));
        System.out.println(str);
    }

    private static void perform(List<String> ls, Consumer<Character> consumer){
        for (String s : ls) {
            Character c = (s.charAt(0));
            consumer.accept(c);
        }
    }
}
