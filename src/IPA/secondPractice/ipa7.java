package IPA.secondPractice;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef7
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc  = new Scanner(System.in);
        Sim[] sim = new Sim[5];
        for(int i = 0; i<sim.length; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            double bal = sc.nextDouble(); sc.nextLine();
            double rate = sc.nextDouble(); sc.nextLine();
            String circle = sc.nextLine();
            sim[i] = new Sim(id, name, bal, rate, circle);
        }

        String inputCircleOld= sc.nextLine();
        String inputCricleNew= sc.nextLine();
        Sim[] ansOne = transferCustomerCircle(sim, inputCircleOld, inputCricleNew);
        if(ansOne != null)
        {
            for(int i=0 ; i<ansOne.length; i++)
            {
                System.out.println(ansOne[i].getId() + " " + ansOne[i].getName() + " " + ansOne[i].getCircle() + " " + ansOne[i].getRate());
            }

        }

        sc.close();


    }
    public static Sim[] transferCustomerCircle( Sim[] sim, String circleOld, String circleNew)
    {
        //Sort desc the rate
        //If cricle matches with input circle

        int count = 0;
        for(int i = 0; i<sim.length;i++){
            if(sim[i].getCircle().equalsIgnoreCase(circleOld)){count++;}
        }
        if(count<1){return null;}

        int index = 0;
        Sim[] simS = new Sim[count];
        for(int i = 0; i<sim.length;i++){
            if(sim[i].getCircle().equalsIgnoreCase(circleOld))
            {
                simS[index] = sim[i];sim[i].setCircle(circleNew);
                index++;
            }
        }
        for(int i =0; i<simS.length - 1; i++)
        {
            for(int j = 0; j<simS.length - i -1; j++)
            {
                if(simS[j].getRate() <simS[j+1].getRate())
                {
                    Sim temp = simS[j];
                    simS[j] = simS[j+1];
                    simS[j+1] = temp;
                }
            }
        }
        return simS;
    }
}
class Sim{
    private int id;
    private String name, circle;
    private double bal, rate;


    public int getId(){return id;}
    public String getName(){return name;}
    public String getCircle(){return circle;}
    public double getBal(){return bal;}
    public double getRate(){return rate;}

    public void setId(int id){this.id= id;}
    public void setName(String name ) {this.name = name;}
    public void setCircle(String circle){this.circle = circle;}
    public void setBal(double bal){this.bal = bal;}
    public void setRate(double rate){this.rate = rate;}

    Sim(int id, String name, double bal, double rate, String circle)
    {
        this.id = id;
        this.name = name;
        this.bal = bal;
        this.rate = rate;
        this.circle = circle;
    }



}

