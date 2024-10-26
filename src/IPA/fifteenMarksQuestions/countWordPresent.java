package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class countWordPresent {

        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            // home sweet home
            // home

            //count = 2



            String sentence = sc.nextLine();
            String[] arrS = sentence.split(" ");
            String word = sc.nextLine();

            int count = 0;
            for(int i = 0; i<arrS.length; i++)
            {
                for(int j = 0; j<arrS[i].length();j++)
                {
                    if(arrS[i].equals(word))
                    {
                        count++;
                    }
                }
            }
            System.out.println(count);


        }
    }

