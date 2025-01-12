package listImplementations;

import java.io.ObjectStreamException;
import java.util.*;
import static java.util.Collections.sort;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(1);alist.add(2);alist.add(3);alist.add(4);alist.add(5);

        for(int i =0; i<alist.size();i++) {
            System.out.print(alist.get(i) + " ");
        }
//        System.out.println(alist);
//        Object alisto = alist.clone(); // Shallow Copy
//        System.out.println(alisto);
//        System.out.println("A LIST 1: "+alist);
//        System.out.println(alist.contains(2)); // True
//        System.out.println(alist.get(1)); // return elements from the specified index
//        System.out.println(alist.size());
//        System.out.println(alist.lastIndexOf(1));
//        System.out.println(alist.isEmpty());
//        System.out.println(alist.remove(1));
//        alist.set(0,200);
//        sort(alist);

        List<Integer> alist2= new ArrayList<>(alist);
        alist2.add(6);alist2.add(7);alist2.add(8);alist2.add(9);alist2.add(10);


        List<Integer> alist3=  new ArrayList<>();
        alist3.addAll(alist2);
        alist3.add(11);alist3.add(12);alist3.add(13);alist3.add(14);alist3.add(15);


        List<Integer> alist4 = alist3.subList(0,10);
        alist4.set(0,100);              // Shallow Copy

//        System.out.println("A LIST 1: "+alist);
//        System.out.println("A LIST 2: "+alist2);
//        System.out.println("A LIST 3: "+alist3);
//        System.out.println("A LIST 4: "+alist4);
    }
}
