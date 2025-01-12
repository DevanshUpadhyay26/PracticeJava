package listImplementations;

import java.util.*;
import java.lang.*;
import java.io.*;
public class LL_ListIterators {



    public static void main(String[] args) {

        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(10);LL.add(20);LL.add(30);LL.add(40);LL.add(50);LL.add(60);


        //Using Iterator to printing LL in forward direction
        Iterator<Integer> itr  = LL.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        ListIterator<Integer> Litr = LL.listIterator();
        while(Litr.hasNext()){
            System.out.println("Previous Index = "+Litr.previousIndex()+
                    " Data = "+ Litr.next()+
                    " Next Index ="+Litr.nextIndex());
        }



    }
}
