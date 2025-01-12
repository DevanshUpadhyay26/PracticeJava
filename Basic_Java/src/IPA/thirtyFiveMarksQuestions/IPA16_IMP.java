package IPA.thirtyFiveMarksQuestions;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechefsixteen
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Student2[] stud = new Student2[4];
        for(int i =0 ;i<stud.length;i++)
        {
            int rollno = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String subject = sc.nextLine();
            char grade = sc.nextLine().charAt(0);
            String date = sc.nextLine();
            stud[i] = new Student2(rollno, name, subject, grade, date);
        }
        char inputGrade = sc.nextLine().charAt(0);
        int inputMonth = sc.nextInt();

        Student2[] ansTwo = findStudentsByGradeAndMonth(stud, inputGrade, inputMonth);
        if(ansTwo != null)
        {
            int count= 0;
            for(int i =0 ; i<ansTwo.length; i++)
            {
                count++;
                System.out.println(ansTwo[i].getName() + "\n" + ansTwo[i].getSubject());
            }
            System.out.println(count);
        }
        else{System.out.println("Meow");}

        sc.close();
    }

    public static Student2[] findStudentsByGradeAndMonth(Student2[] stud, char grade, int month)
    {
        int count = 0;
        for(int i =0 ;i<stud.length;i++)
        {
            int extractMonth = Integer.parseInt(stud[i].getDate().substring(3,5));
            if(stud[i].getGrade() == grade && extractMonth == month)
            {
                count++;
            }
        }

        if(count<1){return null;}
        int index = 0;
        Student2[] studS = new Student2[count];
        for(int i =0 ;i<stud.length;i++)
        {
            int extractMonth = Integer.parseInt(stud[i].getDate().substring(3,5));
            if(stud[i].getGrade() == grade && extractMonth == month)
            {
                studS[index] = stud[i];
                index++;
            }
        }
        for(int i= 0; i<studS.length - 1; i++)
        {
            for(int j = 0; j<studS.length - i -1; j++)
            {
                if(studS[j].getRollNo() > studS[j+1].getRollNo())
                {
                    Student2 temp = studS[j];
                    studS[j] = studS[j+1];
                    studS[j+1] = temp;
                }
            }
        }
        return studS;
    }

}
class Student2{

    private int rollno;
    private String name, subject, date;
    private char grade;

    public int getRollNo(){return rollno;}
    public String getName(){return name;}
    public String getSubject(){return subject;}
    public String getDate(){return date;}
    public char getGrade(){return grade;}

    Student2(int rollno, String name, String subject, char grade, String date)
    {
        this.rollno = rollno;
        this.name=name;
        this.subject=subject;
        this.grade = grade;
        this.date = date;
    }
}