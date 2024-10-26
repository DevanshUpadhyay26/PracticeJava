package IPA.thirtyFiveMarksQuestions;

import java.util.Scanner;

class CodechefHEHE
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter company name: ");
        String name = sc.nextLine();
        System.out.print("Enter number of employees: ");
        int totalEmp = sc.nextInt();sc.nextLine();
        System.out.println("Enter employee details: ");
        Employee3[] emp = new Employee3[totalEmp];
        for(int i = 0;i<emp.length;i++)
        {
            System.out.println("Employee " + (i+1));
            System.out.print("Enter ID: ");
            int id = sc.nextInt();sc.nextLine();
            System.out.print("Enter EName: ");
            String Ename = sc.nextLine();
            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();sc.nextLine();
            emp[i] = new Employee3(id,Ename,designation,salary);
        }
        Company comp = new Company(name, emp, totalEmp);
        System.out.println("Avg Salary: " + comp.getAverageSalary(emp));
        System.out.println("Max Salary: " + comp.getMaxSalary(emp));
        System.out.print("Employees with designation: ");
        String inputDesignation = sc.nextLine();

        Employee3[] ansThree = comp.getEmployeesByDesignation(emp, inputDesignation);
        if(ansThree != null)
        {
            for(int i =0 ;i<ansThree.length;i++)
            {
                System.out.println("ID: " + ansThree[i].getId() + ", "+ "Name: "+ ansThree[i].getName()+ ", " + "Designation: " + emp[i].getDesignation() + ", "+ "Salary" + emp[i].getSalary());
            }
        }
        else{System.out.println("Meow");}
        sc.close();

    }





}

class Company{
    private String companyName;
    private Employee3[] emp;
    private int numEmp;

    Company(String companyName, Employee3[] emp, int numEmp)
    {
        this.companyName = companyName;
        this.emp = emp;
        this.numEmp = numEmp;
    }

    public static double getAverageSalary(Employee3[] emp)
    {
        double sum = 0;
        int count = 0;
        for(int i =0; i<emp.length;i++)
        {
            sum+=emp[i].getSalary();
            count++;
        }
        if(sum<0){return 0;}
        return sum/count;
    }

    public static double getMaxSalary(Employee3[] emp)
    {
        int count = 0;
        for(int i=0; i<emp.length;i++)
        {
            count++;
        }
        if(count<1){return 0;}
        for(int i =0; i<emp.length -1 ;i++)
        {
            for(int j =0; j<emp.length - i -1;j++)
            {
                if(emp[j].getSalary() < emp[j+1].getSalary())
                {
                    Employee3 temp = emp[j];
                    emp[j] = emp[j+1];
                    emp[j+1] = temp;
                }
            }
        }
        return emp[0].getSalary();
    }

    public static Employee3[] getEmployeesByDesignation(Employee3[] emp, String designation)
    {
        int count = 0;
        for(int i =0; i <emp.length;i++)
        {
            if(emp[i].getDesignation().equalsIgnoreCase(designation)){count++;}
        }
        if(count<1){return null;}
        Employee3[] newEmp = new Employee3[count];
        int index = 0;
        for(int i =0; i <emp.length;i++)
        {
            if(emp[i].getDesignation().equalsIgnoreCase(designation))
            {
                newEmp[index] = emp[i];
                index++;
            }
        }
        return newEmp;
    }
}

class Employee3{
    private int id;
    private String name, desi;
    private double sal;



    public int getId(){return id;}
    public String getName(){return name;}
    public String getDesignation(){return desi;}
    public double getSalary(){return sal;}

    public void setId(int id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setDesignation(String desi){this.desi = desi;}
    public void setSalary(double sal){this.sal = sal;}

    Employee3(int id, String name, String desi, double sal)
    {

        this.id = id;
        this.name = name;
        this.desi = desi;
        this.sal = sal;
    }

}

