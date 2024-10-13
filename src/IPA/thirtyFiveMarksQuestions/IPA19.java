package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;


class Engine{
    private int engineId;
    private double enginePrice;
    private String engineName, engineType;



    //Getters

    public int getEngineId(){return engineId;}
    public double getEnginePrice(){return enginePrice;}
    public String getEngineName(){return engineName;}
    public String getEngineType(){return engineType;}

    //Setters

    public void setEngineId(int engineId){this.engineId=engineId;}
    public void setEnginePrice(double enginePrice){this.enginePrice=enginePrice;}
    public void setEngineName(String engineName){this.engineName=engineName;}
    public void setEngineType(String engineType){this.engineType=engineType;}

    //Const
    Engine(int engineId, String engineName, String engineType, double enginePrice)
    {
        this.engineId = engineId;
        this.engineName=engineName;
        this.engineType=engineType;
        this.enginePrice =enginePrice;
    }

}
class Solution19
{

    public static int findAvgEnginePriceByType(Engine[] en, String type)
    {
        int count=0;
        int sum = 0;
        for(int i = 0; i<en.length;i++){
            if(en[i].getEngineType().equalsIgnoreCase(type))
            {
                sum+=en[i].getEnginePrice();
                count++;
            }}
        if(count>0){
            return sum/count;
        }
        else
        {
            return 0;
        }
    }
    public static Engine[] searchEngineByName(Engine[] en, String name){

        int count=0;
        for(int i = 0; i<en.length;i++){
            if(en[i].getEngineName().equalsIgnoreCase(name)){
                count++;
            }}

        if(count < 1){
            return null;
        }

        Engine[] sortedEn = new Engine[count];
        int index= 0;

        for(int i =0 ;i<en.length;i++){
            if(en[i].getEngineName().equalsIgnoreCase(name)){
                sortedEn[index] = en[i];
                index++;
            }
        }
        for(int i = 0;i<sortedEn.length -1 ;i++)
        {
            for(int j = 0; j<sortedEn.length - i -1;j++)
            {
                if(sortedEn[j].getEngineId() > sortedEn[j+1].getEngineId()){
                    Engine temp =sortedEn[j];
                    sortedEn[j]=sortedEn[j+1];
                    sortedEn[j+1]=temp;
                }
            }

        }
        return sortedEn;


    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Engine[] e = new Engine[4];
        for(int i = 0;i<e.length;i++){
            int eid= sc.nextInt();sc.nextLine();
            String ename= sc.nextLine();
            String etype = sc.nextLine();
            double eprice= sc.nextInt();sc.nextLine();
            e[i] = new Engine(eid, ename,etype,eprice);
        }
        String inputType=sc.nextLine();
        String inputName =sc.nextLine();
        int ansOne = findAvgEnginePriceByType(e, inputType);
        if(ansOne != 0){
            System.out.println(ansOne);
        }
        else{System.out.println("Meow");}


        Engine[] ansTwo = searchEngineByName(e, inputName);
        if(ansTwo != null){
            for(int i = 0; i <ansTwo.length;i++){
                System.out.println(ansTwo[i].getEngineId());
            }
        }
        else{System.out.println("Meow");}
    }
}

/**
 1001
 Maruti
 Diesel
 20000
 1002
 Kia
 Pertro
 17000
 1003
 Hyundai
 Diesel
 24000
 1000
 Maruti
 Petrol
 27500
 Petrol
 Maruti
 */
