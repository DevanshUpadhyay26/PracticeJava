package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class printSeriesOfFibonnaci {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<=0){System.out.println("nuh");}
        else
        {
            int a = 0;
            int b= 1;

            System.out.print(a+ " ");
            while(b<=num)
            {
                System.out.print(b +" ");
                int sum = a+b;
                a = b;
                b = sum;
            }
        }
    }
}
