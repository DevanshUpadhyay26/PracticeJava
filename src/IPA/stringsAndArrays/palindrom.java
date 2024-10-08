package IPA.stringsAndArrays;

import java.util.Scanner;

public class palindrom {
    static boolean isPanlindrom(String word){
        int len = word.length();
        for (int i = 0; i < len/2  ; i++) {
            if(word.charAt(i) != word.charAt(word.length()-1-i)) {return false;}
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(isPanlindrom(word));

    }
}
