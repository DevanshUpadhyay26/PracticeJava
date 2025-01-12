package listImplementations;

import java.lang.reflect.Field;
import java.util.*;
import java.lang.*;
import java.io.*;

public class arrayListMethodsExamples {



    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayL1 = new ArrayList<>(10);
        // Add()

        arrayL1.add("SDE");arrayL1.add("QA");arrayL1.add("DA");arrayL1.add("BDE");arrayL1.add("DL");arrayL1.add("ML");
        System.out.println(arrayL1);

        //Capacity Increase
        arrayL1.ensureCapacity(90); //Makes 90
        arrayL1.trimToSize(); //Trim to 6.

//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] elementData = (Object[]) field.get(arrayL1);
//        System.out.println("Current capacity: " + elementData.length);

        //Number of Ele present and isEmpty

        System.out.println("Size: "+arrayL1.size());
        System.out.println("is it Empty? "+arrayL1.isEmpty());

        //Ele present or not
        System.out.println("SDE is there? "+arrayL1.contains("SDE"));

        //first and last Occurance
        System.out.println("First SDE: "+arrayL1.indexOf("SDE"));
        arrayL1.add("SDE");
        System.out.println("Last SDE: "+arrayL1.lastIndexOf("SDE"));

        //ArrayList -> array

        Object[] normalArr = arrayL1.toArray();

        for (int i = 0; i < normalArr.length; i++) {
            if(i == 0){
                System.out.print("[");
            }if(i==normalArr.length-1){
                System.out.println("]");
            }
            System.out.print(normalArr[i]+" ");
        }
        System.out.println();
        //Get and Set Elements

        System.out.println("Index 1 = "+arrayL1.get(1));
        arrayL1.set(1, "IOT Engg");
        System.out.println("New Index 1 = "+arrayL1.get(1));

        //Sublist (substrings)

        List<String> arrayL2 = arrayL1.subList(0,4) ;
        System.out.println("From 0 to 3 elems: "+arrayL2);

        //Concatenation
        ArrayList<String> arrayL3 = new ArrayList<>() ;

        arrayL3.addAll(0,arrayL1);
        arrayL3.add(1, arrayL2.toString());
        System.out.println("ArrayList 3: " + arrayL3);

        //remove and clear
        arrayL1.remove("SDE");
        System.out.println("Removed SDE: "+arrayL1);

        arrayL1.clear();
        System.out.println("Cleared: " + arrayL1);




    }




}
