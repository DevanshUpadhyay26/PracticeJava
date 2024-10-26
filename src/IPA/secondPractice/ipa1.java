package IPA.secondPractice;

import java.util.Scanner;

class Codechef1
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        Course[] co = new Course[4];
        for(int i =0; i<co.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String admin = sc.nextLine();
            int quiz = sc.nextInt();sc.nextLine();
            int handson = sc.nextInt();sc.nextLine();
            co[i] = new Course(id, name, admin, quiz, handson);
        }
        String inputAdmin = sc.nextLine();
        int inputHandson = sc.nextInt();

        int ansOne = findAvgOfQuizByAdmin(co, inputAdmin);
        if(ansOne != 0)
        {
            System.out.println(ansOne);
        }
        else{System.out.println("Meow");}

        Course[] ansTwo  =  sortCourseByHandsOn(co, inputHandson);
        if(ansTwo !=null)
        {
            for(int i = 0; i<ansTwo.length;i++)
            {
                System.out.println(ansTwo[i].getName());
            }
        }
        else{
            System.out.println("Meow");
        }

    }


    public static int findAvgOfQuizByAdmin(Course[] co, String admin)
    {
        int count = 0;
        int sum =0;
        for(int i =0; i<co.length;i++)
        {
            if(co[i].getAdmin().equalsIgnoreCase(admin))
            {
                count++;
                sum+=co[i].getQuiz();
            }
        }
        if(count<1){return 0;}
        return sum/count;
    }

    public static Course[] sortCourseByHandsOn(Course[] co, int handson)
    {
        //Less than handson
        //Ascending
        int count =0;
        for(int i =0; i<co.length;i++)
        {
            if(co[i].getHandson() < handson)
            {
                count++;
            }
        }

        if(count<1){return null;}
        int index = 0;
        Course[] coS = new Course[count];
        for(int i=0; i<co.length;i++)
        {
            if(co[i].getHandson() < handson)
            {
                coS[index] = co[i];
                index++;
            }
        }

        for(int i=0;i<coS.length -1;i++)
        {
            for(int j=0; j<coS.length - i -1;j++)
            {
                if(coS[j].getHandson() > coS[j+1].getHandson())
                {
                    Course temp = coS[j];
                    coS[j] = coS[j+1];
                    coS[j+1] = temp;
                }
            }
        }
        return coS;
    }
}

class Course{
    private int id, quiz, handson;
    private String name, admin;

    public int getId(){return id;}
    public int getQuiz(){return quiz;}
    public int getHandson(){return handson;}
    public String getName(){return name;}
    public String getAdmin(){return admin;}

    public void setId(int id){this.id= id;}
    public void setQuiz(int quiz){this.quiz = quiz;}
    public void setHandson(int handson){this.handson = handson;}
    public void setName(String name){this.name = name;}
    public void setAdmin(String admin){this.admin = admin;}

    Course(int id, String name, String admin, int quiz, int handson)
    {
        this.id= id;
        this.name = name;
        this.admin = admin;
        this.quiz = quiz;
        this.handson = handson;
    }


}
