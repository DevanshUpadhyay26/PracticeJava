package listImplementations;
import java.util.*;
public class stackImplementation {
    public static void main(String[] args) {
        // Stack Implementation
        Stack<Integer> sL = new Stack<>();
        for (int i = 1; i < 10; i++) {sL.push(i);}
        System.out.println("Stack = "+sL);
        System.out.println("Top Most element: "+sL.peek());
        System.out.println("Removing the top most element: "+sL.pop());
        System.out.println("5 ka indx kidar hai? " + sL.search(5));
        // ArrDeque Implementation
        ArrayDeque<Integer> sLA = new ArrayDeque<>();
        for (int i = 10; i <= 20; i++) {
            sLA.offer(i);
        }
        System.out.println("Stack with ArrDeque: "+sLA);
        System.out.println(sLA.element());
        System.out.println(sLA.poll());
        System.out.println(sLA);

        // LL Implementation
    }
}
