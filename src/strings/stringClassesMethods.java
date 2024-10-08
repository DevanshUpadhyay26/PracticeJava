package strings;

public class stringClassesMethods {

    static String str = "Hello World";

    static void stringLength(){
        System.out.println("-----String Length Methods: -------");
        System.out.println("Length = "+ str.length());
        System.out.println("Char at index 0: " + str.charAt(0));
        System.out.print("Char to Array: " );
        System.out.println(str.toCharArray());
    }
    static void stringSubstrings(){
        System.out.println("-----Strings Substrings Methods: -----");
        System.out.println("Start the String from index 1: "+str.substring(1));
        System.out.println("Prints the String from 0th to 5th index: " +str.substring(0,5));
    }

    static void stringSearch(){
        System.out.println("-----String Search Methods: -----");
        System.out.println("Prints the Index of string appeared First: "+str.indexOf("World"));
        String ss = "Hello Hello World";
        System.out.println("Start Searching from index 1: "+ss.indexOf("Hello", 1));
        System.out.println("Last Occurance of 'O': "+ss.lastIndexOf("o"));
        System.out.println("Check  if String Contans 'Hello': "+ss.contains("Hello"));
        System.out.println("Check if String Starts with 'P': "+ss.startsWith("P"));
    }

    static void stringComparision(){
        System.out.println("-----String Comparision Methods:-----------");
        String obj  = new String("Hello World");
        System.out.println("Check if String is Equals to given Object: "+str.equals(obj));
        System.out.println("Compares while Ignoring Case of String: "+str.equalsIgnoreCase(obj));
        System.out.println("Compares using compareTo(): " + str.compareTo(obj));
        System.out.println("compareTo() while ignoring Case of String: " + str.compareToIgnoreCase(obj));
    }

    static void string_Concate_Conversion_trim(){
        System.out.println("-----String Concatenation , Modification and trim Methods:-----------");
        String op = new String(" of Programming!");
        System.out.println("Concate the existing string with another: "+str.concat(op));
        System.out.println("Replace the String with new value: "+str.replace("Hello","Bonjour"));
        System.out.println("To Lower Case: "+str.toLowerCase());
        System.out.println("To Upper Case: " + str.toUpperCase());
        System.out.println("Remove Leading and Trailing Whitespaces: " + str.trim());
    }
    public static void main(String[] args) {

        stringLength();
        stringSubstrings();
        stringSearch();
        stringComparision();
        string_Concate_Conversion_trim();
    }
}
