package arrays.arrayObjectsPractice;


import java.util.Arrays;
import java.util.Scanner;

class Employee{

    private String name;
    Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Name: " + name + "\n"
                + "Salary: " + salary;
    }
}



public class practiceThree

{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Employee[] employees = new Employee[4];

        for (int i = 0; i < employees.length; i++) {
            String emp_name = sc.nextLine();
            Double emp_sal = sc.nextDouble();sc.nextLine();
            employees[i] = new Employee(emp_name, emp_sal);
        }



        for (int i = 0; i < employees.length-1; i++) {
            for (int j = 0; j < employees.length - i - 1 ; j++) {
                if (employees[j].salary > employees[j+1].salary){
                    Employee temp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = temp;
                }
            }
        }


        for (Employee emp: employees) {System.out.println(emp);}
        sc.close();


    }
}
