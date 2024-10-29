package IPA.secondPractice;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef10 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        Medicine[] med = new Medicine[4];
        for(int i = 0; i<med.length; i++)
        {
            String name = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();
            med[i] = new Medicine(name, batch, disease, price);
        }
        String inputDisease = sc.nextLine();
        Medicine[] ansOne = getPriceByDisease(med, inputDisease);
        if(ansOne != null)
        {
            for(int i =0; i<ansOne.length;i++)
            {
                System.out.println(ansOne[i].getPrice());
            }
        }
        else{System.out.println("Meow");}

        sc.close();
    }

    public static  Medicine[] getPriceByDisease(Medicine[] med, String disease)
    {
        int count = 0;

        for(int i = 0; i<med.length; i++)
        {
            if(med[i].getDisease().equalsIgnoreCase(disease))
            {
                count++;
            }
        }
        if(count<1){return null;}
        int index = 0;
        Medicine[] medS = new Medicine[count];
        for(int i = 0; i<med.length; i++)
        {
            if(med[i].getDisease().equalsIgnoreCase(disease))
            {
                medS[index] = med[i];
                index++;
            }
        }
        for(int i =0; i<medS.length-1;i++)
        {
            for(int j=0; j<medS.length - i -1;j++)
            {
                if(medS[j].getPrice() > medS[j+1].getPrice())
                {
                    Medicine temp = medS[j];
                    medS[j]= medS[j+1];
                    medS[j+1] = temp;
                }
            }
        }
        return medS;




    }

}

class Medicine{
    private String name, batch, disease;
    private int price;


    public String getName(){return name;}
    public String getBatch(){return batch;}
    public String getDisease(){return disease;}
    public int getPrice(){return price;}

    public void setName(String name){this.name = name;}
    public void setBatch(String batch){this.batch = batch;}
    public void setDisease(String disease){this.disease = disease;}
    public void setPrice(int price){this.price = price;}

    Medicine(String name, String batch, String disease, int price)
    {
        this.name = name;
        this.batch = batch;
        this.disease=  disease;
        this.price = price;
    }
}
