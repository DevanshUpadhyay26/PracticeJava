package methodsInJava;

public class twoIntSwapper {
    protected void swapRunner(int a , int b){
        int temp =a;
        a = b;
        b = temp;
        System.out.println(a +"  " + b);
    }
}
