package IPA.stringsAndArrays;

import java.util.Scanner;

public class missingNumberOfSeq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int arr[] = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int num;
        for (int i = 0; i < arr.length-1; i++) {
            num = arr[i];
            while (num+1 != arr[i+1]){
                System.out.print(num + 1 + " ");
                num++;
        }
    }
}}
