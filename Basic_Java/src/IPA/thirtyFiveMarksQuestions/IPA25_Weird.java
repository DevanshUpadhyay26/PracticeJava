package IPA.thirtyFiveMarksQuestions;

import java.util.*;
import java.lang.*;

class CodechefPPw1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Player2[] pl = new Player2[4];
        for(int i =0; i<pl.length;i++)
        {
            int id = sc.nextInt(); sc.nextLine();
            String name =  sc.nextLine();
            int rank= sc.nextInt();  sc.nextLine();
            int played = sc.nextInt();  sc.nextLine();
            int runs = sc.nextInt();  sc.nextLine();
            pl[i] = new Player2(id, name, rank, played, runs);
        }
        int inputTarget = sc.nextInt();
        double[] ansOne = findAverageOfRuns(pl, inputTarget);
        if(ansOne != null)
        {
            for(int i =0; i<ansOne.length;i++)
            {
                if(ansOne[i]>=80 && ansOne[i]<=100)
                {
                    System.out.println("Grade A");
                }
                else if(ansOne[i]>=50 && ansOne[i]<=79)
                {
                    System.out.println("Grade B");
                }
                else
                {
                    System.out.println("Grade C");
                }
            }
        }else{System.out.println("Meow");}
        sc.close();

    }
    public static double[] findAverageOfRuns(Player2[] pl, int target)
    {
        int count = 0;
        for(int i =0; i<pl.length;i++)
        {
            if(target<=pl[i].getPlayed())
            {
                count++;
            }
        }
        if(count<1){return null;}
        double[] newD = new double[count];
        int index = 0;
        for(int i =0; i<pl.length;i++)
        {
            if(target<=pl[i].getPlayed())
            {
                double avg = (double) pl[i].getScored() / pl[i].getPlayed();
                newD[index] = avg;
                index++;
            }
        }
        return newD;
    }

}

class Player2{

    private int id, rank, played, scored;
    private String name;

    public int getId(){return id;}
    public int getRank(){return rank;}
    public int getPlayed(){return played;}
    public int getScored(){return scored;}
    public String getName(){return name;}

    Player2(int id, String name, int rank, int played, int scored)
    {
        this.id=id;
        this.name=name;
        this.rank=rank;
        this.played=played;
        this.scored=scored;
    }
}

/*100
Sachin
5
150
13000
101
Sehwag
4
120
10000
103
Dhoni
7
110
7000
104
Kohli
15
57
4400
100*/