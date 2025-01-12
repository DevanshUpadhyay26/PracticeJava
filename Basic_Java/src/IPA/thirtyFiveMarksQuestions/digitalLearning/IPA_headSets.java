package IPA.thirtyFiveMarksQuestions.digitalLearning;
import java.util.*;
import java.lang.*;
import java.io.*;




class HeadSets {
    private String headsetName, brand;
    private int price;
    private boolean available;

    //Getters
    public int getPrice(){return price;}
    public String getBrand(){return brand;}
    public String getHeadsetName(){return headsetName;}
    public boolean getAvailable(){return available;}

    //Setters
    public void setPrice(int price){this.price = price;}
    public void setBrand(String brand){this.brand = brand;}
    public void setHeadsetName(String headsetName){this.headsetName = headsetName;}
    public void setAvailable(boolean available){this.available = available;}
    //Const

    HeadSets(String headsetName, String brand, int price, boolean available){
        this.headsetName=headsetName;
        this.brand=brand;
        this.price=price;
        this.available=available;
    }
}
class Codechef
{
    public static int findTotalPriceForGivenBrand(HeadSets[] hed, String brand)
    {
        int total = 0;
        for(int i = 0; i<hed.length; i++)
        {
            if(hed[i].getBrand().equalsIgnoreCase(brand))
            {
                total +=hed[i].getPrice();
            }
        }

        if(total<1){return 0;}
        return total;
    }


    public static HeadSets[] findAvailableHeadsetWithSecondMinPrice(HeadSets[] head)
    {

        int count = 0;
        for(int i = 0; i<head.length;i++)
        {
            if(head[i].getAvailable() == true)
            {
                count++;
            }
        }
        if(count<1){
            return null;
        }
        HeadSets[] sortedHead= new HeadSets[count];
        int index = 0;

        for(int i = 0;i<head.length;i++)
        {
            if(head[i].getAvailable() == true){
                sortedHead[index] = head[i];
                index++;
            }
        }

        for(int i = 0; i<sortedHead.length - 1; i++)
        {
            for(int j = 0; j<sortedHead.length-i-1;j++)
            {
                if(sortedHead[j].getPrice() > sortedHead[j+1].getPrice())
                {
                    HeadSets Temp = sortedHead[j];
                    sortedHead[j] = sortedHead[j+1];
                    sortedHead[j+1] = Temp;
                }
            }
        }
        return sortedHead;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        HeadSets[] head = new HeadSets[4];
        for(int i =0;i<head.length;i++)
        {
            String name=sc.nextLine();
            String bran=sc.nextLine();
            int price=sc.nextInt();sc.nextLine();
            boolean ava=sc.nextBoolean();sc.nextLine();
            head[i] = new HeadSets(name, bran, price, ava);
        }
        String inputBrand = sc.nextLine();

        int ansOne = findTotalPriceForGivenBrand(head, inputBrand);
        if(ansOne != 0){
            System.out.println(ansOne);
        }
        else{
            System.out.println("Meow");
        }

        HeadSets[] ansTwo = findAvailableHeadsetWithSecondMinPrice(head);
        if(ansTwo !=null)
        {
            for(int i=0; i<ansTwo.length;i++)
            {
                System.out.println(ansTwo[1].getHeadsetName() + "\n" + ansTwo[1].getPrice());break;
            }
        }
        else{
            System.out.println("Meow");
        }
    }
}
