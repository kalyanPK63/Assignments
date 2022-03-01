package Traders;

import java.util.Comparator;

public class NameComparator implements Comparator<Trader> {
    @Override
    public int compare(Trader o1, Trader o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
