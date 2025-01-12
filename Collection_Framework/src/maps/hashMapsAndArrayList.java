package maps;

import java.util.*;

public class hashMapsAndArrayList {
    public static void main(String[] args) {
        /**
         * To Convert HSMPS to ARRL:
         *  1. Keys
         *  2. Values
         *  3. Key-values pairs
         * */

        Map<Integer, String> mp = new HashMap<>();
        Student s1 = new Student(11,"Amrit");
        Student s2 = new Student(1,"Devansh");
        mp.put(s1.roll, s1.name);
        mp.put(s2.roll, s2.name);

        //Keys

        Set<Integer> sets = mp.keySet();
        ArrayList<Integer> arr = new ArrayList<>(sets);
        System.out.println(arr);


        //Values

        Collection<String> val  = mp.values();
        ArrayList<String> arr_val= new ArrayList<>(val);
        System.out.println(arr_val);


        //Key Values

        Set<Map.Entry<Integer, String>> entrySet = mp.entrySet();
        ArrayList<Map.Entry<Integer, String>> entryArrayList = new ArrayList<>(entrySet);
        System.out.println(entryArrayList);
    }
}
