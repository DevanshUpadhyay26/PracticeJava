package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;


class Medicine{
    private int price;
    private String medicineName, batch, disease;

    //Getters

    public String getMedicineName (){return medicineName;}
    public String getBatch (){return batch;}
    public String getDisease (){return disease;}
    public int getPrice (){return price;}

    //Setters

    public void setMedicineName(String medicineName) {this.medicineName = medicineName;}
    public void setBatch(String batch) {this.batch = batch;}
    public void setDisease(String disease) {this.disease = disease;}
    public void setPrice(int price) {this.price = price;}


    //Consts

    Medicine(String medicineName, String batch, String disease, int price)
    {
        this.medicineName =medicineName;
        this.batch=batch;
        this.disease=disease;
        this.price=price;
    }


}

class Solution11
{

    public static Medicine[] getPriceByDisease(Medicine[] meds, String die)

    {

        //index for temp array
        int count = 0;
        for(int i = 0; i<meds.length;i++)
        {
            if(meds[i].getDisease().equalsIgnoreCase(die)){
                count++;
            }
        }

        if(count < 1){
            return null;
        }

        //Storing Array objects where if(meds[i].getDisease().equalsIgnoreCase(die))

        int index = 0;
        Medicine[] sortedMeds = new Medicine[count];

        for(int i = 0; i<meds.length;i++)
        {
            if(meds[i].getDisease().equalsIgnoreCase(die))
            {
                sortedMeds[index] = meds[i];
                index++;
            }
        }

        //bubble sort
        for(int i = 0; i< sortedMeds.length - 1;i++)
        {
            for(int j = 0; j< sortedMeds.length - i - 1; j++)
            {
                if(sortedMeds[j].getPrice() > sortedMeds[j+1].getPrice()){
                    Medicine temp = sortedMeds[j];
                    sortedMeds[j] = sortedMeds[j+1];
                    sortedMeds[j+1] = temp;
                }
            }
        }

        return sortedMeds;


    }


    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Medicine[] meds = new Medicine[4];
        for(int i = 0; i < meds.length ;i++)
        {
            String medicineName = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt();sc.nextLine();
            meds[i]=new Medicine(medicineName, batch, disease, price);
        }
        String inputDisease = sc.nextLine();

        Medicine[] ansOne = getPriceByDisease(meds, inputDisease);
        if(ansOne != null)
        {
            for(int i = 0; i < ansOne.length; i++){
                System.out.println(ansOne[i].getPrice());
            }
        }
        else{
            System.out.println("Meow");
        }
    }
}

