package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class countWordsInSentence {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int count = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] != " "){
                count++;
            }
        }
        System.out.println(count);

    }
}
