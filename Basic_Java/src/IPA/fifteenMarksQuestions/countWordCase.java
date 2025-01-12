package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class countWordCase {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        //The Home siii suiii
        // 2

        String str = sc.nextLine();
        int count = 0;
        String[] arrS = str.split(" ");
        for(int i = 0;i<arrS.length;i++)
        {
            if(Character.isUpperCase(arrS[i].charAt(0))) {count++;}
        }

        System.out.println(count);
    }
}
