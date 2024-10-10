package arrays.arrayObjectsPractice;

import java.util.Arrays;
import java.util.Scanner;

class Student {
    private String name, grade;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Student(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}




public class practiceTwo {


    public static  int getNumericGrade(String grade){
        switch (grade) {
            case "A": return 4;
            case "B": return 3;
            case "C": return 2;
            case "D": return 1;
            case "F": return 0;
            default: return -1; // Invalid grade
        }
    }
    public static Student[] sortStudentsByGrade(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                //Compare the next grade with current grade So it will be A < B? replace:return grade
                if (getNumericGrade(students[j].getGrade()) < getNumericGrade((students[j + 1].getGrade()))) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }

        }
        return students;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i<students.length ; i++ ) {
            String name = sc.nextLine();
            int age = sc.nextInt();sc.nextLine();
            String grade = sc.nextLine();
            students[i]= new Student(name,age,grade);
        }


        Student[] getSorted = sortStudentsByGrade(students);
            for (int i = 0; i < getSorted.length ; i++) {
                System.out.println("{name='" + students[i].getName() + "', age=" + students[i].getAge()  + ", grade='" + students[i].getGrade()  + "'}");
        }
        }
}
