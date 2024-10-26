package IPA.secondPractice;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef5
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner  sc = new Scanner(System.in);
        Motel[] mo = new Motel[4];
        for(int i=0;i<mo.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name= sc.nextLine();
            String date= sc.nextLine();
            int num= sc.nextInt();sc.nextLine();
            String cab = sc.nextLine();
            double bill = sc.nextDouble();sc.nextLine();
            mo[i] = new Motel(id, name, date,num, cab, bill);
        }
        String inputCab = sc.nextLine();
        int ansOne = totalNoOfRoomsBooked(mo, inputCab);
        if(ansOne != 0)
        {
            System.out.println(ansOne);
        }


        sc.close();
    }

    public static int totalNoOfRoomsBooked(Motel[] mo, String cab)
    {

        //cab = cab
        //bookedRooms > 5

        int count = 0;
        int res = 0;
        for(int i =0; i<mo.length;i++)
        {
            if(mo[i].getCab().equalsIgnoreCase(cab) && mo[i].getBookedRooms() > 5)
            {
                count++;
            }
        }
        if(count<1){return 0;}

        int index =0;
        Motel[] moS = new Motel[count];

        for(int i =0; i<mo.length;i++)
        {
            if(mo[i].getCab().equalsIgnoreCase(cab) && mo[i].getBookedRooms() > 5)
            {
                moS[index] = mo[i];
                index++;
            }
        }
        return moS[0].getBookedRooms();
    }

}

class Motel{

    private int id, bookedRooms;
    private String name, bookingDate, cab;
    private double bill;


    public int getId(){return id;}
    public int getBookedRooms(){return bookedRooms;}
    public String getName(){return name;}
    public String getBookingDate(){return bookingDate;}
    public String getCab(){return cab;}
    public double getBill(){return bill;}

    public void setId(int id){this.id= id;}
    public void setBookedRooms(int bookedRooms){this.bookedRooms = bookedRooms;}
    public void setName(String name ){this.name = name;}
    public void setBookingDate(String bookingDate){this.bookingDate=bookingDate;}
    public void setBill(double bill){this.bill = bill;}

    Motel(int id, String name, String bookingDate, int bookedRooms, String cab, double bill)
    {
        this.id=id;
        this.name= name;
        this.bookingDate=bookingDate;
        this.bookedRooms=bookedRooms;
        this.cab=cab;
        this.bill = bill;
    }



}