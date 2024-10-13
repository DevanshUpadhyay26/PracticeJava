//package IPA.thirtyFiveMarksQuestions;
//import java.util.*;
//import java.lang.*;
//
//class Student {
//    private int rollNo;
//    private String name, branch;
//    private Double score;
//    private boolean dayScholar;
//
//    Student(int rollNo, String name, String branch, Double score, boolean dayScholar) {
//        this.rollNo = rollNo;
//        this.name = name;
//        this.branch = branch;
//        this.score = score;
//        this.dayScholar = dayScholar;
//    }
//
//    // Getter
//    public int getRollNo() { return rollNo; }
//    public String getName() { return name; }
//    public String getBranch() { return branch; }
//    public Double getScore() { return score; }
//    public boolean getDayScholar() { return dayScholar; }
//
//    // Setter
//    public void setRollNo(int rollNo) { this.rollNo = rollNo; }
//    public void setName(String name) { this.name = name; }
//    public void setBranch(String branch) { this.branch = branch; }
//    public void setScore(Double score) { this.score = score; }
//    public void setDayScholar(boolean dayScholar) { this.dayScholar = dayScholar; }
//}
//
//class Solution {
//
//    public static int findCountOfDayscholarStudents(Student[] student1s) {
//        int count = 0;
//
//        for (int i = 0; i < student1s.length; i++) {
//            if (student1s[i].getDayScholar() == true && student1s[i].getScore() > 80) {
//                count++;
//            }
//        }
//
//        if (count > 0) {
//            return count;
//        } else {
//            return 0;
//        }
//    }
//
//    public static Student_1 findStudentwithSecondHighestScore(Student[] student1s) {
//        // Fixing the array declaration bug
//        // Original Error: Used an incorrect array type for storing scores (Double[] instead of double[])
//        // Fix: Use a primitive double[] to store scores of non-day-scholars
//        double[] scores = new double[0];
//
//        // Collect scores of students who are NOT day scholars
//        for (int i = 0; i < student1s.length; i++) {
//            if (!student1s[i].getDayScholar()) {
//                // Fixing array resizing bug
//                // Original Error: The array size was increased based on students.length + 1, which was wrong.
//                // Fix: Use correct array resizing by adding one element at a time
//                scores = Arrays.copyOf(scores, scores.length + 1);
//                scores[scores.length - 1] = student1s[i].getScore();
//            }
//        }
//
//        if (scores.length < 2) {
//            // Fixing premature null return issue
//            // Original Error: If there are fewer than 2 non-day scholars, it should return null immediately.
//            // Fix: Added condition to handle this case.
//            return null;
//        }
//
//        // Sort the scores to find the second-highest
//        Arrays.sort(scores);
//
//        // Fixing score retrieval bug
//        // Original Error: Used `students1[students1.length - 2]` which refers to the wrong array.
//        // Fix: Use `scores[scores.length - 2]` to correctly get the second-highest score.
//        double secondHighestScore = scores[scores.length - 2];
//
//        // Find the student with the second-highest score
//        for (int i = 0; i < student1s.length; i++) {
//            if (student1s[i].getScore() == secondHighestScore && !student1s[i].getDayScholar()) {
//                return student1s[i];
//            }
//        }
//
//        // Fixing premature return bug
//        // Original Error: In the original code, `else return null` was placed inside the loop, causing premature return.
//        // Fix: Return null only after the loop completes without finding the student.
//        return null;
//    }
//
//    public static void main(String[] args) throws java.lang.Exception {
//        Scanner sc = new Scanner(System.in);
//
//        Student_1[] student1s = new Student_1[4];
//        for (int i = 0; i < student1s.length; i++) {
//            int rollNo = sc.nextInt();
//            sc.nextLine();
//            String name = sc.nextLine();
//            String branch = sc.nextLine();
//            Double score = sc.nextDouble();
//            sc.nextLine();
//            boolean dayScholar = sc.nextBoolean();
//            student[i] = new Student_1(rollNo, name, branch, score, dayScholar);
//        }
//
//        int count = findCountOfDayscholarStudents(student);
//        if (count > 0) {
//            System.out.println(count);
//        } else {
//            System.out.println("There are no such dayscholar students.");
//        }
//
//        Student_1 secondHighest = findStudentwithSecondHighestScore(student1s);
//
//        if (secondHighest != null) {
//            System.out.println(secondHighest.getRollNo() + "#" + secondHighest.getName() + "#" + secondHighest.getScore());
//        } else {
//            System.out.println("There are no students from non day scholar");
//        }
//
//        sc.close();
//    }
//}
//
///*
//Input:
//
//1001
//Ashwa
//IT
//85
//true
//1002
//Preeti
//IT
//70
//false
//1003
//Uma
//ECE
//85
//false
//1004
//Akash
//EEE
//90
//true
//
//
//Output:
//2
//1002#Preeti#70.0
//* */