package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef212
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Bill[] bill = new Bill[n];
        for(int i = 0; i<bill.length;i++)
        {
            int no = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String type=sc.nextLine();
            double amt=sc.nextDouble();sc.nextLine();
            boolean sts=sc.nextBoolean();sc.nextLine();
            bill[i] = new Bill(no, name, type, amt, sts);
        }
        boolean inputStatus = sc.nextBoolean();sc.nextLine();
        String inputConnection = sc.nextLine();

        Bill[] ansOne = findBillWithMaxBillAmountBasedOnStatus(bill, inputStatus);
        if(ansOne != null)
        {
            // Filtering the maximum bill and returning no and name
            double max = bill[0].getBillAmount();
            for(int i = 0; i<ansOne.length;i++)
            {
                if(max<bill[i].getBillAmount())
                {
                    System.out.println(ansOne[i].getBillNo() + "#" + ansOne[i].getName());
                }
            }
        }
        else{System.out.println("Meow");}

        int ansTwo = getCountWithTypeOfConnection(bill, inputConnection);
        if(ansTwo != 0)
        {
            System.out.println(ansTwo);
        }
        else{System.out.println("Meow");}
        sc.close();


    }

    public static Bill[] findBillWithMaxBillAmountBasedOnStatus(Bill[] bill, boolean status)
    {
        int count = 0;
        for(int i =0 ;i<bill.length;i++)
        {
            if(bill[i].getStatus() == status)
            {
                count++;
            }
        }

        if(count<1){return null;}
        int index = 0;
        Bill[] sortedBill = new Bill[count];

        for(int i = 0; i<bill.length;i++)
        {
            if(bill[i].getStatus() == status)
            {
                sortedBill[index] = bill[i];
                index++;
            }
        }

        for(int i = 0 ; i<sortedBill.length-1;i++)
        {
            for(int j =0; j<sortedBill.length -i-1;j++)
            {
                if(sortedBill[j].getBillAmount() > sortedBill[j+1].getBillAmount())
                {
                    Bill temp = sortedBill[j];
                    sortedBill[j] = sortedBill[j+1];
                    sortedBill[j+1] = temp;
                }
            }
        }
        return sortedBill;
    }

    public static int getCountWithTypeOfConnection(Bill[] bill, String conn){
        int count = 0;
        for(int i = 0; i<bill.length;i++)
        {
            if(bill[i].getTypeOfConnection().equalsIgnoreCase(conn))
            {
                count++;
            }
        }
        if(count<1){return 0;}
        return count;
    }
}


class Bill{
    private int billNo;
    private String name, typeOfConnection;
    private double billAmount;
    private boolean status;


    public int getBillNo(){return billNo;}
    public String getName(){return name;}
    public String getTypeOfConnection(){return typeOfConnection;}
    public double getBillAmount(){return billAmount;}
    public boolean getStatus(){return status;}


    public void setBillNo(int billNo){this.billNo = billNo;}
    public void setName(String name){this.name = name;}
    public void setTypeOfConnection(String typeOfConnection){this.typeOfConnection = typeOfConnection;}
    public void setBillAmount(double billAmount){this.billAmount = billAmount;}
    public void setStatus(boolean status){this.status = status;}


    Bill(int billNo, String name, String typeOfConnection, double billAmount, boolean status)
    {
        this.billNo = billNo;
        this.name= name;
        this.typeOfConnection=typeOfConnection;
        this.billAmount = billAmount;
        this.status = status;
    }



}

/*4
111
Aman Mittal
Prepaid
914.25
true
222
Rekha Kumar
Prepaid
1425.75
false
333
Samyra Gupta
Prepaid
1305.00
true
444
Mohit Saxena
Postpaid
1300.50
false
false
Prepaid*/