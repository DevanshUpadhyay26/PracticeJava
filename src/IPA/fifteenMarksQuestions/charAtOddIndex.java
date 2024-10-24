package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class charAtOddIndex {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i= 0; i<str.length();i++)
        {
            if(i%2!=0)
            {
                System.out.print(str.charAt(i));
            }
        }

    }
}

