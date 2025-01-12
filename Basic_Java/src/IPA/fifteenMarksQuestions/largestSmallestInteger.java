package IPA.fifteenMarksQuestions;

import java.util.*;
import java.lang.*;
import java.io.*;

class largestSmallestInteger
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        int[] arr = new int[n];
        for(int i =0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int arrr: arr){System.out.println(arrr);}
        System.out.println("Min:  "+ minVal(arr));
        System.out.println("Max:  "+ maxVal(arr));
    }

    public static int minVal(int arr[])
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxVal(int arr[])
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i] > max){max = arr[i];}
        }
        return max;
    }
}
