package IPA.thirtyFiveMarksQuestions;


import java.util.Arrays;
import java.util.Scanner;

class Course{
    private int courseId, quiz, handson;
    private String courseName, courseAdmin;

    Course(int courseId, String courseName, String courseAdmin, int quiz, int handson){
        this.courseId= courseId;
        this.courseName= courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    //Getter
    public int getCourseId(){return courseId;}
    public String getCourseName(){return courseName;}
    public String getCourseAdmin(){return  courseAdmin;}
    public int getQuiz(){return quiz;}
    public int getHandson(){return handson;}

    //Setter
    public void setCourseId(int courseId){this.courseId = courseId;}
    public void setCourseName(String courseName){this.courseName = courseName;}

    public void setCourseAdmin(String courseAdmin){this.courseAdmin = courseAdmin;}

    public void setQuiz(int quiz){this.quiz = quiz;}

    public void setHandson(int handson){this.handson = handson;}

}
class courseProgram{


    public static int findAvgOfQuizByAdmin(Course[] course, String admin){

        int sum = 0, count = 0;

        for (int i = 0; i < course.length ; i++) {
            if(course[i].getCourseAdmin().equalsIgnoreCase(admin)){
                sum+=course[i].getQuiz();
                count++;
            }
        }
        if(count> 0){
            return sum/count;
        }
        else return 0;
    }
    public static Course[] sortCourseByHandsOn(Course[] courses, int handson){
        Course[] courses1 = new Course[0];


        //Filtering
        for (int i = 0; i < courses.length; i++) {
            if(courses[i].getHandson() < handson){
                courses1 = Arrays.copyOf(courses1,courses1.length+1); //Resize the Array
                courses1 [courses1.length -1]= courses[i];
            }
        }

        for (int i = 0; i < courses1.length - 1; i++) {
            for (int j = 0; j < courses1.length -i-1; j++) {
                if(courses1[j].getHandson() > courses1[j+1].getHandson()){
                Course Val = courses1[j];
                courses1[j] = courses1[j+1];
                courses1[j+1] = Val;
                }
            }
        }


        if(courses1.length >0){
            return courses1;
        }
        else return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] courses = new Course[4];

        for (int i = 0; i < courses.length; i++) {
            int courseId= sc.nextInt();sc.nextLine();
            String courseName = sc.nextLine();
            String courseAdmin = sc.nextLine();
            int quiz = sc.nextInt();sc.nextLine();
            int handson = sc.nextInt();sc.nextLine();

            courses[i] = new Course(courseId,courseName,courseAdmin,quiz,handson);
        }
        String inputAdmin = sc.nextLine();
        int inputHandson = sc.nextInt();

        int ansOne = findAvgOfQuizByAdmin(courses,inputAdmin);
        if(ansOne != 0){
            System.out.println(ansOne);
        }
        else System.out.println("No Course found.");

        Course[] ansTwo = sortCourseByHandsOn(courses, inputHandson);
        if(ansTwo != null){
            for (int i = 0; i < ansTwo.length; i++) {
                System.out.println(ansTwo[i].getCourseName());
            }
        }
        else System.out.println("No Course found with mentioned attribute.");

    }
}



public class ipaOne {

}
