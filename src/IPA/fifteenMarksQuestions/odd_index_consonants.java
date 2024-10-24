package IPA.fifteenMarksQuestions;


import java.util.Scanner;

public class odd_index_consonants {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();
        char[] ch = {'a','e','i','o','u'};
        for(int i = 0; i<str.length();i++)
        {
            boolean test = true;
            for(int j=0; j<ch.length;j++)
            {
                if( (i+1)%2==0 || str.charAt(i)==ch[j] || str.charAt(i)==' ')
                {test = false;}
            }
            if(test == true){System.out.print(str.charAt(i));}
        }
    }
}

