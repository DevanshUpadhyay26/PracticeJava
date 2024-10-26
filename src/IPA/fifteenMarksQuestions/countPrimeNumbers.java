package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class countPrimeNumbers {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        String num = String.valueOf(number);
        for(int i =0; i<num.length();i++)
        {
            int digit = Character.getNumericValue(num.charAt(i));
            if(isPrime(digit))
            {
                count++;
            }
        }
        System.out.print(count);

    }
    public static boolean isPrime(int num)
    {

        if(num<=1){return false;}
        if(num==2){return true;}
        for(int i = 2; i<=Math.sqrt(num); i++)
        {
            if(num%i==0) {return false;}
        }
        return true;
    }
}
