package IPA.secondPractice;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef9 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        Player[] p = new Player[4];
        for (int i = 0; i < p.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String skill = sc.nextLine();
            String level = sc.nextLine();
            int points = sc.nextInt();
            sc.nextLine();
            p[i] = new Player(id, skill, level, points);
        }
        String inputSkill = sc.nextLine();
        String inputLevel = sc.nextLine();

        int ansOne = findPointsForGivenSkill(p, inputSkill);
        if (ansOne != 0) {
            System.out.println(ansOne);
        } else {
            System.out.println("Meow");
        }

        Player[] ansTwo = getPlayerBasedOnLevel(p, inputSkill, inputLevel);
        if (ansTwo != null && ansTwo.length > 0) {
            System.out.println(ansTwo[0].getId());
        } else {
            System.out.println("Meow");
        }

        sc.close();
    }

    public static int findPointsForGivenSkill(Player[] p, String skill) {
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i].getSkill().equalsIgnoreCase(skill)) {
                sum += p[i].getPoints();
            }
        }
        if (sum < 1) {
            return 0;
        }
        return sum;
    }

    public static Player[] getPlayerBasedOnLevel(Player[] p, String skill, String level) {
        int count = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i].getSkill().equalsIgnoreCase(skill) && p[i].getLevel().equalsIgnoreCase(level)
                    && p[i].getPoints() >= 20) {
                count++;
            }
        }
        if (count < 1) {
            return null;
        }

        int index = 0;
        Player[] pp = new Player[count];
        for (int i = 0; i < p.length; i++) {
            if (p[i].getSkill().equalsIgnoreCase(skill) && p[i].getLevel().equalsIgnoreCase(level)
                    && p[i].getPoints() >= 20) {
                pp[index] = p[i];
                index++;
            }
        }
        return pp;
    }
}

class Player {
    private int id, points;
    private String skill, level;

    public int getId() {
        return id;
    }

    public int getPoints() {
        return points;
    }

    public String getSkill() {
        return skill;
    }

    public String getLevel() {
        return level;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    Player(int id, String skill, String level, int points) {
        this.id = id;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }
}
