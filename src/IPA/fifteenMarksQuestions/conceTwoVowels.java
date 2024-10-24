package IPA.fifteenMarksQuestions;

import java.util.Scanner;

public class conceTwoVowels {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine().toLowerCase();
        String[] arr = sent.split(" ");
        int count = 0;
        String res="";
// 		for(String pp:arr){System.out.println(pp);}

        for(int i =0; i<arr.length;i++){
            for(int j =1; j<arr[i].length();j++)
            {
                if(isVowel(arr[i].charAt(j-1)) == true && isVowel(arr[i].charAt(j))==true)
                {
                    count++;break;

                }
                res+=arr[i].charAt(j-1) + arr[i].charAt(j);
            }
        }
        System.out.println( count);


    }
    public static boolean isVowel(char c){
        if(c == 'a' || c=='e'|| c=='i'|| c=='o'|| c=='u'){return true;}
        else{return false;}
    }
}
