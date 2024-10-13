package mcqsHandson;

public class decrementArray {


    static void decrementArray(){
        int []arr = new int[]{12,15,16,17,19,23};
        for(int i = arr.length -1; i>0; i--){
            if(i % 3 != 0){
                --i;
            }
            System.out.println(arr[i]);
        }

    }

    static void dividebyzero(){
        double a = 3.0/0;
        double b = 0/4.0;
        double c = 0/0.0;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    static void btye(){
        byte a = 50;
        a *= 50;
        System.out.println(a);
    }

    static void leftShit(){
        byte x = 64;
        int i;
        byte y;
        i = x << 2;
        y = (byte) (x << 2);
        System.out.print(i + " " + y);
    }
    
//    public static int sum(int ...x){
//        int total = 0;
//        total +=x;
//
//
//    }
    public static void main(String[] args) {

//        dividebyzero();
//        btye();
//        leftShit();



    }
}
