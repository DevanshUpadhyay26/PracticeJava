package methodsInJava;

public class instance_staticMethods {
    String name = "";

    public static void swapNumbers(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Number 1 is:  " + a + " Number 2 is: " + b);
    }
    public void printer(String surname){     //This is instance method example:

        this.name = surname;
        System.out.println(surname);
    }
    public static void main(String[] args) {
        instance_staticMethods ism = new instance_staticMethods(); //Creating Object
//        ism.printer("Upadhyay");
        swapNumbers(99,100);
    }
}
