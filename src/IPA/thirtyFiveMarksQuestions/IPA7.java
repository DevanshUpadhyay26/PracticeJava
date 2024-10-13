package IPA.thirtyFiveMarksQuestions;

import java.util.*;
import java.lang.*;
import java.io.*;


class Hotel {
    private int hotelId, noOfRoomsBooked;
    private String hotelName, dateOfBooking , wifiFacility;
    private double totalBill;


    //getters
    public int getHotelId(){return hotelId;}
    public int getNoOfRoomsBooked(){return noOfRoomsBooked;}
    public String getHotelName(){return hotelName;}
    public String getDateOfBooking(){return dateOfBooking;}
    public String getWifiFacility(){return wifiFacility;}
    public double getTotalBill(){return totalBill;}

    //setters

    public void setHotelId(int hotelId){this.hotelId = hotelId;}
    public void setNoOfRoomsBooked(int noOfRoomsBooked){this.noOfRoomsBooked = noOfRoomsBooked;}
    public void setHotelName(String hotelId){this.hotelName = hotelName;}
    public void setDateOfBooking(String dateOfBooking){this.dateOfBooking = dateOfBooking;}
    public void setWifiFacility(String wifiFacility){this.wifiFacility = wifiFacility;}
    public void setTotalBill(double totalBill){this.totalBill = totalBill;}
    //Const

    Hotel(int hotelId, String hotelName,String dateOfBooking,int noOfRoomsBooked, String wifiFacility,double totalBill)
    {
        this.hotelId=hotelId;
        this.hotelName=hotelName;
        this.dateOfBooking=dateOfBooking;
        this.noOfRoomsBooked=noOfRoomsBooked;
        this.wifiFacility=wifiFacility;
        this.totalBill=totalBill;
    }


}

class Solution4{
    public static int noOfRoomsBookedInGivenMonth(Hotel[] hotels, String month){

        int count = 0;

        for(int i = 0; i<hotels.length;i++){
            if(hotels[i].getDateOfBooking().contains(month)){

                count +=hotels[i].getNoOfRoomsBooked();
            }
        }
        if(count>0){return count;}
        else{return 0;}
    }

    public static int searchHotelByWifiOption(Hotel[] hotels, String wifi){

        // 1. return object by 2nd highest tB

        Hotel[] tempH = new Hotel[0];

        for(int i = 0; i<hotels.length;i++){
            if(hotels[i].getWifiFacility().equals(wifi)){
                tempH=Arrays.copyOf(tempH,tempH.length+1);
                tempH[tempH.length -1] = hotels[i];
            }
        }


        //ASCENDING ORDER BUBBLE SORT
        for(int i = 0;i < tempH.length - 1; i++){
            for(int j=0; j < tempH.length - i - 1; j++){
                if(tempH[j].getTotalBill() >tempH[j+1].getTotalBill())
                {
                    Hotel Temp = tempH[j];
                    tempH[j] = tempH[j+1];
                    tempH[j+1] = Temp;
                }

            }
        }


        if(tempH.length > 0){
            return tempH[tempH.length - 2].getHotelId();        //Retruning 2nd last highest total bill
        }
        else{return 0;}

    }




    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Hotel[] hotels = new Hotel[4];
        for(int i = 0;i <hotels.length; i++){
            int hID = sc.nextInt();sc.nextLine();
            String hName = sc.nextLine();
            String dOB = sc.nextLine();
            int nORB = sc.nextInt();sc.nextLine();
            String wi = sc.nextLine();
            double tB = sc.nextDouble();sc.nextLine();
            hotels[i] = new Hotel(hID,hName, dOB, nORB, wi, tB);
        }
        String inputMonth = sc.nextLine();
        String inputWifi = sc.nextLine();


        int ansOne = noOfRoomsBookedInGivenMonth(hotels, inputMonth);
        if(ansOne != 0){
            System.out.println(ansOne);
        }
        else{
            System.out.println("No rooms booked in the given month.");
        }
        int ansTwo = searchHotelByWifiOption(hotels, inputWifi);
        if(ansTwo != 0){
            System.out.println(ansTwo);
        }
        else{
            System.out.println("No such option available.");
        }


    }
}