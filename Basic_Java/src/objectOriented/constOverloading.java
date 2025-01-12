package objectOriented;

public class constOverloading {

    public constOverloading(int i){
        System.out.println(i);
    }
    public constOverloading(double i){
        System.out.println(i);
    }
    public constOverloading(char i){
        System.out.println(i);
    }
    public static void main(String[] args) {

        constOverloading co = new constOverloading(1);
        constOverloading coo = new constOverloading(2.2);
        constOverloading cooo = new constOverloading('A');
    }
}
