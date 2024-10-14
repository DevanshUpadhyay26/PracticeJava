package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class Sim_2 {

    private int id, bal;
    private String comp, circle;
    private double rate;

    // Getters
    public int getId() { return id; }
    public int getBal() { return bal; }
    public String getComp() { return comp; }
    public String getCircle() { return circle; }
    public double getRate() { return rate; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setBal(int bal) { this.bal = bal; }
    public void setComp(String comp) { this.comp = comp; }
    public void setCircle(String circle) { this.circle = circle; }
    public void setRate(double rate) { this.rate = rate; }

    // Constructor
    Sim_2(int id, String comp, int bal, double rate, String circle) {
        this.id = id;
        this.bal = bal;
        this.comp = comp;
        this.circle = circle;
        this.rate = rate;
    }
}

class CodechefHAHAH {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        Sim_2[] s = new Sim_2[4];
        for (int i = 0; i < s.length; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String comp = sc.nextLine();
            int bal = sc.nextInt(); sc.nextLine();
            double rate = sc.nextDouble(); sc.nextLine();
            String circle = sc.nextLine();
            s[i] = new Sim_2(id, comp, bal, rate, circle);
        }

        String inputCircle = sc.nextLine();
        double inputRate = sc.nextDouble();

        Sim_2[] ansOne = matchAndSort(s, inputCircle, inputRate);
        if (ansOne != null) {
            for (int i = 0; i < ansOne.length; i++) {
                System.out.println(ansOne[i].getId());
            }
        } else {
            System.out.println("Meow");
        }
    }

    public static Sim_2[] matchAndSort(Sim_2[] sim, String search_circle, double search_rate) {
        int count = 0;
        for (int i = 0; i < sim.length; i++) {
            if (sim[i].getCircle().equalsIgnoreCase(search_circle) && search_rate > sim[i].getRate()) {
                count++;
            }
        }

        if (count < 1) {
            return null;
        }

        int index = 0;
        Sim_2[] s2 = new Sim_2[count];
        for (int i = 0; i < sim.length; i++) {
            if (sim[i].getCircle().equalsIgnoreCase(search_circle) && search_rate > sim[i].getRate()) {
                s2[index] = sim[i];
                index++;
            }
        }

        for (int i = 0; i < s2.length - 1; i++) {
            for (int j = 0; j < s2.length - i - 1; j++) {
                if (s2[j].getBal() < s2[j + 1].getBal()) {
                    Sim_2 temp = s2[j];
                    s2[j] = s2[j + 1];
                    s2[j + 1] = temp;
                }
            }
        }

        return s2;
    }
}
