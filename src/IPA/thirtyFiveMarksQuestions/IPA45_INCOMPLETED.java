package IPA.thirtyFiveMarksQuestions;

import java.util.*;
import java.lang.*;

class Codechefsdsd21qws
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        BankAccount[] ba = new BankAccount[2];
        for(int i = 0; i<ba.length;i++)
        {
            System.out.println("Account " + i+1 + ":");
            System.out.print("Account Number: ");
            String accountNumber = sc.nextLine();
            System.out.print("Account Holder Name: ");
            String accountHolderName = sc.nextLine();
            System.out.print("Balance: ");
            double bal = sc.nextDouble();
            ba[i] = new BankAccount(accountNumber, accountHolderName, bal);
            System.out.println();
        }
        System.out.println("Transfer Details: ");
        System.out.print("Amount: ");
        double inputAmount = sc.nextDouble();sc.nextLine();
        System.out.print("Transaction Code: ");
        String inputTC = sc.nextLine();


//        BankUtils[] bu = new BankUtils()

    }




// 	public static BankUtils[] transferFunds(BankUtils[] bu)
//     {
//         int count =0;
//         if(bu.getBalance() > bu.getAmount())
//         {
//             count++;
//         }
//         if(count<1){return null;}

//         BankUtils[] sortedBu = new BankUtils[count];
//         int index = 0;

//         if(bu.getBalance() > bu.getAmount())
//         {
//             double amountOne = bu.getBalance() - bu.getAmount();
//             double amountTwo = bu.getBalance - bu.getAmount();
//             sortedBu[index] = new BankUtils(amountOne, amountTwo);
//             index++;
//         }

//     }
}


class BankAccount
{
    private String accountNumber, accountHolderName;
    private double balance;

    public String getAccountNumber(){return accountNumber;}
    public String getAccountHolderName(){return accountHolderName;}
    public double getBalance(){return balance;}

    public void setAccountNumber(String accountNumber){this.accountNumber = accountNumber;}
    public void setAccountHolderName(String accountHolderName){this.accountHolderName = accountHolderName;}
    public void setBalance(double balance){this.balance = balance;}

    BankAccount(String accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


}

class BankUtils
{
    BankAccount fromAccount;
    BankAccount toAccount;
    double amount;
    String transactionCode;
    BankUtils(BankAccount fromAccount, BankAccount toAccount, double amount, String transactionCode)
    {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.transactionCode = transactionCode;
    }
}

class Transaction
{
    String transactionCode;
    double amount;
    String timestamp;

    public String getTransactionCode(){return transactionCode;}
    public double getAmount(){return amount;}
    public String getTimestamp(){return timestamp;}

    Transaction(String transactionCode, double amount, String timestamp)
    {
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.timestamp = timestamp;
    }
}