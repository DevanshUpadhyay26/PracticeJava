package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodechefE
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Vegatable[] veg = new Vegatable[4];
        for(int i = 0; i<veg.length;i++){
            int id= sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int price=sc.nextInt();sc.nextLine();
            int rating=sc.nextInt();sc.nextLine();
            veg[i] = new Vegatable(id, name, price, rating);
        }
        int inputRating = sc.nextInt();

        Vegatable[] ansOne = findMinimumPriceByRating(veg, inputRating);
        if(ansOne != null)
        {
            System.out.println(ansOne[0].getId());
        }
        else{System.out.println("Meow");}
        sc.close();
    }

    public static Vegatable[] findMinimumPriceByRating(Vegatable[] veg, int rating)
    {
        int count = 0;

        for(int i = 0; i<veg.length; i++)
        {
            if(veg[i].getRating() > rating)
            {
                count++;
            }
        }
        if(count<1){return null;}

        int index = 0;
        Vegatable[] sortedVeg = new Vegatable[count];

        for(int i = 0; i<veg.length;i++)
        {
            if(veg[i].getRating() > rating)
            {
                sortedVeg[index] = veg[i];
                index++;
            }
        }

        for(int i = 0; i < sortedVeg.length - 1 ; i++)
        {
            for(int j = 0; j<sortedVeg.length - i - 1;j++)
            {
                if(sortedVeg[j].getPrice() > sortedVeg[j+1].getPrice())
                {
                    Vegatable temp =sortedVeg[j];
                    sortedVeg[j] = sortedVeg[j+1];
                    sortedVeg[j+1] = temp;
                }
            }
        }
        return sortedVeg;
    }
}


class Vegatable{

    private int id, price, rating;
    private String name;


    public int getId(){return id;}
    public int getPrice(){return price;}
    public int getRating(){return rating;}
    public String getName(){return name;}

    public void setId(int id){this.id=id;}
    public void setPrice(int price){this.price=price;}
    public void setRating(int rating){this.rating = rating;}
    public void setName(String name ){this.name = name;}

    Vegatable(int id, String name, int price, int rating)
    {
        this.id= id;
        this.price=price;
        this.rating=rating;
        this.name=name;
    }

}

/*1001
Carrot
90
5
1002
Tomato
40
4
1003
Bectroot
80
4
1004
Onion
78
3
2*/