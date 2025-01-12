package maps;

import java.util.Comparator;
import java.util.*;
import java.util.Iterator;
import java.util.Map;
//Comparator Implementation
class sortRoll implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.roll - o2.roll;
    }
}
class sortName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2){
        return o1.name.compareTo(o2.name);
    }
}



public class hashMapImplementation {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        Student s1 = new Student(11,"Amrit");
        Student s2 = new Student(1,"Devansh");
        mp.put(s1.roll, s1.name);
        mp.put(s2.roll, s2.name);

        Map<Integer, String> mpP = new HashMap<>();
        Student s3 = new Student(22,"Komal");
        mpP.put(s3.roll, s3.name);
        mp.putAll(mpP);
        mp.putIfAbsent(13, null);
        mp.replace(13, null, "Pavithra");
//        System.out.println(mp.size());
//        Collection<String>  val = mp.values();
//        for (String str: val) {System.out.println(str);}


        //Iterating through mapping
//        mp.forEach((key, value) -> System.out.println("Key: "+key + " Value: " + value ));
//        Iterator itr = mp.entrySet().iterator();
//        Iterator itr = mp.values().iterator();
//        Iterator itr = mp.keySet().iterator( );
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        

    }
}
