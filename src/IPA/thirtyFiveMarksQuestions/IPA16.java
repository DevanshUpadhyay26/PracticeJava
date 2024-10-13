
package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;

class Student_1 {

    private int rollNo;
    private char grade;
    private String name, subject, day, month, year;

    //gettters
    public int getRollNo(){return rollNo;}
    public String getName(){return name;}
    public String getSubject(){return subject;}
    public char getGrade(){return grade;}
    public String getDay(){return day;}
    public String getMonth(){return month;}
    public String getYear(){return year;}
    //setters
    public void setRollNo(int rollNo){this.rollNo = rollNo;}
    public void setName(String name){this.name = name;}
    public void setSubject(String subject){this.subject = subject;}
    public void setGrade(char grade){this.grade = grade;}
    public void setDay(String day){this.day = day;}
    public void setMonth(String month){this.month = month;}
    public void setYear(String year){this.year = year;}
    //const
    Student_1(int rollNo, String name, String subject, char grade, String day, String month, String year)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.subject=subject;
        this.grade=grade;
        this.day=day;
        this.month=month;
        this.year=year;
    }



}

class Solution16
{

    public static Student_1[] findStudentByGradeAndMonth(Student_1[] s, char gra, int Inputmont)
    {
        int count = 0;
        for(int i = 0; i<s.length; i++)
        {
            int mon = Integer.parseInt(s[i].getMonth());
            if(s[i].getGrade() == gra && mon==Inputmont){
                count++;
            }
        }

        if(count<1){
            return null;
        }


        Student_1[] newS = new Student_1[count];
        int index = 0;

        for(int i =0;i<s.length;i++){
            int mon = Integer.parseInt(s[i].getMonth());
            if(s[i].getGrade()== gra && mon==Inputmont){
                newS[index] = s[i];
                index++;
            }
        }

        return newS;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Student_1[] s = new Student_1[4];
        for(int i = 0; i<s.length; i++)
        {
            int rol =sc.nextInt();sc.nextLine();
            String nam = sc.nextLine();
            String sub = sc.nextLine();
            char gr = sc.nextLine().charAt(0);

            String date = sc.nextLine();
            String da ="";
            String mon="";
            String y="";


            for(int j =0; j<date.length();j++){
                if(j<2){ ///Day = 01,02,03,04..............etc 30 "Contains 2 Digitis"
                    da += date.charAt(j);
                }
                else if(j>=3 && j<5){
                    mon+= date.charAt(j); //Month = /01/  /02/ /03/.............../12/ takes 3 digits after 2 and before 5
                }
                else if (j>5){
                    y+=date.charAt(j);
                }

            }
            s[i] = new Student_1(rol, nam, sub, gr, da,mon,y);
        }

        char inputGrade = sc.nextLine().charAt(0);
        int inputMonth = sc.nextInt();

        Student_1[] outArr = findStudentByGradeAndMonth(s, inputGrade, inputMonth);

        if(outArr != null){
            for(int i = 0; i<outArr.length;i++)
            {
                int len = outArr.length;
                System.out.println(outArr[i].getName() + "\n" + outArr[i].getSubject());
                System.out.println(len);

            }

        }

        else{
            System.out.println("Meow");
        }

        sc.close();

    }
}

/*111
Arijit
Math
B
22/09/2023
101
Priyanka
English
A
30/03/2022
107
Shreosi
History
C
13/05/2022
105
Tatan
Physics
A
27/03/2022
A
3
*/
