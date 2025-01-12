package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodechefPPPW
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner (System.in);
        Resort[] re = new Resort[4];
        for(int i =0;i<re.length;i++)
        {
            int id =sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String cate = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            double rating = sc.nextDouble();sc.nextLine();
            re[i]= new Resort(id, name, cate, price ,rating);
        }

        String inputCategory = sc.nextLine();
        int ansOne = findAvgPrice(re, inputCategory);

        if(ansOne != 0)
        {
            System.out.println("The average price of 3 star: "+ansOne);
        }
        else
        {
            System.out.println("Meow");
        }




    }

    public static int findAvgPrice(Resort[] re, String cate)
    {
        //rating >4


        int sum =0;
        int count = 0;
        for(int i =0;i<re.length;i++)
        {
            if(re[i].getCategory().equalsIgnoreCase(cate) && re[i].getRating() >4)
            {
                sum+=re[i].getPrice();
                count++;
            }
        }
        if(count<1){return 0;}
        return sum/count;
    }
}



class Resort{
    private String name, category;
    private int id;
    private double price, rating;

    public int getId(){return id;}
    public String getName(){return name;}
    public String getCategory(){return category;}
    public double getPrice(){return price;}
    public double getRating(){return rating;}

    public void setId(int id){this.id= id;}
    public void setName(String name){this.name=name;}
    public void setCategory(String category){this.category=category;}
    public void setPrice(double price){this.price = price;}
    public void setRating(double rating){this.rating = rating;}

    Resort(int id, String name, String category, double price, double rating)
    {
        this.id=id;
        this.name = name;
        this.category=category;
        this.price = price;
        this.rating = rating;
    }


}


/*1004
ABC
3 star
5400.00
4.5
1001
DEF
5 star
4781.45
4.0
1002
GHI
3 star
6235.72
4.2
1008
JKL
2 star
7454.00
4.2
3 star*/