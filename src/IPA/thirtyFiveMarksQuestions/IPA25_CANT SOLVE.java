package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;

class Codechef2232323
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Player2[] p2 = new Player2[4];
        for(int i = 0; i<p2.length; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int rank=sc.nextInt();sc.nextLine();
            int match = sc.nextInt();sc.nextLine();
            int runs= sc.nextInt();sc.nextLine();
            p2[i] = new Player2(id, name, rank, match , runs);
        }
        int inputTarget =sc.nextInt();
        int ansOne = findAverageOfRuns(p2, inputTarget);
        if(ansOne !=0)
        {
            // for(int i = 0; i<ansOne.length; i++){
            if(ansOne >= 80 && ansOne <= 100)
            {
                System.out.println("Grade A");
            }
            else if (ansOne >=50 && ansOne <= 79)
            {
                System.out.println("Grade B");
            }
            else if (ansOne > 0 && ansOne < 50) {
                System.out.println("Grade C");
            }
        }
        else{
            System.out.println("Meow");
        }
    }

    public static int findAverageOfRuns(Player2[] players, int target)
    {
        int count = 0; int sum = 0;
        for(int i = 0 ; i<players.length;i++)
        {
            if(players[i].getMatch() >= target)
            {
                sum+=players[i].getRuns();
                count++;
            }
        }
        if(count>0)
        {
            return sum/count;
        }
        else{
            return 0;
        }
    }
}

class Player2{

    private int id, rank, match, runs;
    private String name;

    //getters

    public int getId(){return id;}
    public int getRank(){return rank;}
    public int getMatch(){return match;}
    public int getRuns(){return runs;}
    public String getName(){return name;}

    //Setters
    public void setId(int id){this.id=id;}
    public void setName(String name){this.name =name;}
    public void setRank(int rank){this.rank=rank;}
    public void setRuns(int runs){this.runs=runs;}
    public void setMatch(int match){this.match=match;}

    //Const

    Player2(int id, String name, int rank, int match, int runs){
        this.id=id;
        this.name=name;
        this.rank=rank;
        this.match=match;
        this.runs=runs;
    }

}