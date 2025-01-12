package IPA.secondPractice;
import java.util.*;
import java.lang.*;

class Codechef3
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);

        Student[] stud = new Student[4];
        for(int i = 0; i<stud.length;i++)
        {
            int roll = sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String branch=sc.nextLine();
            double score= sc.nextDouble();sc.nextLine();
            boolean dayS= sc.nextBoolean();
            stud[i] = new Student(roll, name, branch, score, dayS);
        }
        int ansOne = findCountOfDayscholarStudents(stud);
        if(ansOne != 0)
        {
            System.out.println(ansOne);
        }
        else{System.out.println("Meow");}

        Student[] ansTwo = findStudentwithSecondHighestScore(stud);
        if(ansTwo != null)
        {
            System.out.println(ansTwo[1].getRollNo()+"#"+ansTwo[1].getName()+"#"+ansTwo[1].getScore());
        }
        else{System.out.println("Meow");}


        sc.close();

    }


    public static int findCountOfDayscholarStudents(Student[] stud)
    {
        //score >80 and dayS = true
        int count = 0;
        for(int i = 0;i<stud.length; i++)
        {
            if(stud[i].getScore() > 80 && stud[i].getDayScholar() == true)
            {
                count++;
            }
        }
        if(count<1){return 0;}
        return count;
    }

    public static Student[] findStudentwithSecondHighestScore(Student[] stud)
    {
        //sort desc on score, dayScol == false

        int count = 0;
        for(int i =0 ; i<stud.length;i++)
        {
            if(stud[i].getDayScholar() == false)
            {
                count++;
            }
        }
        if(count<1){return null;}
        int index =0;
        Student[] studS = new Student[count];
        for(int i =0; i<stud.length;i++)
        {
            if(stud[i].getDayScholar() == false)
            {
                studS[index] = stud[i];
                index++;
            }
        }
        for(int i=0;i<studS.length - 1;i++)
        {
            for(int j =0; j<studS.length - i -1; j++)
            {
                if(studS[j].getScore() < studS[j+1].getScore())
                {
                    Student temp = studS[j];
                    studS[j] = studS[j+1];
                    studS[j+1] = temp;
                }
            }
        }
        return studS;
    }
}

class Student{

    private int roll;
    private String name, branch;
    private double score;
    private boolean dayS;


    public int getRollNo(){return roll;}
    public String getName(){return name;}
    public String getBranch(){return branch;}
    public double getScore(){return score;}
    public boolean getDayScholar(){return dayS;}

    public void setRollNo(int roll){this.roll = roll;}
    public void setName(String name){this.name= name;}
    public void setBranch(String branch){this.branch = branch;}
    public void setScore(double score){this.score= score;}
    public void setDayScholar(boolean dayS){this.dayS= dayS;}

    Student(int roll, String name, String branch, double score, boolean dayS)
    {
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayS = dayS;
    }

}
