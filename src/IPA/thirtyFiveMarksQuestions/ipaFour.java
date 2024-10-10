package IPA.thirtyFiveMarksQuestions;

import java.util.*;
import java.lang.*;
import java.io.*;


class Motel{

    private int motelId, noOfRoomsBooked;
    private String dateOfBooking, cabFacility, motelName;
    private double totalBill;

    //Getters

    public int getMotelId(){return motelId;}
    public String getMotelName(){return motelName;}
    public int getNoOfRoomsBooked(){return noOfRoomsBooked;}
    public String getDateOfBooking(){return dateOfBooking;}
    public String getCabFacility(){return cabFacility;}
    public double getTotalBill(){return totalBill;}

    //Setters
    public void setMotelId(int motelId){this.motelId = motelId;}
    public void setMotelName(String motelName){this.motelName = motelName;}
    public void setNoOfRoomsBooked(int noOfRoomsBooked){this.noOfRoomsBooked = noOfRoomsBooked;}
    public void setDateOfBooking(String dateOfBooking){this.dateOfBooking = dateOfBooking;}
    public void setCabFacility(String cabFacility) {this.cabFacility = cabFacility;}
    public void setTotalBill(double totalBill){this.totalBill = totalBill;}



    //Constructors
    Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked,  String cabFacility, double totalBill){
        this.motelId = motelId;
        this.motelName = motelName;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.dateOfBooking = dateOfBooking;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }



}
class Solution2{
    // Method 1

    public static int totalNoOfRoomsBooked(Motel[] motels, String check)
    {
        int totalRooms = 0;

        for (int i = 0; i<motels.length; i++){
            if(motels[i].getCabFacility().equalsIgnoreCase(check) && motels[i].getNoOfRoomsBooked()>5)
            {totalRooms += motels[i].getNoOfRoomsBooked();}
        }
        if(totalRooms > 0){

            return totalRooms;
        }
        else{
            return 0;
        }
    }


    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        //Take Inputs

        Motel[] motels = new Motel[4];
        for(int i = 0 ; i< motels.length ; i++)
        {
            int motelId= sc.nextInt();
            sc.nextLine();
            String motelName= sc.nextLine();
            String dateOfBooking = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();
            String cabFacility = sc.nextLine();
            double totalBill = sc.nextDouble();
            sc.nextLine();

            motels[i] = new Motel(motelId, motelName, dateOfBooking, noOfRoomsBooked, cabFacility, totalBill);
        }
        String inputCabFacility = sc.nextLine();


        //Calling First Method

        int ansOne = totalNoOfRoomsBooked(motels, inputCabFacility);
        if(ansOne != 0){
            System.out.println(ansOne);
        }
        else{
            System.out.println("No such rooms booked");
        }
        sc.close();
    }
}