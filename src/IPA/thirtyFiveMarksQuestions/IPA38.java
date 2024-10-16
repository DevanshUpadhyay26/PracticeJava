package IPA.thirtyFiveMarksQuestions;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef22
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        Car2[] cars = new Car2[4];
        for(int i = 0; i<cars.length; i++)
        {
            String make = sc.nextLine();
            String model = sc.nextLine();
            int year = sc.nextInt();sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            cars[i] = new Car2(make, model, year, price);
        }
        String inputMake = sc.nextLine();
        String inputModel=sc.nextLine();

        Car2[] ansOne = findMostExpensiveCar(cars);
        if(ansOne != null)
        {
            System.out.println(ansOne[0].getMake() + "\n" + ansOne[0].getModel()  + "\n" + ansOne[0].getPrice() + "\n" + ansOne[0].getYear());
        }
        else{System.out.println("Meow");}

        Car2[] ansTwo = getCarByMakeAndModel(cars, inputMake, inputModel);
        if(ansTwo != null)
        {
            for(int i = 0; i<ansTwo.length; i++)
            {
                System.out.println(ansTwo[i].getYear() + "\n" + ansTwo[i].getPrice());
                break;
            }
        }
        else{System.out.println("Meow");}


        sc.close();
    }

    public static Car2[] findMostExpensiveCar(Car2[] cars){
        int count = 0;
        for(int i  = 0 ; i<cars.length;i++)
        {
            count++;
        }
        if(count<1){return null;}

        Car2[] sortedCar = new Car2[count];
        int index = 0;
        for(int i = 0; i<cars.length; i++)
        {
            sortedCar[index] = cars[i];
            index++;
        }

        for(int i = 0; i<sortedCar.length - 1 ; i++)
        {
            for(int j = 0; j<sortedCar.length - i - 1; j++)
            {
                if(sortedCar[j].getPrice() < sortedCar[j+1].getPrice())
                {
                    Car2 temp = sortedCar[j];
                    sortedCar[j]= sortedCar[j+1];
                    sortedCar[j+1] = temp;
                }
            }
        }
        return sortedCar;
    }
    public static Car2[] getCarByMakeAndModel(Car2[] cars, String make, String model)
    {
        int count = 0;
        for(int i = 0; i<cars.length;i++)
        {
            if(cars[i].getMake().equalsIgnoreCase(make) && cars[i].getModel().equalsIgnoreCase(model))
            {
                count++;
            }
        }

        if(count<1){return null;}

        int index = 0;
        Car2[] sortedCar = new Car2[count];

        for(int i = 0; i<cars.length;i++)
        {
            if(cars[i].getMake().equalsIgnoreCase(make) && cars[i].getModel().equalsIgnoreCase(model))
            {
                sortedCar[index] = cars[i];
                index++;
            }
        }
        return sortedCar;
    }
}



class Car2{
    private int year;
    private String model, make;
    private double price;


    public int getYear(){return year;}
    public String getModel(){return model;}
    public String getMake(){return make;}
    public double getPrice(){return price;}


    public void setYear(int year){this.year = year;}
    public void setModel(String model){this.model = model;}
    public void setMake(String make){this.make = make;}
    public void setPrice(double price){this.price = price;}


    Car2(String make, String model, int year, double price)
    {
        this.make = make;
        this.model =model;
        this.year = year;
        this.price = price;
    }

}
/*Mercedes
S-Class
2020
1250000
BMW
5-Series
2019
900000
Audi
A4
2022
800000
Jaguar
F-PACE
2021
1100000
Audi
A4*/