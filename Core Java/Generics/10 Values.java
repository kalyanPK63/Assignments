package Generics;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args)
    {
        HashMap<Integer,Double> map=new HashMap<Integer,Double>();

        for (int i = 1; i < 11; i++) {
            for (double j = 1.0; j < 11.0; j++) {
                map.put(i,j);
            }
        }

        for(Map.Entry<Integer, Double> e: map.entrySet())
            System.out.println("Key : "+e.getKey()+" Value : "+e.getValue());

    }
}
