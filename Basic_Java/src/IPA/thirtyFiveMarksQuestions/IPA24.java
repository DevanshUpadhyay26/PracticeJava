package IPA.thirtyFiveMarksQuestions;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef34242
{

    public static int findAvgBudgetByDirector(Cinema[] cn, String dir){
        int count =0;
        int sum = 0;
        for(int i=0; i <cn.length; i++)
        {
            if(cn[i].getDir().equalsIgnoreCase(dir))
            {
                sum+=cn[i].getBudget();
                count++;
            }
        }
        if(count>1)
        {
            return sum/count;
        }
        else{
            return 0;
        }
    }


    public static Cinema[] getMovieByRatingBudget(Cinema[] cn, int rating, int budget)
    {
        int count = 0;
        for(int i = 0; i<cn.length;i++)
        {
            if(cn[i].getRating() == rating && cn[i].getBudget()==budget){
                count++;
            }
        }
        if(count<1){return null;}
        int index =0;
        Cinema[] sortedCn = new Cinema[count];
        for(int i = 0; i<cn.length; i++)
        {
            if(cn[i].getRating() == rating && cn[i].getBudget() == budget)
            {
                sortedCn[index] = cn[i];
                index++;
            }
        }
        return sortedCn;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Cinema[] cn = new Cinema[4];
        for(int i = 0; i<cn.length; i++)
        {
            int id=sc.nextInt();sc.nextLine();
            String dir=sc.nextLine();
            int rating=sc.nextInt();sc.nextLine();
            int budget=sc.nextInt();sc.nextLine();
            cn[i] = new Cinema(id, dir, rating, budget);
        }
        String inputDir = sc.nextLine();
        int inputRating= sc.nextInt(); sc.nextLine();
        int inputBudget= sc.nextInt();
        int ansOne = findAvgBudgetByDirector(cn, inputDir);
        if(ansOne != 0)
        {
            System.out.println(ansOne);
        }
        else{
            System.out.println("Meow");
        }
        Cinema[] ansTwo = getMovieByRatingBudget(cn, inputRating, inputBudget);
        if(ansTwo != null)
        {
            for(int i = 0; i<ansTwo.length;i++)
            {
                if(inputBudget % inputRating == 0)
                {
                    System.out.println(ansTwo[i].getId());
                }
            }
        }
        else{
            System.out.println("Meow");
        }
    }
}

class Cinema{
    private int id, rating, budget;
    private String dir;

    //Getters
    public int getId(){return id;}
    public int getRating(){return rating;}
    public int getBudget(){return budget;}
    public String getDir(){return dir;}

    //Setters
    public void setId(int id){this.id=id;}
    public void setRating(int rating){this.rating=rating;}
    public void setBudget(int budget){this.budget=budget;}
    public void setDir(String dir){this.dir= dir;}

    //Consts
    Cinema(int id, String dir, int rating, int budget){
        this.id=id;
        this.dir=dir;
        this.rating=rating;
        this.budget=budget;
    }

}

/*1101
GVM
4
100
1201
Shankar
5
500
1301
Shankar
3
50
1401
GVM
5
300
GVM
5
300*/