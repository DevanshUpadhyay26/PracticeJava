package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechefoo
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Employee2[] emp = new Employee2[1];
        for(int i = 0; i<emp.length;i++)
        {
            String name = sc.nextLine();
            int age = sc.nextInt();sc.nextLine();
            double salary = sc.nextDouble();
            emp[i] = new Employee2(name, age, salary);
        }
        double ansOne = calculateYearlySalary (emp);
        if(ansOne != 0)
        {
            System.out.println("Yearly Salary: "+ansOne);
        }
        else{System.out.println("Meow");}

    }

    public static double calculateYearlySalary(Employee2[] emp)
    {
        if(emp.length<1){return 0;}
        double salaryy = 0.0;
        for(int i = 0; i<emp.length; i++)
        {
            salaryy = emp[i].getSalary() * 12;
        }
        return salaryy;
    }
    // LPA<=50000 -> 10% of LPA
    // LPA >= 50000 && LPA <= 100000  20% of LPA
    //
//    public static
}

class Employee2{
    private String name;
    private int age;
    private double salary;

    public int getAge(){return age;}
    public String getName(){return name;}
    public double getSalary(){return salary;}


    public void setAge(int age){this.age = age;}
    public void setName(String name){this.name = name;}
    public void setSalary(double salary){this.salary = salary;}

    Employee2(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

