package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class largestWordInSentence {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] arraySentence = sentence.split(" ");
        String largest = "";

        for (int i = 0; i < arraySentence.length; i++) {
            if (arraySentence[i].length() > largest.length() ){
                largest = arraySentence[i];
            }
        }

        System.out.println(largest);


    }
}
