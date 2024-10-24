package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class countCharacterCase {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(countLower(str)+ " are in lower case");
        System.out.println(countUpper(str)+ " are in upper case");
    }
    public static int countLower(String str)
    {
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                count++;
            }

        }
        return count;
    }
    public static int countUpper(String str)
    {
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                count++;
            }

        }

        return count;
    }
}
