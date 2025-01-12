package queue_Implementation;

import java.util.*;

public class priorityQueue {

    public static void main(String[] args) {
//        PQ_Basic pqBasic = new PQ_Basic();
//        pqBasic.pq();

        helperComparator hc = new helperComparator();
        PriorityQueue<Employee> pq = new PriorityQueue<Employee>(hc);
        pq.offer(new Employee(100,"Devansh"));
        pq.offer(new Employee(1000,"Aryan"));
        pq.offer(new Employee(10000,"Shobhan"));
        pq.offer(new Employee(10,"Amrit"));
        pq.offer(new Employee(100000,"Komal"));
        pq.offer(new Employee(1000000,"Pavithra"));

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}

class Employee{
    int sal; String name;
    Employee(int sal, String name){this.sal = sal; this.name= name;}
    @Override
    public String toString(){
        return "Salary: " + sal + ": Name: " + name;
    }
}
class helperComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.sal - e2.sal;
    }
}

class PQ_Basic{
    public void pq(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);pq.offer(5);pq.offer(2);pq.offer(4);pq.offer(3);
        List<Integer> lis = new ArrayList<>();
        int indx = 0;
        while(!pq.isEmpty())
        {
            if(indx==2)
                break;
            lis.add(pq.poll());
            indx++;
        }
        System.out.println("Array= "+lis);
        System.out.println("Queue = "+pq);


        }
    }
