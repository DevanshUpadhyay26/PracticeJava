package queue_Implementation;

import java.util.ArrayDeque;
import java.util.Deque;

public class dque {
    public static void main(String[] args) {
        //Queue with Dequeue

        Deque<Employee> qD = new ArrayDeque<Employee>();
        qD.offer(new Employee(100,"Devansh"));
        qD.offer(new Employee(1000,"Aryan"));
        qD.offer(new Employee(10000,"Shobhan"));
        qD.offer(new Employee(10,"Amrit"));
        qD.offer(new Employee(100000,"Komal"));
        qD.offer(new Employee(1000000,"Pavithra"));

        System.out.println(qD);

        //Stack Implementation
        Deque<Employee> sD = new ArrayDeque<Employee>();
        sD.addFirst(new Employee(100, "Devansh"));
        sD.addFirst(new Employee(1000,"Aryan"));
        sD.addFirst(new Employee(10000,"Shobhan"));
        sD.addFirst(new Employee(10,"Amrit"));
        sD.addFirst(new Employee(100000,"Komal"));
        sD.addFirst(new Employee(1000000,"Pavithra"));

        System.out.println(sD);

    }
}
