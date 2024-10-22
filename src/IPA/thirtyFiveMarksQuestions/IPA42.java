package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef221
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Player21[] p = new Player21[4];
        for(int i = 0; i<p.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String country=sc.nextLine();
            String side=sc.nextLine();
            double price=sc.nextDouble();sc.nextLine();

            p[i] = new Player21(id, country, side, price);
        }
        String inputSide = sc.nextLine();

        Player21[] ansOne = searchPlayerForMatch(p, inputSide);
        if(ansOne != null)
        {
            for(int i = 0;i <ansOne.length ;i++){
                System.out.println(ansOne[i].getId());
            }}
        else{System.out.println("Meow");}


    }

    public static Player21[] searchPlayerForMatch(Player21[] p, String side)
    {
        int count = 0;
        for(int i = 0; i<p.length;i++)
        {
            if(p[i].getSide().equalsIgnoreCase(side))
            {
                count++;
            }
        }

        if(count<1){return null;}

        Player21[] pp = new Player21[count];
        int index = 0;
        for(int i =0 ; i<p.length;i++){
            if(p[i].getSide().equalsIgnoreCase(side))
            {
                pp[index] = p[i];
                index++;
            }
        }
        return pp;
    }
}


class Player21{
    private int id;
    private String country, side;
    private double price;



    public int getId(){return id;}
    public String getCountry(){return country;}
    public String getSide(){return side;}
    public double getPrice(){return price;}


    public void setId(int id){this.id= id;}
    public void setCountry(String country){this.country = country;}
    public void setSide(String side){this.side = side;}
    public void setPrice(double price){this.price = price;}

    Player21(int id, String country, String side, double price)
    {
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }
}

/*1
India
Batting
2500000
2
Australia
Batting
1000000
3
Srilanka
Bowling
1700000
4
England
Bowling
2000000
Batting*/