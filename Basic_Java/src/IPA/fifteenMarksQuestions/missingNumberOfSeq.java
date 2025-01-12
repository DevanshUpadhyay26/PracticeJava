package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class missingNumberOfSeq {
    public static void main(String[] args) {
        // Arr = {1,2,3,5,6,7,8,9,11,13,14}
        // return 4,10,12

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        int[] arr= new int[n];

        for(int i = 0;i<arr.length-1;i++)
        {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i= 0;i<arr.length - 1;i++)
        {
            sum+=arr[i];
        }

        int expectedSum = (n * (n+1)) /2;
        int res = expectedSum - sum;

        System.out.println(res);
    }
}
