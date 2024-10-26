package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class firstNonRepeatedChar {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i =0 ;i<str.length();i++)
        {
            int count = 0;
            for(int j=0;j<str.length();j++)
            {
                if(i!=j && str.charAt(i) == str.charAt(j))
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.print(str.charAt(i) + ",");
            }
        }

    }
}
