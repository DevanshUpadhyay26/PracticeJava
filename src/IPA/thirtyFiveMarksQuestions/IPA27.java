package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodechefMEE
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Team[] te = new Team[n];
        for(int i = 0; i<te.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String country = sc.nextLine();
            int run = sc.nextInt();sc.nextLine();
            te[i] = new Team(id, name, country, run);
        }
        int inputRun= sc.nextInt();sc.nextLine();
        String inputCountry = sc.nextLine();

        Team[] ansOne = findPlayer(te, inputCountry, inputRun);
        if(ansOne != null)
        {
            for(int i = 0; i<ansOne.length;i++){
                System.out.println(ansOne[i].getId() + "\n" + ansOne[i].getName() + "\n" + ansOne[i].getCountry() + "\n" + ansOne[i].getRun());
            }
        }
        else{
            System.out.println("Meow");
        }

    }

    public static Team[] findPlayer(Team[] te, String country, int run)
    {
        int count =0;
        for(int i = 0; i<te.length;i++)
        {
            if(te[i].getCountry().equalsIgnoreCase(country) && te[i].getRun() > run)
            {count++;}
        }
        if(count<1){return null;}

        int index=0;
        Team[] sortedTeam = new Team[count];

        for(int i = 0; i<te.length;i++){
            if(te[i].getCountry().equalsIgnoreCase(country) && te[i].getRun()>run)
            {
                sortedTeam[index] = te[i];
                index++;
            }
        }
        return sortedTeam;
    }
}


class Team{
    private int id, run;
    private String name, country;

    //getters
    public int getId(){return id;}
    public int getRun(){return run;}
    public String getName(){return name;}
    public String getCountry(){return country;}

    //Setters

    public void setId(int id){this.id=id;}
    public void setRun(int run){this.run = run;}
    public void setName(String name){this.name = name;}
    public void setCountry(String country){this.country = country;}

    //Const
    Team(int id, String name, String country, int run)
    {
        this.id=id;
        this.name=name;
        this.country=country;
        this.run= run;
    }


}

/*3
1
Arijit
India
43
2
Doremon
China
40
3
Donal
England
32
35
China*/