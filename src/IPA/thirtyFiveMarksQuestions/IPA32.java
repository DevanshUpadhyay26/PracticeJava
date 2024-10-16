package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodechefHHH
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        TravelAgencies[] ta = new TravelAgencies[4];
        for(int i = 0; i< ta.length;i++)
        {
            int regNo = sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String type=sc.nextLine();
            int price=sc.nextInt();sc.nextLine();
            boolean flight= sc.nextBoolean();

            ta[i]= new TravelAgencies(regNo, name, type, price, flight);
        }
        int inputRegNo=sc.nextInt();sc.nextLine();
        String inputType=sc.nextLine();
        TravelAgencies[] ansOne = findAgencyWithHighestPackagePrice(ta);
        if(ansOne != null)
        {
            for(int i = 0; i<ansOne.length;i++)
            {
                System.out.println(ansOne[0].getPrice());
                break;
            }
        }
        else{System.out.println("Meow");}

        TravelAgencies[] ansTwo = agencyDetailsForGivenldAndType(ta, inputRegNo, inputType);
        if(ansTwo != null)
        {
            for(int i = 0; i<ansTwo.length;i++)
            {
                System.out.println(ansTwo[i].getName() + ":" + ansTwo[i].getPrice());
            }
        }
        else{System.out.println("Meow");}
        sc.close();
    }
    public static TravelAgencies[] findAgencyWithHighestPackagePrice(TravelAgencies[] ta)
    {

        for(int i=0;i<ta.length - 1 ;i++)
        {
            for(int j = 0; j<ta.length - i -1; j++)
            {
                if(ta[j].getPrice() < ta[j+1].getPrice())
                {
                    TravelAgencies temp = ta[j];
                    ta[j] = ta[j+1];
                    ta[j+1] =temp;
                }
            }
        }
        if(ta.length < 0)
        {
            return null;
        }
        return ta;
    }

    public static TravelAgencies[] agencyDetailsForGivenldAndType(TravelAgencies[] ta, int regNo, String type)
    {

        int count = 0;
        for(int i = 0; i<ta.length ; i++){
            if(ta[i].getRegNo() == regNo && ta[i].getType().equalsIgnoreCase(type) )
            {

                count++;
            }
        }
        if(count<1){return null;}
        int index = 0;
        TravelAgencies[] sortTA = new TravelAgencies[count];
        for(int i = 0; i<ta.length ; i++){
            if(ta[i].getRegNo() == regNo && ta[i].getType().equalsIgnoreCase(type) )
            {
                sortTA[index] = ta[i];
                index++;
            }
        }
        return sortTA;
    }
}

class TravelAgencies {

    private int regNo, price;
    private String name, type;
    private boolean flightFacility;



    public int getRegNo(){return regNo;}
    public int getPrice(){return price;}
    public String getName(){return name;}
    public String getType(){return type;}
    public boolean getFlight(){return flightFacility;}


    public void setRegNo(int regNo){this.regNo=regNo;}
    public void setPrice(int price){this.price=price;}
    public void setName(String name){this.name=name;}
    public void setType(String type){this.type=type;}
    public void setFlight(boolean flightFacility){this.flightFacility=flightFacility;}

    TravelAgencies(int regNo, String name, String type, int price, boolean flightFacility)
    {
        this.regNo=regNo;
        this.name=name;
        this.type=type;
        this.price=price;
        this.flightFacility=flightFacility;
    }

}

/*123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond*/