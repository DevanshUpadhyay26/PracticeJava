package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class lastCharOfEachWord {
    public static void main(String[] args) {
        {
            // your code goes here


            //BHARATI VIDYAPEETH COLLEGE OF ENGG
            //RES = IHEOG

            Scanner sc = new Scanner(System.in);

            String sentence = sc.nextLine();
            String ans="";
            sentence = sentence.trim();

            for(int i = 0;i<sentence.length();i++)
            {
                if(sentence.charAt(i)==' ' && sentence.charAt(i-1)!= ' ')
                {
                    ans +=sentence.charAt(i-1);
                }
            }
            ans+=sentence.charAt(sentence.length() - 1);
            System.out.println(ans);
        }

    }
}
