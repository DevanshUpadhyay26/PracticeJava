////package listImplementations;
////
////
////class Node{
////   final int data;
////   Node next;
////    public Node(int data, Node next)
////    {
////        this.data = data;
////        this.next = next;
////    }
////}
////
////class LL{
////   Node head;
////
////    public LL(int head){this.head = null;}
////
////    public void insert_at_begin(int data){
////        Node newNode = new Node(data,head);
////        head = newNode;
////    }
////    public void insert_at_end(int data){
////        if (head==null){head = new Node(data, null);return;}
////        Node itr = head;
////        while (itr.next!=null){itr = itr.next;}
////        itr.next = new Node(data, null);
////
////    }
////    public void insert_datalist(int[] arr){
////        arr = null;
////        for(int data : arr){insert_at_end((data));}
////    }
////
////
//////
////}
////public class LinkedList_Single {
////
////    public static void main(String[] args) {
////
//////    }
////}
//
//class Node {
//    Node prevNode;
//    int value;
//    Node nextNode;
//
//    public Node(Node prevNode, int value, Node nextNode) {
//        this.prevNode = prevNode;
//        this.value = value;
//        this.nextNode = nextNode;
//    }
//}
//
//class DoublyLinkedList {
//    private Node head;
//    private Node tail;
//
//    public DoublyLinkedList() {
//        this.head = null;
//        this.tail = null;
//    }
//
//    // Method to insert a node at the head
//    public void insertHead(int data) {
//        Node newNode = new Node(null, data, head);
//        if (head != null) {
//            head.prevNode = newNode;
//        } else {
//            // If the list is empty, set tail as well
//            tail = newNode;
//        }
//        head = newNode;
//    }
//
//    // Method to insert a node at the tail
//    public void insertTail(int data) {
//        Node newNode = new Node(tail, data, null);
//        if (tail != null) {
//            tail.nextNode = newNode;
//        } else {
//            // If the list is empty, set head as well
//            head = newNode;
//        }
//        tail = newNode;
//    }
//
//    // Method to remove a node from the head
//    public void removeHead() {
//        if (head == null) {
//            System.out.println("List is empty.");
//            return;
//        }
//        head = head.nextNode;
//        if (head != null) {
//            head.prevNode = null;
//        } else {
//            // If the list becomes empty, set tail to null
//            tail = null;
//        }
//    }
//
//    // Method to remove a node from the tail
//    public void removeTail() {
//        if (tail == null) {
//            System.out.println("List is empty.");
//            return;
//        }
//        tail = tail.prevNode;
//        if (tail != null) {
//            tail.nextNode = null;
//        } else {
//            // If the list becomes empty, set head to null
//            head = null;
//        }
//    }
//
//    // Method to traverse forward
//    public void traverseForward() {
//        if (head == null) {
//            System.out.println("List is empty.");
//            return;
//        }
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.value + " ");
//            current = current.nextNode;
//        }
//        System.out.println();
//    }
//
//    // Method to traverse backward
//    public void traverseBackward() {
//        if (tail == null) {
//            System.out.println("List is empty.");
//            return;
//        }
//        Node current = tail;
//        while (current != null) {
//            System.out.print(current.value + " ");
//            current = current.prevNode;
//        }
//        System.out.println();
//    }
//}
//
//public class LinkedList_DoublyImplementation {
//    public static void main(String[] args) {
//        DoublyLinkedList dll = new DoublyLinkedList();
//
//        // Inserting elements at the head
//        dll.insertHead(10);
//        dll.insertHead(20);
//        dll.insertHead(30);
//
//        // Traversing forward
//        System.out.println("Forward Traversal:");
//        dll.traverseForward();
//
//        // Traversing backward
//        System.out.println("Backward Traversal:");
//        dll.traverseBackward();
//
//        // Inserting elements at the tail
//        dll.insertTail(5);
//        dll.insertTail(1);
//
//        // Traversing forward after tail insertions
//        System.out.println("Forward Traversal after tail insertions:");
//        dll.traverseForward();
//
//        // Removing elements from the head
//        dll.removeHead();
//        System.out.println("Forward Traversal after removing head:");
//        dll.traverseForward();
//
//        // Removing elements from the tail
//        dll.removeTail();
//        System.out.println("Forward Traversal after removing tail:");
//        dll.traverseForward();
//    }
//}
