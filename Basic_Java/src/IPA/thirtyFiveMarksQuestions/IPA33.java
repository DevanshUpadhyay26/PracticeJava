package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveCar
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Car[] cars = new Car[5];
        for(int i = 0; i<cars.length;i++)
        {
            int id=sc.nextInt();sc.nextLine();
            String carName = sc.nextLine();
            String type=sc.nextLine();
            cars[i] = new Car(id, carName, type);
        }
        int inputId = sc.nextInt();
        Car[] ansOne = RemoveAndRearrange(cars, inputId);
        if(ansOne !=null)
        {
            for(int i = 0; i<ansOne.length;i++)
            {
                System.out.println(ansOne[i].getId() + " : " + ansOne[i].getCarName());
            }
        }
        else{System.out.println("Meow");}
        sc.close();



    }

    public static Car[] RemoveAndRearrange(Car[] cars, int id)
    {
        int count =0;
        for(int i = 0; i<cars.length;i++)
        {
            if(cars[i].getId() != id)
            {
                count++;
            }
        }
        if(count<1){return null;}
        Car[] newCar = new Car[count];
        int index = 0;
        for(int i  = 0; i<cars.length;i++)
        {

            if(cars[i].getId() != id)
            {
                newCar[index] = cars[i];
                index++;
            }
        }
        return cars;
    }
}

class Car {
    private int carId;
    private String carName, fuelType;



    public int getId(){return carId;}
    public String getCarName(){return carName;}
    public String getFuelType(){return fuelType;}

    public void setId(int carId){this.carId=carId;}
    public void setCarName(String carName){this.carName=carName;}
    public void setFuelType(String fuelType){this.fuelType=fuelType;}

    Car(int carId, String carName, String fuelType)
    {
        this.carId=carId;
        this.carName=carName;
        this.fuelType=fuelType;
    }


}

/*1001
Maruti
Diesel
1002
Kia
Pertro
1003
Hyundai
Diesel
1004
Taxi
Petrol
1005
Truck
Diesel
1005*/