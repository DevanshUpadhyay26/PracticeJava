package listImplementations;


import java.util.LinkedList;
import java.util.List;

class Node{
    Node prevNode;
    int value;
    Node nextNode;
    public Node(Node prevNode, int value, Node nextNode)
    {
        this.prevNode = prevNode;
        this.value = value;
        this.nextNode = nextNode;

    }
}

class DoublyLinkedList{
    Node head;
    Node tail;

    public DoublyLinkedList()
    {
        this.head = null;
        this.tail = null;
    }


    //Methods for Insertion, Retrival, Removal

    //Insertion

    public void insertHead(int data){
        Node newNode = new Node(null, data,head);
        //Checkers
        if(head != null){head.prevNode = newNode;} //Stating that this is first node
        else{tail = newNode;} // Stating that this is last node
        head = newNode;
    }
    public void insertTail(int data){
        Node newNode = new Node(tail, data, null);
        //Checkers

        if(tail!=null){
            tail.nextNode = newNode;
        }
        else{head = newNode;}

    }
    public void printForwardDLL(){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.nextNode;
        }
        System.out.println("null");
    }
}




public class LinkedList_DoublyImplementation {

    public static void main(String[] args) {
        DoublyLinkedList LL = new DoublyLinkedList();
        LL.insertHead(1);
        LL.insertHead(2);
        LL.insertTail(10);
        LL.printForwardDLL();

    }
}
