package DSA;

import java.util.HashMap;
import java.util.Map;

public class maths4dsa {

/////////////////////////////////////////
    static void primeNumber(int n){
        if(n<=1){
            System.out.println("Not Prime");
            return;
        }
        if(n==2){
            System.out.println("Prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }

    static void test_cases_primeNumbers(){
        // Test Case 1: Smallest Prime Number
        System.out.println("Test Case 1:");
        primeNumber(2); // Expected: Prime

        // Test Case 2: Small Non-Prime Number
        System.out.println("Test Case 2:");
        primeNumber(4); // Expected: Not Prime

        // Test Case 3: Large Prime Number
        System.out.println("Test Case 3:");
        primeNumber(29); // Expected: Prime

        // Test Case 4: Large Non-Prime Number
        System.out.println("Test Case 4:");
        primeNumber(100); // Expected: Not Prime

        // Test Case 5: One (Edge Case)
        System.out.println("Test Case 5:");
        primeNumber(1); // Expected: Not Prime

        // Test Case 6: Zero (Edge Case)
        System.out.println("Test Case 6:");
        primeNumber(0); // Expected: Not Prime

        // Test Case 7: Negative Number (Edge Case)
        System.out.println("Test Case 7:");
        primeNumber(-7); // Expected: Not Prime

        // Test Case 8: Prime Number Close to a Square Root Threshold
        System.out.println("Test Case 8:");
        primeNumber(97); // Expected: Prime

        // Test Case 9: Non-Prime Odd Number
        System.out.println("Test Case 9:");
        primeNumber(9); // Expected: Not Prime
    }

    /////////////////////////////////////////

    static double binarySearchSqrt(int number, int precision){
    int start = 0;
    int end = number;
    double root = 0.0;
    while(start <= end){
        int middle = start+end/2;

        if(middle * middle == number){
            return middle;
        }
        if(middle * middle > number){
            end = middle-1;
        }
        else {
            start = middle+1;
            root = middle;
        }
    }

    return root;
    }
    static void testCaseForBinarySearchSqrt() {
        System.out.println("Test Case 1: N=0, Expected Result: 0.0, Actual Result: " + binarySearchSqrt(0, 2));
        System.out.println("Test Case 2: N=1, Expected Result: 1.0, Actual Result: " + binarySearchSqrt(1, 2));
        System.out.println("Test Case 3: N=4, Expected Result: 2.0, Actual Result: " + binarySearchSqrt(4, 2));
        System.out.println("Test Case 4: N=9, Expected Result: 3.0, Actual Result: " + binarySearchSqrt(9, 2));
    }

    /////////////////////////////////////////

    static int romanToInt(String s){
        int result = 0;


        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() -1 ; i++) {
            if(roman.get(s.charAt(i)) <   roman.get(s.charAt(i+1))){
                result -= roman.get(s.charAt(i));
            }else{
                result += roman.get(s.charAt(i));
            }

        }
        return result + roman.get(s.charAt(s.length()-1));
    }

    static void testCaseForRomanToInt() {
        System.out.println("Test Case 1: N=III, Expected Result: 3, Actual Result: " + romanToInt("III"));
        System.out.println("Test Case 2: N=IV, Expected Result: 4, Actual Result: " + romanToInt("IV"));
        System.out.println("Test Case 3: N=IX, Expected Result: 9, Actual Result: " + romanToInt("IX"));
        System.out.println("Test Case 4: N=LVIII, Expected Result: 58, Actual Result: " + romanToInt("LVIII"));
        System.out.println("Test Case 5: N=MCMXCIV, Expected Result: 1994, Actual Result: " + romanToInt("MCMXCIV"));
        System.out.println("Test Case 6: N=MMMMCMXCIX, Expected Result: 3999, Actual Result: " + romanToInt("MMMMCMXCIX"));
        System.out.println("Test Case 7: N=MMMCMXCIX, Expected Result: 3999, Actual Result: " + romanToInt("MMMCMXCIX"));
        System.out.println("Test Case 8: N=MMMCMXC, Expected Result: 3900, Actual Result: " + romanToInt("MMMCMXC"));
        System.out.println("Test Case 9: N=IIX, Expected Result: 8, Actual Result: " + romanToInt("IIX")); // invalid, check how it handles
        System.out.println("Test Case 10: N=CIV, Expected Result: 104, Actual Result: " + romanToInt("CIV"));
        System.out.println("Test Case 11: N=CDXLIV, Expected Result: 444, Actual Result: " + romanToInt("CDXLIV"));
        System.out.println("Test Case 12: N=MMMDCCCLXXXVIII, Expected Result: 3888, Actual Result: " + romanToInt("MMMDCCCLXXXVIII"));
        System.out.println("Test Case 13: N=MMMMM, Expected Result: Invalid, Actual Result: " + romanToInt("MMMMM")); // check for invalid
        System.out.println("Test Case 14: N=MMMCM, Expected Result: 3900, Actual Result: " + romanToInt("MMMCM"));
        System.out.println("Test Case 15: N=MMXVI, Expected Result: 2016, Actual Result: " + romanToInt("MMXVI"));
    }
    public static void main(String[] args) {
//        test_cases_primeNumbers();
//        testCaseForBinarySearchSqrt();
        testCaseForRomanToInt();
    }

}
