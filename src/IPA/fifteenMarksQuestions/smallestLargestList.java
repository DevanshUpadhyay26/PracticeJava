package IPA.fifteenMarksQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class smallestLargestList {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Integers: ");
        int n = sc.nextInt();sc.nextLine();
        int[] arr = new int[n];
        for(int i =0; i<arr.length;i++)
        {
            System.out.println("Enter the Digits for" + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + "is the smallest");
        System.out.println(arr[arr.length - 1] + "is the Largest");
    }
}
