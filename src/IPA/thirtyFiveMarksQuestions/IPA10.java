package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;



class Player{
    private String skill, level;
    private int playerId, points;


    //getters
    public int getPlayerId(){return playerId;}
    public int getPoints(){return points;}
    public String getSkill(){return skill;}
    public String getLevel(){return level;}

    //settter
    public void setPlayerId(int playerId){this.playerId = playerId;}
    public void setPoints(int points){this.points = points;}
    public void setSkill(String skill){this.skill = skill;}
    public void setLevel(String level){this.level = level;}
    //Const

    Player(int playerId, String skill, String level, int points){
        this.playerId=playerId;
        this.skill=skill;
        this.level=level;
        this.points=points;
    }


}



class Solution10 {



    public static int findPointsForGivenSkill(Player[] players, String skill)
    {
        int sum = 0;
        for(int i =0; i <players.length; i++){
            if(players[i].getSkill().equalsIgnoreCase(skill))
            {
                sum += players[i].getPoints();
            }
        }

        if(sum > 0 ){
            return sum;
        }

        else{
            return 0;
        }


    }

    public static int getPlayerBasedOnLevel(Player[] players, String skill, String level)
    {
        for(int i =0; i<players.length;i++)
        {
            if(players[i].getSkill().equalsIgnoreCase(skill) && players[i].getLevel().equalsIgnoreCase(level))
            {
                return players[i].getPlayerId();
            }

        }
        return 0;
    }
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];

        for(int i = 0; i < players.length; i++)
        {
            int pid = sc.nextInt(); sc.nextLine();
            String s = sc.nextLine();
            String le = sc.nextLine();
            int po  = sc.nextInt(); sc.nextLine();
            players[i] = new Player(pid, s, le, po);
        }
        String inputSkill = sc.nextLine();
        String inputLevel = sc.nextLine();

        int ansOne =  findPointsForGivenSkill(players, inputSkill);
        if(ansOne != 0)
        {
            System.out.println(ansOne);
        }
        else{
            System.out.println("The given Skill is not available.");
        }


        int ansTwo = getPlayerBasedOnLevel(players, inputSkill , inputLevel);
        if(ansTwo != 0){
            System.out.println(ansTwo);
        }
        else{
            System.out.println("No player is available with specified level, skill and eligibility points.");
        }

    }
}

//101
//        Cricket
//        Basic
//        20
//        102
//        Cricket
//        Intermediate
//        25
//        111
//        Football
//        Intermediate
//        50
//        113
//        BaseBall
//        Advanced
//        100
//        Cricket
//        Intermediate