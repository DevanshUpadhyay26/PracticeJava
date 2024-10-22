//package IPA.thirtyFiveMarksQuestions;
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
//class Codechef112
//{
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        Scanner sc = new Scanner(System.in);
//        Employee2[] emp = new Employee2[5];
//        for(int i = 0; i<emp.length ; i++)
//        {
//            int id = sc.nextInt();sc.nextLine();
//            String name = sc.nextLine();
//            String dept =sc.nextLine();
//            int rating = sc.nextInt();sc.nextLine();
//            int sal = sc.nextInt();sc.nextLine();
//            emp[i]  = new Employee2 (id, name, dept, rating, sal);
//        }
//        int inputSalary = sc.nextInt();sc.nextLine();
//        String inputDept = sc.nextLine();
//
//
//        Employee2[] ansOne = findDept(emp, inputSalary);
//        if(ansOne != null)
//        {
//            for(int i = 0;i<ansOne.length;i++)
//            {
//                System.out.print(ansOne[i].getDept());
//                if(i != ansOne.length - 1) System.out.print(", ");
//            }
//            System.out.println();
//        }
//        else{System.out.println("Meow");}
//
//        int ansTwo = findSecondHighestSalary(emp, inputDept);
//        if(ansTwo != 1)
//        {
//            System.out.println(ansTwo);
//        }
//        else{System.out.println("Meow");}
//
//
//    }
//
//
//    public static int findSecondHighestSalary(Employee2[] emp, String dept)
//    {
//        int count = 0;
//
//        for(int i =0; i<emp.length ; i++)
//        {
//            if(emp[i].getDept().equalsIgnoreCase(dept))
//            {
//                count++;
//            }
//        }
//        if(count<2){return 0;}
//
//
//        int index = 0;
//        Employee2[] sortedEmp = new Employee2 [count];
//        for(int i =0; i<emp.length ; i++)
//        {
//            if(emp[i].getDept().equalsIgnoreCase(dept))
//            {
//                sortedEmp[index] = emp[i];
//                index++;
//            }
//        }
//
//        for(int i = 0; i<sortedEmp.length - 1; i++)
//        {
//            for(int j = 0; j<sortedEmp.length - i - 1; j++)
//            {
//                if(sortedEmp[j].getSalary() < sortedEmp[j+1].getSalary())
//                {
//                    Employee2 temp = sortedEmp[j];
//                    sortedEmp[j] = sortedEmp[j+1];
//                    sortedEmp[j +1] = temp;
//                }
//            }
//        }
//        return sortedEmp[1].getSalary();
//
//
//    }
//
//
//
//
//    public static Employee2[] findDept(Employee2[] emp, int salary)
//
//    {
//        //rating>=3
//        int count = 0;
//        for(int i= 0 ; i<emp.length; i++)
//        {
//            if(emp[i].getSalary() == salary && emp[i].getRating() >= 3)
//            {
//                count++;
//            }
//        }
//
//        if(count<1){return null;}
//
//        int index = 0;
//        Employee2[] empS = new Employee2[count];
//        for(int i= 0 ; i<emp.length; i++)
//        {
//            if(emp[i].getSalary() == salary && emp[i].getRating() >= 3)
//            {
//                empS[index]  = emp[i];
//                index++;
//            }
//        }
//        return empS;
//
//    }
//}
//
//
//class Employee2{
//
//    private int empId, rating, salary;
//    private String empName, dept;
//
//    public int getEmpId(){return empId;}
//    public int getRating(){return rating;}
//    public int getSalary(){return salary;}
//    public String getEmpName(){return empName;}
//    public String getDept(){return dept;}
//
//    public void setEmpId(int empId){this.empId = empId;}
//    public void setRating(int rating){this.rating = rating;}
//    public void setSalary(int salary){this.salary = salary;}
//    public void setEmpName(String empName){this.empName = empName;}
//    public void setDept(String dept){this.dept = dept;}
//
//    Employee2(int empId, String empName, String dept, int rating, int salary)
//    {
//        this.empId=empId;
//        this.empName=empName;
//        this.dept=dept;
//        this.rating=rating;
//        this.salary=salary;
//    }
//
//}
//
///*101
//Arijit
//Computer
//4
//35000
//102
//Rakesh
//Electronics
//2
//18000
//103
//Mahima
//Mechanical
//3
//35000
//104
//Saniya
//Mechanical
//5
//68000
//105
//Rajesh
//Computer
//1
//30000
//35000
//Mechanical*/