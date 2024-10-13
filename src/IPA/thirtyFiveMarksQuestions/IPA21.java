package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Fruits[] f = new Fruits[4];
        for(int i = 0; i<f.length;i++)
        {
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int price=sc.nextInt();sc.nextLine();
            int rating=sc.nextInt();sc.nextLine();
            f[i]= new Fruits(id, name,price,rating);
        }

        int inputRating = sc.nextInt();


        Fruits[] ansOne = findMaximumPriceByRating(f, inputRating);
        if(ansOne !=null){
            System.out.println(ansOne[0].getFruitId());
        }
        else{System.out.println("Meow");}


        sc.close();

    }
    public static Fruits[] findMaximumPriceByRating(Fruits[] f,int rating)
    {
        int count = 0;
        for(int i = 0; i<f.length;i++)
        {
            if(f[i].getRating() > rating){
                count++;
            }
        }
        if(count < 1){
            return null;

        }
        int index = 0;
        Fruits[] sortedF = new Fruits[count];
        for(int i = 0;i < f.length;i++)
        {
            if(f[i].getRating() > rating)
            {
                sortedF[index] = f[i];
                index++;
            }
        }
        for(int i = 0; i<sortedF.length - 1; i++)
        {
            for(int j = 0; j<sortedF.length - i - 1; j++)
            {
                if(sortedF[j].getPrice() < sortedF[j+1].getPrice())
                {
                    Fruits temp = sortedF[j];
                    sortedF[j] = sortedF[j+1];
                    sortedF[j+1] = temp;
                }

            }
        }
        return sortedF;

    }
}


class Fruits{
    private int fruitId, price, rating;
    private String fruitName;


    // Getters
    public int getFruitId(){return fruitId;}
    public String getFruitName(){return fruitName;}
    public int getPrice(){return price;}
    public int getRating(){return rating;}
    //Setters
    public void setFruitId(int fruitId){this.fruitId = fruitId;}
    public void setFruitName(String fruitName){this.fruitName = fruitName;}
    public void setPrice(int price){this.price = price;}
    public void setRating(int rating){this.rating = rating;}


    // Const

    Fruits(int fruitId, String fruitName, int price, int rating){
        this.fruitId=fruitId;
        this.fruitName=fruitName;
        this.price=price;
        this.rating=rating;
    }
}

/*555
Apple
200
5
777
Orange
150
4
333
Banana
100
4
888
Avocado
250
4
3*/