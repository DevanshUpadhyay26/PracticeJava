package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;


class Footwear{
    private int footwearId, price;
    private String footwearName, footwearType;

    //Getters
    public int getFootwearId(){return footwearId;}
    public int getFootwearPrice(){return price;}
    public String getFootwearName(){return footwearName;}
    public String getFootwearType(){return footwearType;}

    //Setter

    public void setFootwearId(int footwearId){this.footwearId= footwearId;}
    public void setFootwearPrice(int price){this.price= price;}
    public void setFootwearName(String footwearName){this.footwearName= footwearName;}
    public void setFootwearType(String footwearType){this.footwearType= footwearType;}
    //Const

    Footwear(int footwearId, String footwearName, String footwearType,int price){
        this.footwearId=footwearId;
        this.footwearName=footwearName;
        this.footwearType=footwearType;
        this.price=price;
    }
}


class Solution20
{


    public static int getCountByType(Footwear[] f, String type){
        int count = 0;
        for(int i = 0; i<f.length;i++){
            if(f[i].getFootwearType().equalsIgnoreCase(type)){
                count++;
            }
        }
        if(count<1){
            return 0;
        }
        return count;
    }

    public static Footwear[] getSecondHighestPriceByBrand(Footwear[] f, String name){
        int count = 0;
        for(int i = 0;i < f.length; i++){
            if(f[i].getFootwearName().equalsIgnoreCase(name)){
                count++;
            }
        }

        if(count<2){
            return null;
        }

        Footwear[] secondHigh= new Footwear[count];
        int index = 0;

        for(int i = 0;i < f.length; i++){
            if(f[i].getFootwearName().equalsIgnoreCase(name)){
                secondHigh[index] = f[i];
                index++;
            }
        }


        //Desec order sort
        for(int i = 0; i<secondHigh.length -1; i++){
            for(int j = 0; j<secondHigh.length - i - 1;j++)
            {
                if(secondHigh[j].getFootwearPrice() < secondHigh[j+1].getFootwearPrice())
                {
                    Footwear temp = secondHigh[j];
                    secondHigh[j] = secondHigh[j+1];
                    secondHigh[j+1] = temp;
                }
            }
        }
        return secondHigh;

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        Footwear[] f = new Footwear[4];
        for(int i = 0; i<f.length; i++){
            int fid=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String type=sc.nextLine();
            int price=sc.nextInt();sc.nextLine();
            f[i] = new Footwear(fid, name,type,price);
        }
        String inputName = sc.nextLine();
        String inputType = sc.nextLine();

        int ansOne = getCountByType(f, inputType);
        if(ansOne != 0){
            System.out.println(ansOne);
        }
        else{
            System.out.println("Meow");
        }

        Footwear[] ansTwo = getSecondHighestPriceByBrand(f, inputName);
        if(ansTwo != null){
            for(int i = 0; i<ansTwo.length-1 ; i++){
                if(ansTwo[i].getFootwearPrice() > ansTwo[i+1].getFootwearPrice())
                {
                    System.out.println(ansTwo[i].getFootwearId());
                    System.out.println(ansTwo[i].getFootwearName());
                    System.out.println(ansTwo[i].getFootwearType());
                }
            }
        }
        else{
            System.out.println("Meow");}
        sc.close();
    }
}
/*101
Nike Air
Sports
3000
102
Nike Air
Sports
2500
103
Nike Air
Sports
3500
104
Adidas Boost
Running
4000
Nike Air
Sports*/