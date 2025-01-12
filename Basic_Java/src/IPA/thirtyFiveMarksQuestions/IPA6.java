package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;


class Sim_1 {
    int simId;
    String customerName, circle;
    double balance, ratePerSecond;

    // Getter
    public int getSimId() { return simId; }
    public String getCustomerName() { return customerName; }
    public String getCircle() { return circle; }
    public double getBalance() { return balance; }
    public double getRatePerSecond() { return ratePerSecond; }

    // Setter
    public void setSimId(int simId) { this.simId = simId; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setCircle(String circle) { this.circle = circle; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setRatePerSecond(double ratePerSecond) { this.ratePerSecond = ratePerSecond; }

    // Constructor
    Sim_1(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.circle = circle;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
    }
}

class Solution3 {
    public static Sim_1[] transferCustomerCircle(Sim_1[] sim, String circleOld, String circleTwo) {
        Sim_1[] tempSim = new Sim_1[0];

        for (int i = 0; i < sim.length; i++) {
            if (sim[i].getCircle().equalsIgnoreCase(circleOld)) {
                tempSim = Arrays.copyOf(tempSim, tempSim.length + 1);
                sim[i].circle = circleTwo;
                tempSim[tempSim.length - 1] = sim[i];
            }
        }

        // Sorting in Descending by ratePerSecond
        for (int i = 0; i < tempSim.length - 1; i++) {
            for (int j = 0; j < tempSim.length - i - 1; j++) {
                if (tempSim[j].getRatePerSecond() < tempSim[j + 1].getRatePerSecond()) {
                    Sim_1 var = tempSim[j];
                    tempSim[j] = tempSim[j + 1];
                    tempSim[j + 1] = var;
                }
            }
        }

        if (tempSim.length > 0) {
            return tempSim;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sim_1[] sims = new Sim_1[5];
        for (int i = 0; i < sims.length; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String cN = sc.nextLine();
            double bal = sc.nextDouble(); sc.nextLine();
            double rateP = sc.nextDouble(); sc.nextLine();
            String c = sc.nextLine();

            sims[i] = new Sim_1(id, cN, bal, rateP, c);
        }

        String circleOld = sc.nextLine();
        String circleNew = sc.nextLine();

        Sim_1[] ansOne = transferCustomerCircle(sims, circleOld, circleNew);
        if (ansOne != null) {
            for (Sim_1 sim : ansOne) {
                System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " " + sim.getRatePerSecond());
            }
        }
    }
}
