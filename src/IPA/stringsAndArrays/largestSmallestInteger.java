package IPA.stringsAndArrays;

import java.util.Scanner;

public class largestSmallestInteger {
    static Scanner sc = new Scanner(System.in);

    static int largestElement(int arr[]){int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
        }}
        return max;
    }
    static int smallestElement(int arr[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arrr = new int[]{1,2,3,4,5,6};
        System.out.println(largestElement(arrr));
        System.out.println(smallestElement(arrr));

    }
}
