package strings;

import java.util.Arrays;

public class leetcodeStringsQuest {
    //344
    static String reverseString(String str){
    int len = str.length();
    String newStr ="";
        for (int i = 0; i < len ; i++) {
            char temp = str.charAt(i);
            newStr = temp + newStr;
        }
        return newStr;
    }

    //20
    static boolean isValidParentheses(String s){
        while(true){
            if(s.contains("()")) s = s.replace("()","");
            else if(s.contains("{}")) s = s.replace("{}","");
            else if(s.contains("[]"))  s = s.replace("[]","");
            else return s.isEmpty();
        }


    }


    //28
    static int strStr(String haystack, String needle){
        if (haystack.contains(needle)){
            return 0;
        }
        else {
            return -1;
        }
    }

    //171
    static int titleToNumber(String columnTitle){

        return 0;

    }

    //387
    static int firstUniqChar(String s){
        //return index if unique
        // return -1 if not unique

        char schar[] = s.toCharArray();
        Arrays.sort(schar);
        s = new String(schar);


        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i+1)) return s.charAt(i);
        }

        return 0;


    }






    static void fizzBuzz(int n){
    }
    public static void main(String[] args) {
//        System.out.println(reverseString("ObjectP"));
        System.out.println(strStr("leetcode","leeto"));

    }

}
