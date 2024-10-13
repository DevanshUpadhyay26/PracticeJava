package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class AutonomousCar{
    private int carId, noOfTestsConducted,noOfTestsPassed;
    private String brand, environment;

    //getters

    public int getCarId(){return carId;}
    public int getNoOfTestsConducted(){return noOfTestsConducted;}
    public int getNoOfTestsPassed(){return noOfTestsPassed;}
    public String getBrand(){return brand;}
    public String getEnvironment(){return environment;}

    //setters

    public void setCarId(int carId){this.carId = carId;}
    public void setNoOfTestsConducted(int noOfTestsConducted){this.noOfTestsConducted = noOfTestsConducted;}
    public void setNoOfTestsPassed(int noOfTestsPassed){this.noOfTestsPassed = noOfTestsPassed;}
    public void setBrand(String brand){this.brand = brand;}
    public void setEnvironment(String environment){this.environment = environment;}

    //Consts

    AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment)
    {
        this.carId=carId;
        this.brand=brand;
        this.noOfTestsConducted=noOfTestsConducted;
        this.noOfTestsPassed=noOfTestsPassed;
        this.environment=environment;
    }




}

class Solution12
{


    public static int findTestPassedByEnv(AutonomousCar[] amc, String env)
    {
        int sum= 0;
        for(int i = 0 ; i<amc.length;i++)
        {
            if(amc[i].getEnvironment().equalsIgnoreCase(env)){
                sum += amc[i].getNoOfTestsPassed();
            }
        }

        if(sum > 0 ){
            return sum;
        }
        else{return 0;}

    }

    public static AutonomousCar[] updateCarGrade(AutonomousCar[] amc, String brand)
    {

        int count = 0;
        for(int i = 0; i<amc.length; i++)
        {
            if(amc[i].getBrand().equalsIgnoreCase(brand))
            {
                count++;
            }
        }

        if(count<1){
            return null;
        }

        AutonomousCar[] tempCar = new AutonomousCar[count];
        int index=0;
        for(int i = 0; i<amc.length; i++)
        {
            if(amc[i].getBrand().equalsIgnoreCase(brand))
            {
                tempCar[index] = amc[i];
                index++;
            }
        }
        return tempCar;
    }


    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        AutonomousCar[] amc = new AutonomousCar[4];
        for(int i = 0; i<amc.length; i++)
        {
            int carId = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            int noOfTestsConducted = sc.nextInt();sc.nextLine();
            int noOfTestsPassed = sc.nextInt();sc.nextLine();
            String environment = sc.nextLine();
            amc[i] = new AutonomousCar(carId, brand, noOfTestsConducted,noOfTestsPassed,environment);
        }

        String inputEnv = sc.nextLine();
        String inputBrand= sc.nextLine();

        int ansOne = findTestPassedByEnv(amc, inputEnv);
        if(ansOne != 0){
            System.out.println(ansOne);
        }
        else{
            System.out.println("There are no tests passed in this particular environment");
        }
        AutonomousCar[] ansTwo =  updateCarGrade(amc, inputBrand);

        if(ansTwo != null)
        {
            for(int i = 0; i<ansTwo.length;i++)
            {
                int grade = ansTwo[i].getNoOfTestsPassed() * 100 / ansTwo[i].getNoOfTestsConducted();

                if(grade >= 80){
                    System.out.println(ansTwo[i].getBrand()+ ":: A1");
                }
                else{
                    System.out.println(ansTwo[i].getBrand()+ ":: B2");
                }
            }
        }
        else{
            System.out.println("No Car is available with the specified brand");
        }


        sc.close();

    }
}
/*
* 100
Tesla
1000
500
Hills
200
Ford
2000
1500
Desert
300
Royce
3000
1700
Hills
400
Mercedez
1000
400
Desert
Desert
Mercedez
* */