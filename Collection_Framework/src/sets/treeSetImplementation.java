package sets;

import java.util.*;

public class treeSetImplementation {
    public static void main(String[] args) {
        TreeSet<Student> treeset = new TreeSet<Student>(new sortRoll());
        treeset.add(new Student(1,"Devansh"));
        treeset.add(new Student(11,"Amrit"));
        treeset.add(new Student(22,"Komal"));
        treeset.add(new Student(13,"Pavithra"));
        treeset.add(new Student(4,"Sohail"));
        treeset.add(new Student(44,"Shobhan"));
        treeset.add(new Student(21,"Aryan"));
//        System.out.println(treeset);
//        System.out.println(treeset.headSet(new Student(22,"Komal")));
//        System.out.println(treeset.tailSet(new Student(13,"Pavithra")));
//        System.out.println(treeset.first());
//        System.out.println(treeset.last());
//        System.out.println(treeset.subSet(new Student(1,"Devansh"),new Student(13, "Pavithra")));
//        System.out.println(treeset.lower(new Student(22, "Komal")));
//        System.out.println(treeset.floor(new Student(22, "Komal")));
//        System.out.println(treeset.ceiling(new Student(22, "Komal")));
//        System.out.println(treeset.higher(new Student(22, "Komal")));
//        System.out.println(treeset.pollFirst() + "\n" + treeset.pollLast());
//        System.out.println(treeset.descendingSet());
//        Iterator<Student> itr = treeset.descendingIterator();
//        while (itr.hasNext())
//            System.out.println(itr.next());



    }
}
