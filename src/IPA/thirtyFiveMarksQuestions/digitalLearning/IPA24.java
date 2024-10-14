package IPA.thirtyFiveMarksQuestions.digitalLearning;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef222
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner (System.in);
        Inventory[] inv = new Inventory[4];

        for(int i = 0; i<inv.length; i++)
        {
            String id = sc.nextLine();
            int maxQ= sc.nextInt();sc.nextLine();
            int currQ=sc.nextInt();sc.nextLine();
            int thres= sc.nextInt();sc.nextLine();
            inv[i]= new Inventory(id, maxQ, currQ, thres);
        }
        int inputLimit = sc.nextInt();
        Inventory[] ansOne = Replenish(inv, inputLimit);
        if(ansOne != null)
        {
            for(int i  = 0 ; i<ansOne.length; i++)
            {
                if(ansOne[i].getThreshold() > 75)
                {System.out.println(ansOne[i].getId() + " Critical Filling");}
                else if (ansOne[i].getThreshold() < 75 && ansOne[i].getThreshold()>50)
                {System.out.println( inv[i].getId() + " Moderate Filling");}
                else
                {System.out.println(ansOne[i].getId() + " Non-Critical Filling");}
            }

        }
        else{
            System.out.println("Meow");
        }
        sc.close();
    }

    public static Inventory[] Replenish(Inventory[] inv, int limit)
    {
        int count=0;
        for(int i = 0; i<inv.length; i++)
        {
            if(inv[i].getThreshold() <= limit)
            {

                count++;
            }
        }

        if(count<1){
            return null;
        }

        Inventory[] sortedInv = new Inventory[count];
        int index = 0;
        for(int i = 0; i<inv.length;i++)
        {

            if(inv[i].getThreshold() <= limit){
                sortedInv[index] = inv[i];
                index++;
            }
        }
        return sortedInv;
    }

}


class Inventory{
    private int maxQ, currQ, threshold;
    private String invId;


    //getters
    public int getMaxQ(){return maxQ;}
    public int getCurrQ(){return currQ;}
    public int getThreshold(){return threshold;}
    public String getId(){return invId;}

    //setters
    public void setMaxQ(int maxQ){this.maxQ=maxQ;}
    public void setCurrQ(int currQ){this.currQ=currQ;}
    public void setThreshold(int threshold){this.threshold = threshold;}

    //consts
    Inventory(String invId, int maxQ, int currQ, int threshold){
        this.invId=invId;
        this.maxQ=maxQ;
        this.currQ=currQ;
        this.threshold=threshold;

    }

}
/*1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45*/