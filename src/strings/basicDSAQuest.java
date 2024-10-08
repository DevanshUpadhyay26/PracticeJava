package strings;


import java.util.Arrays;

public class basicDSAQuest {
    static void reverseString(String str) {
        int len = str.length();
        String newStr = "";
        System.out.println("Original: " + str);
        for (int i = 0; i < len; i++) {
            char temp = str.charAt(i);
             newStr = temp + newStr;
        }
        System.out.println("Reversed: "+newStr);
    }

    static void stringSort(String str){
        char input[] = str.toCharArray();
        System.out.println(input);
        Arrays.sort(input);
        String sortedString = new String (input);
        System.out.println(input);
    }

    static void duplicate(String str){
        System.out.println("String: "+str);
        int len = str.length();
        char charr[] = str.toCharArray();
        Arrays.sort(charr);
        String sortedString = new String(charr);
        for (int i = 0; i < len; i++) {
            int count  = 1;
            while (i<len-1 && sortedString.charAt(i) == sortedString.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                System.out.println(sortedString.charAt(i) +" Appears: " +count);
            }}}

    public static void main(String[] args) {
//        reverseString("Devansh");
//        stringSort("devansh");
//        duplicate("programming");




    }}

