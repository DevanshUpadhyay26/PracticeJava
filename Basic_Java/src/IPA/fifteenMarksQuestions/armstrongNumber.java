package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class armstrongNumber {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        String str = String.valueOf(n);
        double sum = 0;

        for(int i = 0; i<str.length();i++)
        {
            int digit= Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += Math.pow(digit, 3);
        }
        if(sum == n){System.out.println("It is");}
        else{System.out.println("It is not");}


    }


}
