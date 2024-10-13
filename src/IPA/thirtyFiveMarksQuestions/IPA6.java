package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;


class Sim{
    int simId;
    String customerName, circle;
    double balance, ratePerSecond;

    //Getter
    public int getSimId(){return simId;}
    public String getCustomerName(){return customerName;}
    public String getCircle(){return circle;}
    public double getBalance(){return balance;}
    public double getRatePerSecond(){return ratePerSecond;}

    //Setter

    public void setSimId(int simId) {this.simId = simId;}
    public void setCustomerName(String customerName) {this.customerName = customerName;}
    public void setCircle(String circle) {this.circle = circle;}
    public void setBalance(double balance) {this.balance = balance;}
    public void setRatePerSecond(double ratePerSecond) {this.ratePerSecond = ratePerSecond;}

    //Constructor

    Sim(int simId, String customerName, double balance, double ratePerSecond, String circle){
        this.simId = simId;
        this.customerName=customerName;
        this.circle = circle;
        this.balance = balance;
        this.ratePerSecond= ratePerSecond;
    }



}
class Solution3{


    public static Sim[] transferCustomerCircle(Sim[] sim, String circleOld, String circleTwo){
        Sim[] tempSim = new Sim[0];

        for(int i = 0; i<sim.length;i++){
            if(sim[i].getCircle().equalsIgnoreCase(circleOld))
            {
                tempSim = Arrays.copyOf(tempSim,tempSim.length+1);
                sim[i].circle = circleTwo;
                tempSim[tempSim.length - 1] = sim[i];
            }
        }


        //Sorting in Descending in ratePerSec


        for(int i = 0; i<tempSim.length - 1;i++){
            for(int j = 0; j<tempSim.length - i - 1;j++){
                if(tempSim[j].getRatePerSecond() < tempSim[j+1].getRatePerSecond())
                {
                    Sim var = tempSim[j];
                    tempSim[j] = tempSim[j+1];
                    tempSim[j+1] = var;
                }
            }
        }

        if(tempSim.length > 0){
            return tempSim;
        }
        else{
            return null;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Sim[] sims = new Sim[5];
        for(int i = 0; i<sims.length;i++){
            int id = sc.nextInt();sc.nextLine();
            String cN = sc.nextLine();
            double bal = sc.nextDouble();sc.nextLine();
            double rateP = sc.nextDouble();sc.nextLine();
            String c = sc.nextLine();

            sims[i] = new Sim(id,cN,bal,rateP,c);
        }

        String circleOld = sc.nextLine();
        String circleNew = sc.nextLine();


        Sim[] ansOne = transferCustomerCircle(sims, circleOld, circleNew);
        if(ansOne != null)
        {
            for(Sim sim: ansOne)
            {
                System.out.println(sim.getSimId() +" "+ sim.getCustomerName()+" " + sim.getCircle() +" "+ sim.getRatePerSecond());
            }

        }

    }
}

/*
*
1
raj
100
1.5
KOL
2
chetan
200
1.6
AHD
3
asha
150
1.7
MUM
4
kiran
50
2.2
AHD
5
vijay
130
1.8
AHD
AHD
KOL
* */
