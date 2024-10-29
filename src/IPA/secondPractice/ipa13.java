package IPA.secondPractice;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef13
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Flowers[] fl = new Flowers[4];
        for(int i = 0; i<fl.length;i++)
        {
            int id= sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();sc.nextLine();
            int rating= sc.nextInt();sc.nextLine();
            String type = sc.nextLine();
            fl[i] = new Flowers(id, name, price, rating, type);
        }
        String inputType = sc.nextLine();
        Flowers[] ansOne = findMinPriceByType(fl, inputType);
        if(ansOne != null)
        {
            System.out.println(ansOne[0].getId());
        }
        else{System.out.println("Meow");}

    }

    public static Flowers[] findMinPriceByType(Flowers[] fl, String type)
    {
        int count =0;
        for(int i =0 ;i <fl.length;i++)
        {
            if(fl[i].getType().equalsIgnoreCase(type) && fl[i].getRating() > 3)
            {
                count++;
            }
        }
        if(count<1){return null;}
        int index = 0;
        Flowers[] flS = new Flowers[count];
        for(int i =0 ;i <fl.length;i++)
        {
            if(fl[i].getType().equalsIgnoreCase(type) && fl[i].getRating() > 3)
            {
                flS[index] = fl[i];
                index++;
            }
        }
        for(int i=0;i<flS.length - 1; i++)
        {
            for(int j = 0; j<flS.length - i -1; j++)
            {
                if(flS[j].getPrice() > flS[j+1].getPrice())
                {
                    Flowers temp =  flS[j];
                    flS[j] = flS[j+1];
                    flS[j+1] = temp;
                }
            }
        }
        return flS;
    }
}

class Flowers{

    private int id, price, rating;
    private String name, type;

    public int getId(){return id;}
    public int getPrice(){return price;}
    public int getRating(){return rating;}
    public String getName(){return name;}
    public String getType(){return type;}

    Flowers(int id, String name, int price, int rating, String type)
    {
        this.id = id;
        this.name=name;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }
}
