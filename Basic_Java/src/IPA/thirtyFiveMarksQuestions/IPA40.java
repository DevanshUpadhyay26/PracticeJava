package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class SolutionRnner
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[2];
        for (int i = 0; i < s.length; i++)
        {
            String fName = sc.nextLine();
            String Lname = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            char gen = sc.nextLine().charAt(0);
            String rollNo = sc.nextLine();
            String course = sc.nextLine();
            int sem = sc.nextInt();
            sc.nextLine();
            double gpa = sc.nextDouble();
            sc.nextLine();
            if (i < s.length - 1) sc.nextLine();
            s[i] = new Student(fName, Lname, age, gen, rollNo, course, sem, gpa);
        }
        Faculty[] f = new Faculty[2];
        for (int i = 0; i < f.length; i++)
        {
            String fName = sc.nextLine();
            String Lname = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            char gen = sc.nextLine().charAt(0);
            String empId = sc.nextLine();
            String dept = sc.nextLine();
            String desig = sc.nextLine();
            double sal = sc.nextDouble();
            if (i < f.length - 1) sc.nextLine();
            f[i] = new Faculty(fName, Lname, age, gen, empId, dept, desig, sal);
        }
        Student[] ansOne = findHighestGPAStudent(s);
        if (ansOne != null)
        {
            System.out.println(ansOne[0].getRollNo() + "\n" + ansOne[0].getCourse() + "\n" + ansOne[0].getGpa());
        }
        else {
            System.out.println("Meow");
        }

        Faculty[] ansTwo = findHighestPaidFaculty(f);
        if (ansTwo != null)
        {
            System.out.println(ansTwo[0].getEmpId() + "\n" + ansTwo[0].getDept() + "\n" + ansTwo[0].getSal());
        }
        else {
            System.out.println("Meow");
        }

        sc.close();


    }

    public static Student[] findHighestGPAStudent(Student[] s)
    {
        //Returns Highest GPA student data

        int count = 0;
        for (int i = 0; i < s.length; i++)
        {
            count++;
        }

        if (count < 1) {
            return null;
        }

        Student[] sortedS = new Student[count];
        int index = 0;
        for (int i = 0; i < s.length; i++)
        {
            sortedS[index] = s[i];
            index++;
        }

        for (int i = 0; i < sortedS.length - 1; i++)
        {
            for (int j = 0; j < sortedS.length - i - 1; j++)
            {
                if (sortedS[j].getGpa() < sortedS[j + 1].getGpa())
                {
                    Student temp = sortedS[j];
                    sortedS[j] = sortedS[j + 1];
                    sortedS[j + 1] = temp;
                }
            }
        }
        return sortedS;
    }
    public static Faculty[] findHighestPaidFaculty(Faculty[] f)
    {
        //highest salary

        int count = 0;
        for (int i = 0; i < f.length; i++)
        {
            count++;
        }
        if (count < 1) {
            return null;
        }

        Faculty[] sortedF = new Faculty[count];
        int index = 0;
        for (int i = 0; i < f.length; i++)
        {
            sortedF[index] = f[i];
            index++;
        }
        for (int i = 0; i < sortedF.length - 1; i++)
        {
            for (int j = 0; j < sortedF.length - i - 1; j++)
            {
                if (sortedF[j].getSal() < sortedF[j + 1].getSal())
                {
                    Faculty temp = sortedF[j];
                    sortedF[j] = sortedF[j + 1];
                    sortedF[j + 1] = temp;
                }
            }
        }

        return sortedF;
    }
}


class Person
{
    private int age;
    private String FName, LName;
    private char gender;


    public int getAge() {
        return age;
    }
    public String getFName() {
        return FName;
    }
    public String getLName() {
        return LName;
    }
    public char getGender() {
        return gender;
    }



    public void setAge(int age) {
        this.age = age;
    }
    public void setFName(String FName) {
        this.FName = FName;
    }
    public void setLName(String LName) {
        this.LName = LName;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }


    Person(String FName, String LName, int age, char gender)
    {
        this.FName = FName;
        this.LName = LName;
        this.age = age;
        this.gender = gender;
    }

}

class Student extends Person
{
    private String rollNo, course;
    private int sem;
    private double GPA;

    public String getRollNo() {
        return rollNo;
    }
    public String getCourse() {
        return course;
    }
    public int getSem() {
        return sem;
    }
    public double getGpa() {
        return GPA;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setSem(int sem) {
        this.sem = sem;
    }
    public void setGpa(double GPA) {
        this.GPA = GPA;
    }

    Student(String FName, String LName, int age, char gender, String rollNo, String course, int sem, double GPA)
    {
        super(FName, LName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.sem = sem;
        this.GPA = GPA;
    }
}

class Faculty extends Person
{
    private String empId, dept, desig;
    private double sal;

    public String getEmpId() {
        return empId;
    }
    public String getDept() {
        return dept;
    }
    public String getDesig() {
        return desig;
    }
    public double getSal() {
        return sal;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setDesig(String desig) {
        this.desig = desig;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }

    Faculty(String FName, String LName, int age, char gender, String empId, String dept, String desig, double sal)
    {
        super(FName, LName, age, gender);
        this.empId = empId;
        this.dept = dept;
        this.desig = desig;
        this.sal = sal;
    }
}

/*
First1
Last1
20
M
Roll1
Course1
2
3.8
First2
Last2
21
F
Roll2
Course2
3
3.9
Faculty1
Last3
35
M
ID1
Department1
Associate Professor
90000.0
Faculty2
Last4
40
F
ID2
Department2
Professor
100000.0
*/

/*Question
Create a class Person with the following attributes:

firstName - String
lastName - String
age - int
gender - char ('M' for male and 'F' for female)

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Student that extends the Person class and adds the following attributes:

rollNo - String
course - String
semester - int
GPA - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Faculty that extends the Person class and adds the following attributes:

employeeId - String
department - String
designation - String
salary - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - findHighestGPAStudent and findHighestPaidFaculty in Solution class.

findHighestGPAStudent method:
This method will take an array of Student objects as input.
The method will return the Student object with the highest GPA.
If the array is empty, the method should return null.

findHighestPaidFaculty method:
This method will take an array of Faculty objects as input.
The method will return the Faculty object with the highest salary.
If the array is empty, the method should return null.

These above mentioned static methods should be called from the main method.

For findHighestGPAStudent method - The main method should print the roll number, course and GPA of the returned Student object. If the returned value is null then it should print "Sorry - No student is available".

For findHighestPaidFaculty method - The main method should print the employee ID, department and salary of the returned
Faculty object. If the returned value is null then it should print "Sorry - No faculty is available".

Before calling these static methods in main, use Scanner object to read the values of two Student objects and two Faculty
objects referring attributes in the above mentioned attribute sequence.

Example Input:

First1
Last1
20
M
Roll1
Course1
2
3.8
First2
Last2
21
F
Roll2
Course2
3
3.9
Faculty1
Last3
35
M
ID1
Department1
Associate Professor
90000.0
Faculty2
Last4
40
F
ID2
Department2
Professor
100000.0
Output:

Roll2
Course2
3.9
ID2
Department2
100000.0






* */