package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;



class Flower{

    private int flowerId, price,rating;
    private String flowerName, type;

    //Getters
    public int getFlowerId(){return flowerId;}
    public int getRating(){return rating;}
    public int  getPrice(){return price;}
    public String getFlowerName(){return flowerName;}
    public String getType(){return type;}


    //Setters
    public void setFlowerId(int flowerId){this.flowerId = flowerId;}
    public void setRating(int rating){this.rating = rating;}
    public void setPrice(int price){this.price = price;}
    public void setFlowerName(String flowerName){this.flowerName = flowerName;}
    public void setType(String type){this.type  = type;}

    //Consts
    Flower(int flowerId,String flowerName,int  price, int rating, String type){
        this.flowerId=flowerId;
        this.flowerName=flowerName;
        this.price=price;
        this.rating=rating;
        this.type=type;
    }
}

class Solution18
{
    public static Flower[] findMinPriceByType(Flower[] fl, String type){
        int count = 0;
        for(int i = 0; i<fl.length; i++){
            if(fl[i].getType().equalsIgnoreCase(type) && fl[i].getRating() > 3){
                count++;
            }
        }

        if(count<1){
            return null;
        }
        Flower[] sortedF = new Flower[count];
        int index = 0;
        for(int i = 0; i<fl.length; i++){
            if(fl[i].getType().equalsIgnoreCase(type) && fl[i].getRating() > 3){
                sortedF[index] = fl[i];
                index++;
            }
        }


        for(int i = 0; i < sortedF.length - 1;i++){
            for(int j = 0; j< sortedF.length - i - 1;j++)
            {
                if(sortedF[j].getPrice() > sortedF[j+1].getPrice())
                {
                    Flower temp = sortedF[j];
                    sortedF[j]= sortedF[j+1];
                    sortedF[j+1] = temp;
                }
            }
        }
        return sortedF;
    }




    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        Flower[] f = new Flower[4];
        for(int i= 0; i<f.length; i++){
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int price =sc.nextInt();sc.nextLine();
            int rating= sc.nextInt();sc.nextLine();
            String type = sc.nextLine();
            f[i]= new Flower(id,name,price, rating, type);
        }
        String inputType = sc.nextLine();
        Flower[] ansTwo = findMinPriceByType(f, inputType);
        if(ansTwo !=null){
            System.out.println(ansTwo[0].getFlowerId());
        }
        else{
            System.out.println("Meow");

        }



        sc.close();
    }
}

/**
 * 123
 * Yellow trout lilly
 * 3000
 * 5
 * ephemerals
 * 345
 * snowdrop
 * 2500
 * 4
 * ephemerals
 * 321
 * Yarrow
 * 1000
 * 4
 * perennials
 * 213
 * red trillium
 * 2250
 * 4
 * ephemerals
 * ephemerals
 */


