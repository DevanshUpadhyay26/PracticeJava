package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechefasdasd
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        MobileDetails[] md = new MobileDetails[5];
        for(int i = 0; i<md.length;i++)
        {

            int id = sc.nextInt();sc.nextLine();
            int price = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            boolean fs = sc.nextBoolean(); sc.nextLine();
            md[i] = new MobileDetails(id, price, brand, fs);
        }
        String inputBrand = sc.nextLine();


        int ansOne = getTotalPrice(md, inputBrand);

        if(ansOne != 0)
        {
            System.out.println(ansOne);
        }else{System.out.println("Meow");}


        MobileDetails[] ansTwo = getSecondMin(md);
        if(ansTwo != null)
        {
            for(int i = 1 ; i< ansTwo.length-2; i++) //SINCE THERE ARE TWO BRANDS WITH A SAME PRICE, SO TO ITERATE ONLY WITH SAME PRICE, WE SHALL USE -2 LENGTH. IK VERY INEFFICENT BUT IT WORKS HEHEHEHEH
            {
                System.out.println(ansTwo[i].getBrand() + " : " + ansTwo[i].getPrice());
            }
        }
        else{System.out.println("Meow");}
        sc.close();
    }
    public static int getTotalPrice(MobileDetails[] md, String brand)
    {
        int sum = 0;
        for(int i = 0; i< md.length;i++)
        {
            if(md[i].getBrand().equalsIgnoreCase(brand))
            {
                sum+=md[i].getPrice();
            }
        }
        if(sum<0)
        {
            return 0;
        }
        return sum;
    }
    public static MobileDetails[] getSecondMin(MobileDetails[] md)
    {
        for(int i = 0; i<md.length -1 ; i++)
        {

            for(int j = 0; j < md.length - i -1;j++)
            {

                if(md[j].getPrice() > md[j+1].getPrice())
                {
                    MobileDetails temp = md[j];
                    md[j]= md[j+1];
                    md[j+1] = temp;
                }
            }
        }
        if(md.length<0)
        {
            return null;
        }
        return md;
    }
}


class MobileDetails {

    private int mobileId, price;
    private String brand;
    private boolean isFlagShip;

    public int getId(){return mobileId;}
    public int getPrice(){return price;}
    public String getBrand(){return brand;}
    public boolean getFlagShip(){return isFlagShip;}

    public void setId(int mobileId){this.mobileId = mobileId;}
    public void setPrice(int price){this.price=price;}
    public void setBrand(String brand){this.brand=brand;}
    public void setFlagShip(boolean isFlagShip){this.isFlagShip=isFlagShip;}

    MobileDetails(int mobileId, int price, String brand, boolean isFlagShip)
    {
        this.mobileId=mobileId;
        this.price = price;
        this.brand = brand;
        this.isFlagShip = isFlagShip;
    }
}

/*101
25000
Samsung
True
102
19000
Redmi
False
103
28000
Nokia
True
104
25000
Realme
False
105
40000
Samsung
True
Samsung*/