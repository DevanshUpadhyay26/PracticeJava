package basicJava;

import java.util.Scanner;

public class conditionalStmtAndLoops {


    public void condtstmt(){
        int num1= 0;
        int num2=1;
        if ( num1 == num2 ){
            System.out.println("Yay Equality");
        }else if(num1 < num2){
            System.out.println("Num 2 is Bigg Dawgs");
        }else {
            System.out.println("This is the end!");
        }}
    public void swtichExample(){
        System.out.println("WELCOME TO CALCULATION! " +
                "PRESS 1 FOR ADDITION" +
                "PRESS 2 FOR SUBSTRACTION" +
                "PRESS 3 FOR MULTIPILICATION" +
                "PRESS 4 FOR DIVISION");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(1+2);
                break;
            case 2:
                System.out.println(1-2);
                break;
            case 3:
                System.out.println(1*2);
                break;
            case 4:
                System.out.println(1/2);
                break;
            default:
                break;
        }
    }

    public void forloops(){
        int[] arr = {1,2,3,4,5,6};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void pattern(){
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void whileLop(){
        int counter = 1;
        while (counter<=5){
            System.out.println("HELLOW" +
                    " " + counter);
            counter++;
     }
    }
    public void doWhile(){
        int counter = 1;
        do {
            System.out.println(counter);
            counter++;
        }while (counter<=5);
    }
    public static void main(String[] args) {

    conditionalStmtAndLoops csl = new conditionalStmtAndLoops();
//    csl.condtstmt();
//    csl.swtichExample();
//    csl.forloops();
//    csl.pattern();
//    csl.whileLop();
    csl.doWhile();



    }


}
