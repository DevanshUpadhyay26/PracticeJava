package maps;

public class Student{
    int roll; String name;
    Student(int roll, String name){this.roll=roll;this.name = name;}

    @Override
    public String toString() {
        return "Roll No- " + roll + " Name- " + name + "\n";
    }
}
