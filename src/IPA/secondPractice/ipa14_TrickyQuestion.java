package IPA.secondPractice;
import java.util.*;
import java.lang.*;

class Codechef14
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc =  new Scanner(System.in);
        NavalVessel[] nv = new NavalVessel[4];
        for(int i =0; i<nv.length;i++)
        {
            int id  =sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            int planned = sc.nextInt(); sc.nextLine();
            int completed = sc.nextInt(); sc.nextLine();
            String purpose =  sc.nextLine();
            nv[i] = new NavalVessel(id, name, planned, completed, purpose);
        }
        int inputPercentage = sc.nextInt(); sc.nextLine();
        String inputPurpose = sc.nextLine();

        int ansOne = findAvgVoyagestByPct (nv, inputPercentage);
        if(ansOne != 0)
        {
            System.out.println(ansOne);
        }
        else{System.out.println("Meow");}

        NavalVessel[] ansTwo = findVesselByGrade(nv, inputPurpose);
        if(ansTwo != null)
        {
            for(int i = 0; i<ansTwo.length; i++)
            {
                int per = (ansTwo[i].getCompleted() * 100) / ansTwo[i].getPlanned();
                if(per == 100) {System.out.println(ansTwo[i].getName() + "%" + "Start");}
                else if(per <= 99 && per >=80) {System.out.println(ansTwo[i].getName() + "%" + "Leader");}
                else if(per <= 79 && per >=55) {System.out.println(ansTwo[i].getName() + "%" + "Inspirer");}
                else {System.out.println(ansTwo[i].getName() + "%" + "Striver");}
            }
        }
        else{System.out.println("Meow");}
        sc.close();
    }

    public static int findAvgVoyagestByPct(NavalVessel[] nv, int per)
    {

        //perc() >=per then avg
        //avg = completed



        int count =0;
        int sum =0;
        for(int i=0;i<nv.length;i++)
        {
            int percentage = (nv[i].getCompleted() * 100) / nv[i].getPlanned();
            if(percentage >= per)
            {
                sum+=nv[i].getCompleted();
                count++;
            }
        }
        if(count<1){return 0;}
        return sum/count;
    }

    public static NavalVessel[] findVesselByGrade(NavalVessel[] nv, String purpose)
    {
        int count=0;
        for(int i =0 ;i<nv.length;i++)
        {
            if(nv[i].getPurpose().equalsIgnoreCase(purpose)){count++;}
        }
        if(count<1){return null;}
        NavalVessel[] nvS = new NavalVessel[count];
        int index = 0;
        for(int i =0 ;i<nv.length;i++)
        {
            if(nv[i].getPurpose().equalsIgnoreCase(purpose))
            {
                nvS[index] = nv[i];
                index++;
            }
        }
        return nvS;
    }
}

class NavalVessel{

    private int id, planned, completed;
    private String name, purpose;

    public int getId(){return id;}
    public int getPlanned(){return planned;}
    public int getCompleted(){return completed;}
    public String getName(){return name;}
    public String getPurpose(){return purpose;}


    NavalVessel(int id, String name, int planned, int completed, String purpose)
    {
        this.id= id;
        this.name=name;
        this.planned=planned;
        this.completed=completed;
        this.purpose=purpose;
    }
}
