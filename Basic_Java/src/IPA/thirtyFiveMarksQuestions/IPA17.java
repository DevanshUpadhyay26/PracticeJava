package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;



class Antenna{

    private int antennaId;
    private String antennaName, projectLead;
    private double antennaVSWR;


    //Getters
    public int getAntennaId(){return antennaId;}
    public String getAntennaName(){return antennaName;}
    public String getProjectLead(){return projectLead;}
    public double getAntennaVSWR(){return antennaVSWR;}

    //Setters

    public void setAntennaId(int antennaId){this.antennaId = antennaId;}
    public void setAntennaName(String antennaName){this.antennaName = antennaName;}
    public void setProjectLead(String projectLead){this.projectLead = projectLead;}
    public void setAntennaVSWR(double antennaVSWR){this.antennaVSWR = antennaVSWR;}

    //Consts

    Antenna(int antennaId,String antennaName,String projectLead, double antennaVSWR){
        this.antennaId=antennaId;
        this.antennaName=antennaName;
        this.projectLead=projectLead;
        this.antennaVSWR=antennaVSWR;
    }
}

class Solution17
{

    public static int searchAntennaByName(Antenna[] an, String name){
        int count = 0;
        for(int i =0; i<an.length;i++){
            if(an[i].getAntennaName().equalsIgnoreCase(name)){
                count++;
            }
        }
        if(count<1){return 0;}

        Antenna[] returnAr = new Antenna[count];
        int index = 0;
        for(int i = 0; i<an.length;i++){
            if(an[i].getAntennaName().equalsIgnoreCase(name))
            {
                returnAr[index] = an[i];
                index++;
            }
        }
        for(int i =0;i<returnAr.length;i++){
            return returnAr[i].getAntennaId();
        }
        return 0;
    }

    public static Antenna[] sortAntennaByVSWR(Antenna[] an, double vswr){
        int count = 0;
        for(int i = 0; i<an.length; i++){
            if(an[i].getAntennaVSWR() < vswr){
                count++;
            }
        }

        if(count<1){
            return null;
        }

        Antenna[] sortedAn = new Antenna[count];
        int index = 0;
        for(int i = 0; i<an.length; i++){
            if(an[i].getAntennaVSWR() < vswr){
                sortedAn[index] = an[i];
                index++;
            }
        }
        for(int i = 0; i<sortedAn.length - 1; i++){
            for(int j = 0; j<sortedAn.length - i - 1; j++){
                if(sortedAn[j].getAntennaVSWR() >   sortedAn[j+1].getAntennaVSWR())
                {
                    Antenna temp = sortedAn[j];
                    sortedAn[j] = sortedAn[j+1];
                    sortedAn[j+1] = temp;
                }
            }
        }
        return sortedAn;

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        Antenna[] an = new Antenna[4];
        for(int i= 0; i<an.length; i++){
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String pl =sc.nextLine();
            double vswr= sc.nextDouble();sc.nextLine();
            an[i]= new Antenna(id,name,pl,vswr);
        }
        String inputName = sc.nextLine();
        double inputVSWR = sc.nextDouble();
        int ansOne = searchAntennaByName(an, inputName);
        if(ansOne != 0){
            System.out.println(ansOne);
        }
        else{
            System.out.println("Meow");
        }


        Antenna[] ansTwo = sortAntennaByVSWR(an, inputVSWR);

        if(ansTwo != null){
            for(int i = 0; i<ansTwo.length; i ++){
                System.out.println(ansTwo[i].getProjectLead());
            }
        }
        else{System.out.println("Meow");}

        sc.close();
    }
}

/*111
Reconfigurable
Hema
0.4
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.3
444
Dielectric
Sai
0.65
Microstrip
0.5*/