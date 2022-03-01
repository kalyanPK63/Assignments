package treeMap_keyValuePairs;

import java.util.Collections;
import java.util.TreeMap;

public class maps {

    public static void main(String[] args) {

        var c1 = new Contacts(9876543210L,"c1","c1@gamil.com");
        var c2 = new Contacts(1234567890L,"c2","c2@gamil.com");
        var c3 = new Contacts(3216549870L,"c3","c3@gamil.com");
        var c4 = new Contacts(7894561230L,"c4","c4@gamil.com");
        TreeMap<Long,Contacts> cont = new TreeMap<>(Collections.reverseOrder());
        cont.put(c1.getPhoneNumber(),c1);
        cont.put(c2.getPhoneNumber(),c2);
        cont.put(c3.getPhoneNumber(),c3);
        cont.put(c4.getPhoneNumber(),c4);

        for (var key : cont.keySet())
            System.out.println(key);
        for (var values : cont.values())
            System.out.println(values);
        System.out.println(cont);


    }

}
