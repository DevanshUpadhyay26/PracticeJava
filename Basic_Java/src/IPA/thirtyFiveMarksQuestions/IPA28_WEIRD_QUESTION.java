package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;

class CodechefBRUH
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        Account[] acc= new Account[4];
        for(int i = 0; i<acc.length;i++)
        {
            int id =sc.nextInt();sc.nextLine();
            double bal = sc.nextDouble();sc.nextLine();
            double ir = sc.nextDouble();sc.nextLine();
            acc[i] = new Account(id, bal, ir);
        }
        int year = sc.nextInt();

        double ansOne = totalInterestRate(acc, year);
        if(ansOne !=0){
            System.out.println(ansOne);
        }
        else{
            System.out.println("Merow");
        }



    }
    public static double totalInterestRate(Account[] ac, int year)
    {
        double totalInterest = 0;
        for(int i = 0; i<ac.length ; i++)
        {
            double interest = ac[i].getBal() * ac[i].getIR() * year;
            totalInterest += interest;
        }
        return totalInterest;
    }
}


class Account{

    private int id;
    private double bal, interestRate;
    //Getters

    public int getId(){return id;}
    public double getBal(){return bal;}
    public double getIR(){return interestRate;}

    //Setters
    public void setId(int id){this.id = id;}
    public void setBal(double bal){this.bal = bal;}
    public void setIR(double interestRate){this.interestRate = interestRate;}

    //Consts

    Account(int id, double bal, double interestRate)
    {
        this.id=id;
        this.bal=bal;
        this.interestRate=interestRate;
    }

}

/*101
5000.00
0.05
102
10000.00
0.03
103
25000.00
0.07
104
15000.00
0.045
4*/