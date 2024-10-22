package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodechefMeoww
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Course3[] co = new Course3[4];
        for(int i = 0; i<co.length; i++)
        {
            String name = sc.nextLine();
            int no = sc.nextInt();sc.nextLine();
            String mode = sc.nextLine();
            boolean data = sc.nextBoolean();sc.nextLine();
            co[i] = new Course3(name, no, mode, data);
        }
        String inputCourse = sc.nextLine();

        Course3[] ansOne = findCourseStatus(co, inputCourse);
        if(ansOne != null)
        {
            for(int i =0 ; i<ansOne.length;i++)
            {

                if(ansOne[i].getCNo() >= 1000){System.out.println("High");}
                else if (ansOne[i].getCNo() >=500 && ansOne[i].getCNo() < 1000) {System.out.println("Medium");}
                else {System.out.println("Low");}
            }
        }
        else{System.out.println("MMMEOWW");}
        sc.close();

    }

    public static Course3[] findCourseStatus(Course3[] co, String course)
    {
        //course === getcourseName

        int count = 0;
        for(int i = 0; i<co.length ; i++)
        {
            if(co[i].getCName().equalsIgnoreCase(course))
            {
                count++;
            }
        }

        if(count<1){return null;}

        int index = 0;
        Course3[] sortedC = new Course3[count];
        for(int i =0 ;i<co.length;i++)
        {
            if(co[i].getCName().equalsIgnoreCase(course))
            {
                sortedC[index] = co[i];
                index++;
            }
        }

        return sortedC;

    }
}


class Course3{
    private int cNo;
    private String cName, mode;
    private boolean data;

    public int getCNo(){return cNo;}
    public String getCName(){return cName;}
    public String getMode(){return mode;}
    public boolean getData(){return data;}

    public void setCNo(int cNo){this.cNo = cNo;}
    public void setCName(String cName){this.cName = cName;}
    public void setMode(String CName){this.mode  =mode;}
    public void setData(boolean data){this.data = data;}

    Course3(String cName, int cNo, String mode, boolean data)
    {
        this.cName = cName;
        this.cNo = cNo;
        this.mode = mode;
        this.data =data;
    }



}

/*Java
1200
Online
False
Python
600
Offline
False
HTML
800
Offline
False
JavaScript
300
Online
True
Python*/