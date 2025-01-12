package IPA.secondPractice;
import java.util.*;
import java.lang.*;

class Codechef2
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);

        Footwear[] fo = new Footwear[4];
        for(int i=0; i<fo.length ; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name =sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();sc.nextLine();
            fo[i] = new Footwear(id, name, type, price);
        }
        String inputType =  sc.nextLine();
        String inputName = sc.nextLine();

        int ansOne = getCountByType(fo, inputType);

        if(ansOne != 0)
        {
            System.out.println(ansOne);
        }
        else{System.out.println("Meow");}

        Footwear[] ansTwo = getSecondHighestPriceByBrand(fo, inputName);
        if(ansTwo != null)
        {

            System.out.println(ansTwo[1].getId() + "\n" + ansTwo[1].getName() + "\n" + ansTwo[1].getPrice());
        }
        else{System.out.println("Meow");}



        sc.close();

    }

    public static int getCountByType(Footwear[] fo, String type)
    {
        int count = 0;
        for(int i = 0;i<fo.length;i++)
        {
            if(fo[i].getType().equalsIgnoreCase(type))
            {
                count++;
            }
        }
        if(count<1){return 0;}
        return count;


    }
    public static Footwear[] getSecondHighestPriceByBrand(Footwear[] fo, String name)
    {
        //Desc price

        int count = 0;
        for(int i =0 ; i<fo.length;i++)
        {
            if(fo[i].getName().equalsIgnoreCase(name))
            {
                count++;
            }
        }
        if(count<1){return null;}

        int index = 0;
        Footwear[] fooS = new Footwear[count];
        for(int i=0;i<fo.length;i++)
        {
            if(fo[i].getName().equalsIgnoreCase(name))
            {
                fooS[index] = fo[i];
                index++;
            }
        }

        for(int i =0;i<fooS.length-1;i++)
        {
            for(int j = 0; j<fooS.length - i- 1; j++)
            {
                if(fooS[j].getPrice() < fooS[j+1].getPrice())
                {
                    Footwear temp = fooS[j];
                    fooS[j] = fooS[j+1];
                    fooS[j+1] = temp;
                }
            }
        }
        return fooS;
    }

}

class Footwear{

    private int id, price;
    private String name, type;


    public int getId(){return id;}
    public int getPrice(){return price;}
    public String getName(){return name;}
    public String getType(){return type;}

    public void setId(int id){this.id=id;}
    public void setPrice(int price){this.price = price;}
    public void setName(String name){this.name = name;}
    public void setType(String type){this.type = type;}

    Footwear(int id, String name, String type, int price)
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }


}