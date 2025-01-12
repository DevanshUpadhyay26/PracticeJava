package IPA.thirtyFiveMarksQuestions;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef11112
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        Beach[] beach = new Beach[4];
        for(int i =0 ;i<beach.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int rate = sc.nextInt();sc.nextLine();
            int cost = sc.nextInt();sc.nextLine();
            beach[i] = new Beach(id, name, rate, cost);
        }
        String inputName = sc.nextLine();
        int inputAmount = sc.nextInt();

        int ansOne =  findLeastRatingWithName(beach, inputName, inputAmount);

        if(ansOne != 0)
        {
            System.out.println(ansOne);
        }
        else{
            System.out.println("Meow");

        }

        sc.close();

    }

    public static int findLeastRatingWithName(Beach[] be, String name, int amount)
    {
        int count = 0;
        for(int i= 0; i<be.length; i++)
        {
            if(be[i].getBeachName().equalsIgnoreCase(name) && be[i].getBeachCost() > amount)
            {
                count++;
            }
        }

        Beach[] leastB = new Beach[count];
        int index = 0;
        for(int i =0;i<be.length;i++)
        {
            if(be[i].getBeachName().equalsIgnoreCase(name) && be[i].getBeachCost() > amount)
            {
                leastB[ index ] = be[i];
                index++;
            }
        }

        if(leastB.length<0){return 0;}

        //If we dont sort it, it will store 1002's rating in index 0
        //1001->1002.............n

        for(int i = 0; i<leastB.length - 1 ;i++)
        {
            for(int j = 0; j<leastB.length - i - 1; j++)
            {
                Beach temp = leastB[j];
                leastB[j] = leastB[j+1];
                leastB[j+1] = temp;
            }
        }

        return leastB[0].getBeachRating();
    }
}

class Beach
{
    private int beachId, beachRating, beachCost;
    private String beachName;


    public int getBeachId(){return beachId;}
    public int getBeachRating(){return beachRating;}
    public int getBeachCost(){return beachCost;}
    public String getBeachName(){return beachName;}


    public void setBeachId(int beachId){this.beachId=beachId;}
    public void setBeachRating(int beachRating){this.beachRating = beachRating;}
    public void setBeachCost(int beachCost){this.beachCost = beachCost;}
    public void setBeachName(String beachName){this.beachName = beachName;}


    Beach(int beachId, String beachName, int beachRating, int beachCost)
    {
        this.beachId = beachId;
        this.beachName = beachName;
        this.beachRating = beachRating;
        this.beachCost = beachCost;
    }
}


/*1001
Puri
3
8600
1002
Digha
5
6200
1003
Digha
3
4000
1004
Digha
4
5500
digha
5000*/