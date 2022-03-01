package KeyValuePairs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class KeyvalueToString {
    public static String conversion(HashMap<String, Integer> map) {
        StringBuilder SB = new StringBuilder();
        Consumer <Map.Entry> c = i-> SB.append(i.getKey()).append(i.getValue());
        Set< Map.Entry <String, Integer> > s  = map.entrySet();
        s.forEach(c);
        return SB.toString();
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Car",10);
        map.put("Aeroplane",20);
        map.put("Doll",30);
        Consumer k = i -> System.out.println(conversion(map));
        k.accept(map);
    }
}
