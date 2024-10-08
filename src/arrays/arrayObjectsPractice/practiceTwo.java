package arrays.arrayObjectsPractice;

import java.util.Scanner;

class Student {
    private String name, grade;
    private int age;

    Student(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void isPassed(){
        switch (grade) {
            case "A":
                System.out.println("Distinction 100% !");
                break;
            case "B":
                System.out.println("Scored 90% !");
                break;
            case "C":
                System.out.println("Scored 80% !");
                break;
            case "D":
                System.out.println("Scored 70% !");
                break;
            case "F":
                System.out.println("Failed :( ");
                break;
            default:
                break;
        }
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade='" + grade + "'}";
    }
}




public class practiceTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[1];

        for (int i = 0; i<students.length ; i++ ) {
            String name = sc.nextLine();
            int age = sc.nextInt();sc.nextLine();
            String grade = sc.nextLine();
            students[i]= new Student(name,age,grade);
        }

        for (Student obj: students ){
            System.out.println(obj);
            obj.isPassed();
        }

    }
}
