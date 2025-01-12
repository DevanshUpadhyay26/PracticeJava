package listImplementations;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Doubly {
    public static void main(String[] args) {
        LinkedList<String> LinkedL = new LinkedList<>();
        //Insertion

        //ADD:-addFirst(),add(),addLast()
        LinkedL.addFirst("SDE");
        LinkedL.add("ML");
        LinkedL.addLast("IOT");
        LinkedL.addLast("ARVR");
        LinkedL.addLast("BDE");
        LinkedL.addLast("Sales");
        //Offer:- offerFirst(), offer(), offerLast()
        LinkedL.offerFirst("Intern");
        LinkedL.offer("Manager");
        LinkedL.offerLast("Director");

        System.out.print("Linked List = "+ LinkedL);
        System.out.println();
        //Retrieval:

        //get:getFirst(), get(index), getLast()
        System.out.println("First Element: "+LinkedL.getFirst());
        System.out.println("Second Element: "+LinkedL.get(1));
        System.out.println("Last Element: " + LinkedL.getLast());

        //peek: peekFirst(), peek(), peekLast()
        System.out.println("First Element: "+LinkedL.peekFirst());
        System.out.println("Head/First Element: "+LinkedL.peek());
        System.out.println("Last Element: "+LinkedL.peekLast());

        //Remove

        //remove:-
        LinkedL.removeFirst();
        System.out.println("After Head removal: "+ LinkedL);
        LinkedL.remove(4);
        System.out.println("Removed 4th: "+LinkedL);
        LinkedL.removeLast();
        System.out.println("Removed Last: "+ LinkedL);

        //poll
        LinkedL.pollFirst();
        System.out.println("Removing Head: "+LinkedL);
        LinkedL.poll();
        System.out.println("Removing Head with poll(): "+LinkedL);
        LinkedL.pollLast();
        System.out.println("Removing Tail: "+LinkedL);

    }
}
