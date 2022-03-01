package ListToArray;

import java.util.Arrays;
import java.util.List;

public class listArray {

    public static void main(String[] args) {
        String str = "A quick brown fox jumps over the lazy dog";
        String[] str1 = str.split(" ");
        List<String> ls = Arrays.asList(str1);

        System.out.println(Arrays.toString(ls.toArray(String[]::new)));
    }

}
