package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodechefMeowE
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        HeadSets[] hs = new HeadSets[4];
        for(int i = 0; i<hs.length;i++)
        {
            String hsName = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();sc.nextLine();
            boolean av = sc.nextBoolean();sc.nextLine();
            hs[i] = new HeadSets(hsName, brand, price, av);
        }
        String inputBrand=sc.nextLine();
        int ansOne = findTotalPriceForGivenBrand(hs, inputBrand);
        if(ansOne !=0)
        {
            System.out.println(ansOne);
        }
        else{System.out.println("Meow");}


        HeadSets[] ansTwo = findAvailableHeadsetWithSecondMinPrice(hs);
        if(ansTwo != null)
        {
            System.out.println(ansTwo[1].getHeadSetName() + "\n" + ansTwo[1].getPrice());
        }
        else{System.out.println("Meow");}

        sc.close();

    }

    public static int findTotalPriceForGivenBrand(HeadSets[] hs, String brand)
    {
        int total = 0;
        for(int i = 0 ; i<hs.length;i++)
        {
            if(hs[i].getBrand().equalsIgnoreCase(brand))
            {
                total+=hs[i].getPrice();
            }
        }
        if(total<1)
        {
            return 0;
        }
        return total;
    }

    public static HeadSets[] findAvailableHeadsetWithSecondMinPrice(HeadSets[] hs)
    {
        int count = 0;
        for(int i = 0; i<hs.length;i++){
            count++;
        }

        if(count <1)
        {
            return null;
        }

        int index = 0;
        HeadSets[] sortedH = new HeadSets[count];

        for(int i =0; i<hs.length;i++)
        {
            sortedH[index] = hs[i];
            index++;
        }

        for(int i = 0; i<sortedH.length - 1;i++)
        {
            for(int j = 0; j<sortedH.length - i - 1 ;j++)
            {
                if(sortedH[j].getPrice() > sortedH[j+1].getPrice())
                {
                    HeadSets temp = sortedH[j];
                    sortedH[j] = sortedH[j+1];
                    sortedH[j+1] = temp;
                }
            }
        }
        return sortedH;
    }
}


class HeadSets{
    private String hsName, brand;
    private int price;
    private boolean av;

    public String getHeadSetName(){return hsName;}
    public String getBrand(){return brand;}
    public int getPrice(){return price;}
    public boolean getAvailable(){return av;}

    public void setHeadSetName(String hsName){this.hsName=hsName;}
    public void setBrand(String brand){this.brand=brand;}
    public void setPrice(int price){this.price=price;}
    public void setAvailable(boolean av){this.av=av;}


    HeadSets(String hsName, String brand, int price, boolean av){
        this.hsName = hsName;
        this.brand=brand;
        this.price=price;
        this.av=av;
    }

}

/*boAt BassHeads
boAt
1220
true
Over Ear Wired
boAt
549
true
In Ear with Mic
JBL
450
true
Buds 2 Neo
RealMe
500
true
boAt*/