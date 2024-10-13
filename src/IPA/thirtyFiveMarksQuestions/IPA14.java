
package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;





class Phone
{

    private String brand, os;
    private int phoneId, price;

    //Getters


    public int getPhoneId(){return phoneId;}
    public int getPrice(){return price;}
    public String getOs(){return os;}
    public String getBrand(){return brand;}


    //Setters
    public void setPhoneId(int phoneId){this.phoneId = phoneId;}
    public void setPrice(int price){this.price = price;}
    public void setOs(String os){this.os = os;}
    public void setBrand(String brand){this.brand = brand;}

    //Const

    Phone(int phoneId, String os, String brand, int price){
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }
}



class Solution14
{


    public static int  findPriceForGivenBrand(Phone[] ph, String brand){
        int sum = 0;

        for(int i = 0; i<ph.length; i++){
            if(ph[i].getBrand().equalsIgnoreCase(brand)){
                sum += ph[i].getPrice();
            }
        }

        if (sum>0){
            return sum;
        }
        else{
            return 0;
        }
    }


    //os = inputOs
    //price >=50000; then return phone id

    public static Phone[] getPhoneIdBasedOnOs(Phone[] ph, String os){
        int count = 0;
        for(int i = 0; i < ph.length; i++)
        {
            if(ph[i].getOs().equalsIgnoreCase(os)){
                count++;
            }
        }


        if(count<1){
            return null;
        }

        Phone[] temp = new Phone[count];
        int index = 0;

        for(int i =0; i < ph.length; i++)
        {
            if(ph[i].getOs().equalsIgnoreCase(os))
            {
                temp[index] = ph[i];
                index++;
            }
        }

        return temp;



    }


    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Phone[] ph = new Phone[4];
        for(int i = 0;i <ph.length;i++){
            int pid= sc.nextInt();sc.nextLine();
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int p = sc.nextInt();sc.nextLine();
            ph[i] = new Phone(pid, os, brand, p);
        }
        String inputBrand = sc.nextLine();
        String inputOs = sc.nextLine();
        int ansOne = findPriceForGivenBrand(ph, inputBrand);
        if(ansOne != 0){
            System.out.println(ansOne);
        }
        else{
            System.out.println("The given Brand is not available.");
        }


        Phone[] ansTwo = getPhoneIdBasedOnOs(ph, inputOs);
        if(ansTwo != null){
            for(int i = 0;i < ansTwo.length ; i++)
            {
                if(ansTwo[i].getPrice() >=50000){
                    System.out.println(ansTwo[i].getPhoneId());
                }
            }
        }
        else{
            System.out.println("No phones are available with specified os and price range");
        }
    }
}


/*
*
* 111
iOS
Apple
30000
222
android
Samsung
50000
333
Symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
aNdRoid
* */