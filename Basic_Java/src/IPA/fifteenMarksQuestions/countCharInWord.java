package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class countCharInWord {
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String chr = sc.nextLine();


        int count = 0;


        for(int i = 0; i<word.length();i++)
        {
            if(word.charAt(i) == chr.charAt(0))
            {
                count++;
            }
        }

        System.out.println(count);

    }
}
/*
* atta
t*/