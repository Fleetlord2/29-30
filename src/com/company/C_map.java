package com.company;

import java.util.Comparator;
import java.util.Map;

public class C_map implements Comparator<Map.Entry> {

    @Override
    public int compare(Map.Entry o1, Map.Entry o2) {
        int compare = 0;
        Long long_1 = (Long) o1.getValue();
        Long long_2 = (Long) o2.getValue();
        if(long_1 > long_2) compare = -1;
        if(long_1 < long_2) compare = 1;
        if (long_1 == long_2)
        {
            String string_1 = (String) o1.getKey();
            String string_2 = (String) o2.getKey();
            compare = string_1.compareTo(string_2);
        }
        return compare;
    }

}