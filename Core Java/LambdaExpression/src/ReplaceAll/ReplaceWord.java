package ReplaceAll;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceWord {
    public static void main(String args[]) {

        List<String> s = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        UnaryOperator<String> UOp = (String text) -> text;

        for (String st : s) {
            String newText = UOp.apply(st);
            System.out.println(newText.replaceAll(newText, newText.toUpperCase()));
        }

    }

}
