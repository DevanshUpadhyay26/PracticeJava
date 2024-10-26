package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class countVowelConDig {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int cVowel= 0; int cCon = 0; int cDigit =0;
        for(int i =0 ; i<str.length(); i++)
        {


            if(Character.isLetter(str.charAt(i)))
            {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                        str.charAt(i) =='i' || str.charAt(i) == 'o' ||
                        str.charAt(i) == 'u')
                {
                    cVowel++;
                }
                else{cCon++;}
            }
            else{
                cDigit++;
            }
        }
        System.out.print("Vowel " + cVowel + "\n"
                + "Consonent " + cCon + "\n"
                + "Digit " + cDigit);
    }
}
