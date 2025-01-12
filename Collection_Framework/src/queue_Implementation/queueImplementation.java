package queue_Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class queueImplementation {

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);que.add(2);que.add(3);
        System.out.print(que+" ");
        System.out.println();
        System.out.println(que.peek());
        System.out.println(que.element());
        que.remove();
        que.poll();
        System.out.println(que);
    }
}
