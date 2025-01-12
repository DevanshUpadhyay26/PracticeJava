package patternQuestions;

public class ptq {

/*
******
*    *
*    *
*    *
*    *
******
 */
    public static void hollowPrint(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i == 0 || j == 0 || i == n-1 || j == n-1) {System.out.print("*");}
                else {System.out.print(" ");}
            }
            System.out.println();
        }
    }

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
* */
    public static void pyramidPatternNumber(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

//    *
//    **
//    ***
//    ****
//    *****
//    ******

    public static void pyramicPtStars(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


//            1 2 3 4 5 6
//            1 2 3 4 5
//            1 2 3 4
//            1 2 3
//            1 2
//            1


    public  static void reversePyramidNumber(int n){
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

//******
//*****
//****
//***
//**
//*



    public static void reversePyraimidStars(int n){
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
//16 17 18 19 20 21

    public static void incrementingPyramidNumber(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
//        0 1 0 1 0 1
    public static void binarPyramid(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                if( (i+j) % 2 == 0 ) System.out.print(1 + " ");
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

//        hollowPrint(6);
//        pyramidPatternNumber(6);
//        pyramicPtStars(6);
//        reversePyramidNumber(6);
//        reversePyraimidStars(6);
//        incrementingPyramidNumber(6);
//        binarPyramid(6);








    }

}
