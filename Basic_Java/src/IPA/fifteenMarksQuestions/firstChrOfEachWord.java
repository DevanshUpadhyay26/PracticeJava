package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class firstChrOfEachWord {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s= "";
        s+=str.charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ' ')
            {
                s+=str.charAt(i+1);
            }
        }
        System.out.println(s);

    }
}
