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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String toString(){
        return "Name: " + name + "\n"
                + "Salary: " + salary;
    }
}



public class practiceThree

{

    public static Employee[] getSortedSalary(Employee[] employee){

        for (int i = 0; i < employee.length-1; i++) {
            for (int j = 0; j < employee.length - i - 1 ; j++) {
                if (employee[j].getSalary() > employee[j+1].getSalary()){
                    Employee temp = employee[j];
                    employee[j] = employee[j+1];
                    employee[j+1] = temp;
                }
            }
        }

        return employee;

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Employee[] employees = new Employee[2];

        for (int i = 0; i < employees.length; i++) {
            String emp_name = sc.nextLine();
            Double emp_sal = sc.nextDouble();sc.nextLine();
            employees[i] = new Employee(emp_name, emp_sal);
        }


        Employee[] sortedSalar = getSortedSalary(employees);
//      DEBUG Code
//        for(int i = 0; i< sortedSalar.length; i++){
//            System.out.println(sortedSalar[i].getSalary());
//        }

        for (Employee emp: employees) {System.out.println(emp);}
        sc.close();


    }
}
