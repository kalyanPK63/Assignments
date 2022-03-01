package RemoveIF;

import java.util.ArrayList;

public class FindLength {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("Name");
        str.add("Bot");
        str.add("New");
        str.add("Player");

        str.removeIf(s -> s.length()%2 != 0);
        System.out.println(str);
    }
}
