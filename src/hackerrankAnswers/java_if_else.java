package hackerrankAnswers;

public class java_if_else {
    public void outputMethod(int num){

        if(num % 2 != 0){
            System.out.println("Weird");
        }
        else if(num % 2 == 0 && num>=6 && num<=20){
            System.out.println("Weird");
        }
        else if ( num % 2 == 0 && num >=2 && num<=5 || num>20){
            System.out.println("Not Weird");
        }
    }
    public static void main(String[] args) {

    }
}
