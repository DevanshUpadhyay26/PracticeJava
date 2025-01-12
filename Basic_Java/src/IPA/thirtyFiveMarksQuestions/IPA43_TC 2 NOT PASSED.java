package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;

class Codechef222221
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Scores[] s = new Scores[n];
        for(int i =0; i<s.length;i++)
        {
            int scores= sc.nextInt();
            s[i] = new Scores(scores);
        }

        Scores[] ansOne = findValidScores(s);
        if(ansOne != null)
        {
            System.out.print("Valid Scores = [");
            for(int i = 0;i<ansOne.length;i++)
            {
                System.out.print(ansOne[i].getScores());
                if (i != ansOne.length - 1) System.out.print(", ");

            }
            System.out.print("]");
        }
        else{System.out.println("Meow");}

    }

    public static boolean validateScores(Scores s){
        return s.getScores() > 0 && s.getScores() <= 100;
    }

    public static Scores[] findValidScores(Scores[] s)
    {

        //IF FUNCTION RETURNS TRUE THEN STORE THE SCORES INTO NEW ARRAY AND RETURN IT

        //ELSE RETURN NULL


        int count = 0;
        for(int i = 0;i<s.length;i++)
        {
            if(validateScores(s[i]))
            {
                count++;
            }
        }
        if(count<1){return null;}

        int index = 0;
        Scores[] s2 = new Scores[count];
        for(int i = 0; i<s.length;i++)
        {
            if(validateScores(s[i]))
            {
                s2[index] = s[i];
                index++;
            }
        }
        return s2;


    }
}


class Scores{
    private int scores;

    public int getScores(){return scores;}
    public void setScores(int scores){this.scores=scores;}

    Scores(int scores){this.scores=scores;}
}

/*5
10
20
101
90
0*/