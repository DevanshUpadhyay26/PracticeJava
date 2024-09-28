package basicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class userInput {
    public void readerBuffer() throws IOException{
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Number");
        int num = Integer.parseInt(bfn.readLine());
        System.out.println("Number is: " + num);

        System.out.println("Enter a String");
        String str = bfn.readLine();
        System.out.println("String is: " + str);
        bfn.close();
    }

    public void scannerInput(){
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt(); OR
        int num = Integer.parseInt(sc.next());
        System.out.println(num);

        String str = sc.next();
        System.out.println(str);

    }
    public static void main(String[] args) throws IOException {

        userInput ui = new userInput();
//      ui.readerBuffer();
        ui.scannerInput();



    }
}
