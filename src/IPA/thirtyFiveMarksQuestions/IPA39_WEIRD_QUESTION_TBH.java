package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechefheh
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        BankAccount[] ac = new BankAccount[3];
        for(int i = 0; i<ac.length;i++)
        {
            int accNo = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            double bal = sc.nextDouble();sc.nextLine();
            ac[i] = new BankAccount(accNo, name, bal);
        }

        int withDAccountNo = sc.nextInt();sc.nextLine();
        double withdAmount= sc.nextDouble();sc.nextLine();
        int DepoAccountNo = sc.nextInt();sc.nextLine();
        double DepoAmount= sc.nextDouble();

        double ansOne = withdraw(ac, withDAccountNo, withdAmount);
        if(ansOne != -1)
        {
            System.out.println(ansOne);
        }
        else{System.out.println("Meow");}

        double ansTwo = deposite(ac, DepoAccountNo, DepoAmount);
        if(ansTwo != -1)
        {
            System.out.println(ansTwo);
        }
        else{System.out.println("Meow");}

        sc.close();
    }

    public static double deposite(BankAccount[] ac, int accountNo, double amount)
    {
        int count =0;
        double newBal =0.0;
        for(int i =0; i<ac.length;i++)
        {
            if(ac[i].getAccNo() == accountNo)
            {
                newBal = ac[i].getBal() + amount;
                count++;
            }
        }
        if(count<1){return -1;}
        return newBal;
    }

    public static double withdraw(BankAccount[] ac, int accountNo, double amount)
    {
        int count = 0;
        double newBal =0.0;
        for(int i = 0; i<ac.length;i++)
        {
            if(ac[i].getAccNo() == accountNo)
            {
                newBal = ac[i].getBal() - amount;
                count++;
            }
        }
        if(count<1){return -1;}
        return newBal;
    }
}

class BankAccount{

    private int accNo;
    private String accName;
    private double bal;


    public int getAccNo(){return accNo;}
    public String getAccName(){return accName;}
    public double getBal(){return bal;}

    public void setAccNo(int accNo){this.accNo = accNo;}
    public void setAccName(String accName){this.accName = accName;}
    public void setBal(double bal){this.bal=bal;}


    BankAccount(int accNo, String accName, double bal)
    {
        this.accNo = accNo;
        this.accName =accName;
        this.bal = bal;
    }


}


/*1001
Alice
5000.0
1002
Bob
10000.0
1003
Charlie
15000.0
1002
5000.0
1001
10000.0*/