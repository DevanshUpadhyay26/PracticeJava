package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;



class NavalVessel{
    private int vesselId,noOfVoyagesPlanned,noOfVoyagesCompleted;
    private String vesselName, purpose;


    //Getters

    public int getVesselId(){return vesselId;}
    public int getNoOfVoyagesPlanned(){return noOfVoyagesPlanned;}
    public int getNoOfVoyagesCompleted(){return noOfVoyagesCompleted;}
    public String getVesselName(){return vesselName;}
    public String getPurpose(){return purpose;}

    //Setters

    public void setVesselId(int vesselId){this.vesselId = vesselId;}
    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned){this.noOfVoyagesPlanned = noOfVoyagesPlanned;}
    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted){this.noOfVoyagesCompleted = noOfVoyagesCompleted;}
    public void setVesselName(String vesselName){this.vesselName = vesselName;}
    public void setPurpose(String purpose){this.purpose = purpose;}


    //Consts

    NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose){
        this.vesselId=vesselId;
        this.vesselName=vesselName;
        this.noOfVoyagesPlanned=noOfVoyagesPlanned;
        this.noOfVoyagesCompleted=noOfVoyagesCompleted;
        this.purpose=purpose;
    }


}


class Solution15
{
    public static int findAvgVoyagesByPct(NavalVessel[] nv, int per){
        int count = 0;
        int sum = 0;
        for(int i = 0; i<nv.length; i++){
            int percentage = nv[i].getNoOfVoyagesCompleted() * 100/nv[i].getNoOfVoyagesPlanned();
            if(percentage >= per){
                sum+=nv[i].getNoOfVoyagesCompleted();
                count++;
            }
        }

        if(count>0){
            return sum/count;
        }
        else{
            return 0;
        }
    }

    public static NavalVessel[] findVesselByGrade(NavalVessel[] nv, String pur)
    //return arr obj after finding purpose
    {
        int count = 0;
        for(int i = 0; i<nv.length; i++)
        {
            if(nv[i].getPurpose().equalsIgnoreCase(pur))
            {
                count++;
            }
        }

        if(count<1){
            return null;
        }

        NavalVessel[] purNv = new NavalVessel[count];
        int index = 0;

        for(int i = 0; i<nv.length; i++){
            if(nv[i].getPurpose().equalsIgnoreCase(pur))
            {
                purNv[index] = nv[i];
                index++;
            }
        }

        return purNv;

    }


    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        NavalVessel[] nv = new NavalVessel[4];

        for(int i= 0; i<nv.length; i++)
        {
            int vid= sc.nextInt(); sc.nextLine();
            String vN = sc.nextLine();
            int nvp = sc.nextInt();sc.nextLine();
            int nvc= sc.nextInt();sc.nextLine();
            String pur= sc.nextLine();
            nv[i] = new NavalVessel(vid, vN, nvp, nvc, pur);
        }
        int inputPer = sc.nextInt();sc.nextLine();
        String inputPur = sc.nextLine();

        int ansOne = findAvgVoyagesByPct(nv, inputPer);
        if(ansOne != 0){
            System.out.println(ansOne);
        }
        else{
            System.out.println("Meow");
        }

        NavalVessel[] purNv = findVesselByGrade(nv, inputPur);
        if(purNv != null){

            for(int i = 0;i<purNv.length; i++){
                int percentage = purNv[i].getNoOfVoyagesCompleted() * 100/purNv[i].getNoOfVoyagesPlanned();
                if(percentage == 100){System.out.println(purNv[i].getVesselName() + "%Start");}
                if(percentage >= 80 && percentage <=99){System.out.println(purNv[i].getVesselName() + "%Start");}
                else if(percentage >= 59 && percentage <=79 ){System.out.println(purNv[i].getVesselName() + "%Inspirer");}
                else{System.out.println(purNv[i].getVesselName() + "%Striver");}
            }
        }
        else{
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
        sc.close();
    }
}
/*
* 111
Rojer
100
100
Passenger
222
Kalam
200
100
Goods
333
Yashwin
400
300
Army
444
Thanishwini
500
500
Welfare
75
Army
* */
