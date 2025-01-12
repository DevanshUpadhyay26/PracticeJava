package IPA.secondPractice;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc  = new Scanner(System.in);
        RRT[] rrt = new RRT[4];
        for(int i = 0; i<rrt.length; i++)
        {
            int num = sc.nextInt();sc.nextLine();
            String by = sc.nextLine();
            String to = sc.nextLine();
            int priority = sc.nextInt();sc.nextLine();
            String project = sc.nextLine();
            rrt[i] = new RRT(num, by, to, priority, project);
        }
        String inputProject = sc.nextLine();
        RRT[] ansOne = getHighestPriorityTicket(rrt, inputProject);
        if(ansOne != null)
        {
            System.out.println(ansOne[0].getTicketNum() + "\n" + ansOne[0].getRaisedBy() + "\n" + ansOne[0].getAssignedTo());
        }else{System.out.println("Meow");}
        sc.close();


    }
    public static RRT[] getHighestPriorityTicket(RRT[] rrt, String project)
    {
        //sort asce priority
        int count = 0;
        for(int i =0 ; i<rrt.length; i++)
        {
            if(rrt[i].getProject().equalsIgnoreCase(project)){count++;}
        }
        if(count<1){return null;}
        int index = 0;
        RRT[] rrtS = new RRT[count];
        for(int i =0 ; i<rrt.length; i++)
        {
            if(rrt[i].getProject().equalsIgnoreCase(project))
            {rrtS[index] = rrt[i]; index++;}
        }
        for(int i = 0; i<rrtS.length - 1; i++)
        {
            for(int j=0; j<rrtS.length - i- 1; j++)
            {
                if(rrtS[j].getPriority() > rrtS[j+1].getPriority())
                {
                    RRT temp = rrtS[j];
                    rrtS[j] = rrtS[j+1];
                    rrtS[j+1] = temp;
                }
            }
        }
        return rrtS;


    }
}

class RRT{
    private int num, priority;
    private String by, to, project;

    public int getTicketNum(){return num;}
    public int getPriority(){return priority;}
    public String getRaisedBy(){return by;}
    public String getAssignedTo(){return to;}
    public String getProject(){return project;}

    public void setTicketNum(int num){this.num = num;}
    public void setPriority(int priority){this.priority = priority;}
    public void setRaisedBy(String by){this.by = by;}
    public void setAssignedTo(String to){this.to = to;}
    public void setProject(String project){this.project = project;}


    RRT(int num, String by, String to, int priority, String project)
    {
        this.num = num;
        this.by = by;
        this.to = to;
        this.priority = priority;
        this.project = project;
    }
}
