package Fruits;

import java.util.Comparator;

public class ColourComparator implements Comparator<Fruits> {
    @Override
    public int compare(Fruits o1, Fruits o2) {
        return o1.colour.compareTo(o2.colour);
    }
}
