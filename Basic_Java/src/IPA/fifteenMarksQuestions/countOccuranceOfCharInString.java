package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class countOccuranceOfCharInString {
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 1;
        String res = "";

        for(int i = 1; i<= word.length();i++)
        {
            if(i<word.length() &&  word.charAt(i) == word.charAt(i-1))
            {
                count++;
            }
            else{
                res +=word.charAt(i-1) + String.valueOf(count);
                count = 1;
            }
        }
        System.out.println(res);

    }
}

//aabbc
