package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class findIndexNumberOfChar {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        for(int i =0; i<str.length(); i++)
        {
            if(str.charAt(i) == ch)
            {
                System.out.println(i);
            }
        }

    }
}
