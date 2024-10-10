package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

// ticketNo-int

// raisedBy-String

// assignedTo-String

// priority-int

// project-String
class RRT{
    private int ticketNo, priority;
    private String raisedBy, assignedTo, project;


    //Setters

    public void setTicketNo(int ticketNo){this.ticketNo = ticketNo;}
    public void setPriority(int priority){this.priority = priority;}
    public void setRaisedBy(String raisedBy){this.raisedBy = raisedBy;}
    public void setAssignedTo(String assignedTo){this.assignedTo = assignedTo;}
    public void setProject(String project){this.project = project;}


    //Getters


    public int getTicketNo(){return ticketNo;}
    public int getPriority(){return priority;}
    public String getRaisedBy(){return raisedBy;}
    public String getAssignedTo(){return assignedTo;}
    public String getProject(){return project;}

    //Constructor

    RRT(int ticketNo, String raisedBy, String assignedTo, int priority, String project)
    {
        this.ticketNo =ticketNo;
        this.raisedBy =raisedBy;
        this.assignedTo= assignedTo;
        this.priority= priority;
        this.project=project;
    }


}
class MyClass{


    public static RRT getHighestPriorityTicket(RRT[] rrt, String project){

        // highest priority ticket  1 = Highest 5 = Lowest
        //Match the input Project with Exisitng project : EDGE CASEEEEE HEHEHE
        RRT[] rrts = new RRT[0];
        for(int i = 0; i< rrt.length; i++){
            if(rrt[i].getProject().equalsIgnoreCase(project)){
                rrts = Arrays.copyOf(rrts, rrts.length + 1 );
                rrts[rrts.length - 1] = rrt[i];
            }
        }

        RRT max;
        for(int i = 0 ; i <rrts.length - 1 ; i++){
            for(int j = 0; j <rrts.length - i - 1 ; j++){
                if(rrts[j].getPriority() > rrts[j+1].getPriority()){
                    max = rrts[i];
                    rrts[i] = rrts[j];
                    rrts[j] = max;
                }
            }
        }

        if(rrts.length > 0){
            return rrts[0];
        }
        else{
            return null;
        }}


    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);

        RRT[] rrt = new RRT[4];
        for(int i = 0; i<rrt.length; i++)
        {
            int ticketNo = sc.nextInt(); sc.nextLine();
            String raisedBy = sc.nextLine();
            String assignedTo = sc.nextLine();
            int priority = sc.nextInt();sc.nextLine();
            String project = sc.nextLine();
            rrt[i] = new RRT(ticketNo, raisedBy, assignedTo, priority, project);
        }
        String inputProject = sc.nextLine();

        RRT ansOne = getHighestPriorityTicket(rrt, inputProject);
        if(ansOne != null)
        {
            System.out.println(ansOne.getTicketNo() +"\n"+ ansOne.getRaisedBy() + "\n"+ ansOne.getAssignedTo());
        }

        else{
            System.out.println("No such Ticket");
        }
    }

}


