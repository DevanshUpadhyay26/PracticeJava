package IPA.thirtyFiveMarksQuestions;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef2
{
    public static Associate[] associatesForGivenTechnology(Associate[] asc , String tech){
        int count = 0;
        for(int i = 0; i<asc.length; i++)
        {
            if(asc[i].getTech().equalsIgnoreCase(tech))
            {
                count++;
            }
        }
        if(count<1)
        {
            return null;
        }

        Associate[] sortedAsc = new Associate[count];
        int index = 0;
        for(int i = 0; i<asc.length;i++)
        {
            if(asc[i].getTech().equalsIgnoreCase(tech))
            {
                sortedAsc[index] = asc[i];
                index++;
            }
        }
        return sortedAsc;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Associate[] asc = new Associate[5];
        for(int i = 0; i<asc.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String tech=sc.nextLine();
            int yoe=sc.nextInt();sc.nextLine();
            asc[i]= new Associate(id,name,tech,yoe);
        }
        String inputTech = sc.nextLine();

        Associate[] ansOne = associatesForGivenTechnology(asc, inputTech);
        if(ansOne != null)
        {
            for(int i = 0; i<ansOne.length;i++)
            { if(ansOne[i].getYoe() % 5 ==0){System.out.println(ansOne[i].getId());} }
        }
        else{System.out.println("Meow");}
    }
}


class Associate{
    private int id, yoe;
    private String name, tech;

    //Getterss

    public int getId(){return id;}
    public int getYoe(){return yoe;}
    public String getName(){return name;}
    public String getTech(){return tech;}
    //Setterss
    public void setId(int id){this.id=id;}
    public void setYoe(int yoe){this.yoe=yoe;}
    public void setName(String name){this.name=name;}
    public void setTech(String tech){this.tech=tech;}
    //Consts
    Associate(int id, String name, String tech, int yoe){
        this.id=id;
        this.name=name;
        this.tech=tech;
        this.yoe=yoe;

    }
}

/*101
Alex
Java
15
102
Albert
Unix
20
103
Alferd
Testing
13
104
Alfa
Java
15
105
Almas
Java
29
Java*/