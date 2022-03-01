package Add10Elements;

import java.util.*;

public class ProductObject_hashSet {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "id", "name", "features", "a", "b", "Company","7", "8", "model", "brand", "a", "b");

        Set<String> set = new HashSet<>(collection);
        System.out.println(set);
    }
}
