package basicJava;

import javax.lang.model.type.ArrayType;
import java.util.Scanner;

public class exceptionHandlingJava  {

    public int divideByZero(int a, int b) {
        try {
            int res = a / b;
            return res;
        } catch (ArithmeticException e) {
            System.out.println("This is Divide 0 Exception");
            return 0;
        }
    }

    public void nullException(){
        try{
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException ne){
            System.out.println("This is Null Pointer Exception");
        }
    }

    public int throwExamples (int a, int b){
        try {
            if ( b == 0 ) {throw new ArithmeticException("BHAI TUNE 0 Divide kiya");}
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("This is Divide 0 Exception" + " : " + e.getMessage());
            return 0;
        }
    }

    public void infinityRunner() throws InterruptedException{
        Thread.sleep(10000);
        System.out.println("MEOW");
    }

    public void finallyExample(){
        try {
            int[] a = new int[6];
            System.out.println(a[7]);
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("ERRORRR! " + " : " + ae.getMessage());
        }
        finally {
            System.out.println("THIS BLOCK GET EXECUTED HEHEHEHE");
        }
    }

    public int excHandling(int num2) throws ArithmeticException{
        int num1 = 10;
        try {
            if(num2 == 0) {throw new ArithmeticException("This is divideByZero Error"+" "+"/ 0");}
            return num1/num2;
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        finally {
            System.out.println("This is default text! 0_0");
        }
        return 0;
    }

    public static void main(String[] args) throws InterruptedException, ArithmeticException {
        exceptionHandlingJava ehj = new exceptionHandlingJava();
        Scanner sc = new Scanner(System.in);

//        int num1= sc.nextInt();
//        int num2 = sc.nextInt();
//        ehj.divideByZero(num1, num2);

//        ehj.nullException();
//        ehj.throwExamples(9,0);
//        ehj.infinityRunner();
//        ehj.finallyExample();
        ehj.excHandling(0);

    }
}
