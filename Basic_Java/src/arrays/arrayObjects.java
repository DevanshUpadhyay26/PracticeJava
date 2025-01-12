package arrays;


class Student{
    int marks;
    String name;

}

public class arrayObjects {
    public static void main(String[] args) {
        Student s1 = new Student(); s1.name="Devansh";  s1.marks=100;
        Student s2 = new Student(); s2.name="Ghost";  s2.marks=100;
        Student s3 = new Student(); s3.name="Soap";  s3.marks=100;
        Student s4 = new Student(); s4.name="Price";  s4.marks=100;

        Student[] tempStudentObject = {s1,s2,s3,s4};

        Student[] students = new Student[4];


        //Assinging Objects to array
        for (int i = 0; i < students.length; i++) {
            students[i] = tempStudentObject[i];
        }
        //For Printing da values
        for (Student student : students) {
            System.out.println(student.name + " : " + student.marks);
        }
    }
}
