package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;


class Employee{
    private int employeeId;
    private boolean companyTransport;
    private double rating;
    private String name, branch;

    //Getters

    public int getEmpId(){return employeeId;}
    public String getName(){return name;}
    public String getBranch(){return branch;}
    public double getRating(){return rating;}
    public boolean getCompanyTransport(){return companyTransport;}


    //Setters


    public void setEmpId(int employeeId){this.employeeId = employeeId;}
    public void setName(String name){this.name = name;}
    public void setBranch(String branch){this.branch = branch;}
    public void setRating(double rating){this.rating = rating;}
    public void setCompanyTransport(boolean companyTransport){this.companyTransport = companyTransport;}

    //Constructors


    Employee(int employeeId, String name, String branch, double rating, boolean companyTransport)
    {
        this.employeeId= employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;
    }
}

class Solution6{

    public static int findCountOfEmployeesUsingCompTransport(Employee[] emp, String branch){

        int count = 0;

        for(int i = 0; i<emp.length;i++){
            if(emp[i].getBranch().equalsIgnoreCase(branch) && emp[i].getCompanyTransport() == true){
                count++;
            }
        }


        if(count>0){
            return count;
        }else {return 0;}


    }
    public static Employee[] findEmployeeWithSecondHighestRating(Employee[] emp)
    {

        int count = 0;

        //companyTransport == false
        for(int i = 0; i<emp.length; i++){
            if(emp[i].getCompanyTransport() == false)
            {
                count++;
            }
        }

        // If fewer than two employees are found, return null
        if (count < 2) {
            return null;
        }

        Employee[] nonTransportEmp = new Employee[count];

        int index = 0;
        for(int i = 0; i <emp.length; i++){
            if(emp[i].getCompanyTransport() == false){
                nonTransportEmp[index] = emp[i];
                index++;
            }
        }


        //Bubble Sort in descending order smaller < bigger
        Employee temp;
        for(int i = 0;i<nonTransportEmp.length -1; i++){
            for(int j = 0; j <nonTransportEmp.length - i - 1; j++){
                if(nonTransportEmp[j].getRating() < nonTransportEmp[j+1].getRating())
                {
                    temp = nonTransportEmp[j];
                    nonTransportEmp[j] = nonTransportEmp[j+1];
                    nonTransportEmp[j+1] = temp;
                }
            }
        }
        return new Employee[]{nonTransportEmp[0],nonTransportEmp[1]};
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[4];
        for(int i = 0; i <emp.length ; i++){
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = sc.nextDouble();sc.nextLine();
            boolean cT = sc.nextBoolean();sc.nextLine();
            emp[i] = new Employee(id,name,branch, rating, cT);
        }
        String inputBranch = sc.nextLine();

        int ansOne = findCountOfEmployeesUsingCompTransport(emp,inputBranch);
        if(ansOne != 0){
            System.out.println(ansOne);
        }
        else{
            System.out.println("No such Employees");
        }

        Employee[] ansTwo = findEmployeeWithSecondHighestRating(emp);
        if(ansTwo != null){
            System.out.println(ansTwo[1].getEmpId()+ "\n" + ansTwo[1].getName());
        }
        else{
            System.out.println("All Employees using company transport");
        }

        sc.close();

    }
}