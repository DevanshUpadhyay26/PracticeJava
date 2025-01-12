package IPA.secondPractice;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef12 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        Phone[] p = new Phone[4];
        for(int i =0; i<p.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();sc.nextLine();
            p[i] = new Phone(id, os, brand, price);
        }
        String inputBrand = sc.nextLine();
        String inputOs = sc.nextLine();

        int ansOne = findPriceForGivenBrand(p, inputBrand);
        if(ansOne != 0)
        {
            System.out.println(ansOne);
        }
        else{System.out.println("Meow");}

        Phone[] ansTwo = getPhoneIdBasedOnOs(p, inputOs);
        if(ansTwo != null)
        {
            for(int i=0; i<ansTwo.length;i++)
            {
                System.out.println(ansTwo[i].getId());
            }
        }
        else{System.out.println("Meow");}




        sc.close();
    }

    public static int findPriceForGivenBrand(Phone[] p, String brand)
    {
        int sum = 0;
        for(int i = 0; i<p.length; i++)
        {
            if(p[i].getBrand().equalsIgnoreCase(brand))
            {
                sum+= p[i].getPrice();
            }
        }
        if(sum<1){return 0;}
        return sum;
    }

    public static Phone[] getPhoneIdBasedOnOs(Phone[] p, String os)
    {
        // price >=50000
        int count = 0;
        for(int i = 0; i<p.length;i++)
        {
            if(p[i].getOs().equalsIgnoreCase(os) && p[i].getPrice() >= 50000)
            {
                count++;
            }
        }
        if(count<1){return null;}
        int index = 0;
        Phone[] pp = new Phone[count];

        for(int i =0; i<p.length;i++)
        {
            if(p[i].getOs().equalsIgnoreCase(os) && p[i].getPrice() >= 50000)
            {
                pp[index] = p[i];
                index++;
            }
        }
        return pp;
    }

}


class Phone{
    private int id, price;
    private String os, brand;

    public int getId(){return id;}
    public int getPrice(){return price;}
    public String getOs(){return os;}
    public String getBrand(){return brand;}

    Phone(int id, String os, String brand, int price)
    {
        this.id= id;
        this.os= os;
        this.brand= brand;
        this.price = price;
    }

}
