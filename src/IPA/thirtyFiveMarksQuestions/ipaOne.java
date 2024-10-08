package IPA.thirtyFiveMarksQuestions;

import java.util.Arrays;
import java.util.Scanner;

class Course{
    private int courseId;
    private String coureseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    Course(int courseId, String coureseName, String courseAdmin, int quiz, int handson){
        this.courseId = courseId;
        this.coureseName = coureseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCourseId(){return  courseId;}
    public void setCourseId(){}
    public String getCoureseName(){return coureseName;}
    public void setCoureseName(){}
    public String getCourseAdmin(){return courseAdmin;}
    public void setCourseAdmin(){}
    public int getQuiz(){return quiz;}
    public void setQuiz(){}
    public int getHandson(){return handson;}

}

class courseProgram{
    private static int findAvgOfQuizByAdmin(Course[] courses, String adn){

        int sum = 0;
        int count = 0;

        //Edge Case: Check if that admin belongs to that input array of objects
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getCourseAdmin().equalsIgnoreCase(adn)){
                sum +=courses[i].getQuiz();
                count++;
            }
        }
        if(count>0){
            int avg=sum/count;
            return avg;
        }
        else{
                return 0;
        }
}
//    public static Course sortCourseByHandsOn(Course[] courses, int hand){
//        Course[] courses1 = new Course[0];
//
//        for (int i = 0; i < courses.length; i++) {
//                if(courses[i].getHandson() < hand){
//                    courses1 = Arrays.copyOf(courses1, courses1.length+1);
//                    courses1[courses1.length -1] = courses[i];
//                }
//        }
//        Course Val;
//
//
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] courses = new Course[4];

        for (int i = 0; i < courses.length; i++) {
            int cour_id = sc.nextInt();sc.nextLine();
            String course_name = sc.nextLine();
            String course_admin = sc.nextLine();
            int quiz = sc.nextInt();sc.nextLine();
            int handson = sc.nextInt();sc.nextLine();

            courses[i] = new Course(cour_id,course_name,course_admin,quiz,handson);
        }

        String input_admin = sc.nextLine();
        int input_handson = sc.nextInt();

        int ans = findAvgOfQuizByAdmin(courses,input_admin);
        System.out.println(ans);




    }



}



public class ipaOne {

}
