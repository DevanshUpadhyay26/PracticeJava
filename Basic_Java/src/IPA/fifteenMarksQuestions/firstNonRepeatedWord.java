package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class firstNonRepeatedWord {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        int count = 0;
        for(int i =0 ; i<str.length();i++)
        {
            for(int j=0; j<=i;j++)
            {
                if(i==j)
                {
                    s+=str.charAt(i);
                }
                else if(str.charAt(i) == str.charAt(j) ){
                    count++;
                    break;
                }
            }
            if(count>0){
                break;
            }
        }
        System.out.print(s);

    }
}
