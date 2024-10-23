package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class basicQuestions {
    static Scanner sc = new Scanner(System.in);


    //Get Array
    static void getArrays(int [] inputArray) {
        //For Loop Iteration
        System.out.println("Using For Loop ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }
    static void getArraysUsingForEach(int [] inputArray){
        System.out.println("Using For Each ");
        for (int indexx: inputArray) {
            System.out.print(indexx + " ") ;}
    }

    //Types of Dimensionals
    // 1. Single Dimensional Arrays
    static void oneDArrays(int players[]){
        for (int i = 0; i < players.length; i++) {
            players[i]=sc.nextInt();
        } //Input
        for (int i = 0; i < players.length; i++) {
            System.out.print(players[i] + " ");
        } //Output
    }
    //2. Two D Arrays
    static void twoDArrays(int twoDArray[][], int row, int col){
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void userDefined2DArray(int twoDArray[][], int row, int col){
        for (int inner = 0; inner < twoDArray.length; inner++) {
            for (int outter = 0; outter < twoDArray[inner].length; outter++) { //This Loop will run untill the row's value
                twoDArray[inner][outter]= sc.nextInt();
            }
        }
        System.out.println("Values are: ");
        for (int inner = 0; inner < twoDArray.length; inner++) {
            for (int outter = 0; outter < twoDArray[inner].length; outter++) {
                System.out.print(twoDArray[inner][outter] + " ");
            }
            System.out.println();
        }}

    //Swap two positions of 1D arrays
    static void swapArray(int[] arr, int index_n, int index_m){
        int temp = arr[index_n];
        arr[index_n] = arr[index_m];
        arr[index_m] = temp;
    }
    //Swap two elements of given position in 2d array
    static void swap2DArrayElement(int[][] arr, int row1, int col1, int row2, int col2){
        int temp = arr[row1][col1];
        arr[row1][col1] = arr[row2][col2];
        arr[row2][col2] = temp;
    }
    //Reverse elements of array using swap meethod
    static void reverse1dArray(int arr[]){
        int start = 0;
        int end = arr.length - 1 ;
        while(start<end) {
            swapArray(arr, start, end);
            start++;
            end--;
        }
    }
    //reverse the rows, reverse the columns, or reverse the entire array,

    //1. Reverse Row elements of 2D array using swap Method
    static void reverse2DArray(int arr[][], int row, int col){
        for (int i = 0; i < row; i++) {
            int start = 0;
            int end = arr.length - 1;
            while(start<end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }



    }


    public static void main(String[] args) {
        int[] number; //Declaration
        number = new int[]{1,2,3,4,5}; //Initialization or Creation

        //Arrays are Mutable: - Changes are possible with respect to values and size
//        System.out.println("Size of the Original Array: "+number.length);
        number = new int[]{1,2,3,4,5,6,7};  //Creating New Array Object which will have same reference to old one
//        System.out.println("After Creating New Object with new Size: "+number.length);

        int index = number[0]; //Accessing Index 0

        int len = number.length; //Storing total length of array


        //-----------------------------------------Methods-------------------------------------//
        // 1. Print Array
        int[] arr = new int[]{1,2,3,4};
//        getArrays(arr);

        //2. Take Input and Print 1D array

        int[] emptyArray = new int[5];
//        oneDArrays(emptyArray);

        //3. Print 2D Array

        int digits[][] = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        twoDArrays(digits, 3,3);

        //4. Take Input and Print 2D Array
        int[][] empty2DArray = new int[4][4];
//        userDefined2DArray(empty2DArray,4,4);


        //5. Swapping 1D array
//        System.out.println(Arrays.toString(arr));
//        swapArray( arr,0,1);
//        System.out.println(Arrays.toString(arr));

        //6. Swapping 2D Array
        int [][] arr2 = new int[4][4];
//        userDefined2DArray(arr2, 4,4);
//        swap2DArrayElement(arr2,0,1,2,1);
//        System.out.println();
//        twoDArrays(arr2,4,4);

        //7. Reverse 1D Array
//        getArraysUsingForEach(arr);
//        reverse1dArray(arr);
//        System.out.println();
//        getArraysUsingForEach(arr);

        //8. Reverse Row/Col of 2D Array
//        userDefined2DArray(arr2, 4,4);
//        reverse2DArray(arr2,4,4);
//        System.out.println();
//        twoDArrays(arr2,4,4);


    }
}