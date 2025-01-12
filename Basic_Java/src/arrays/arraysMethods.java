package arrays;
import java.util.*;
public class arraysMethods {


    public static void main(String[] args) {
        int[] arr = new int[]{99,22,3,4,44,33,223};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,44));


        int temp[] = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(temp));

        int temp2[] = Arrays.copyOfRange(arr,0,2);
        System.out.println("Copy of Range: "+Arrays.toString(temp2));

        int newArr[] = new int[5];
        Arrays.fill(newArr,2);
        System.out.println(Arrays.toString(newArr));

        int newArr2[] = new int[]{2,2,2,2,2};
        System.out.println(Arrays.equals(newArr2,newArr));

        Arrays.asList(arr);
        System.out.println(Arrays.toString(arr));
    }
}
