package KeyValuePairs;

import java.util.HashMap;
public class ToStrings {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("lol", 24);
        map.put("hell", 27);
        map.put("hello", 25);
        String str = null;
        for (String key : map.keySet()) {
            str = key;
            System.out.println(str);
            StringBuilder sb = new StringBuilder();
            System.out.println(sb.append(str));
        }



    }
}
