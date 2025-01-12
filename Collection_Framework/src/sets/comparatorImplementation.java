package sets;
import java.util.*;

class Student{
    int roll; String name;
    Student(int roll, String name){this.roll=roll;this.name = name;}

    @Override
    public String toString() {
        return "Roll No- " + roll + " Name- " + name + "\n";
    }
//    @Override
//    public int compare(Student s1, Student s2){
//        return s1.roll - s2.roll;
//    }
}
class sortRoll implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.roll - o2.roll;
    }
}
class sortName implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        return o1.name.compareTo(o2.name);
    }
}

//class isEqualRollNo implements Comparator<Student>{
//    @Override
//    public int equals(Student o1) {
//        return o1.roll;
//    }
//}

public class comparatorImplementation {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();

        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Mayank"));
        ar.add(new Student(131, "Anshul"));
        ar.add(new Student(121, "Solanki"));
        ar.add(new Student(101, "Aggarwal"));
        System.out.println("Before: ");
        System.out.println(ar);
        ar.sort(new sortRoll());
        System.out.println("After: ");
        System.out.println(ar);
        ar.sort(new sortName());
        System.out.println(ar);

    }
}
