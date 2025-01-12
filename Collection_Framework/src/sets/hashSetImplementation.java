package sets;

import java.util.HashSet;

public class hashSetImplementation {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student(12,"Devansh"));
        hs.add(new Student(10,"Amrit"));
        hs.add(new Student(22,"Komal"));
        System.out.println(hs);
    }
}
