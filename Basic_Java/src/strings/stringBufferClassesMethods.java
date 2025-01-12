package strings;

public class stringBufferClassesMethods {


    static void oP(StringBuffer str){
        System.out.println(str.append(" Java"));
        System.out.println(str.insert(str.length(), " World"));
        System.out.println(str.replace(0,6,"Bonjour "));
        System.out.println(str.delete(0,8));
        System.out.println(str.reverse());
        System.out.println(str.capacity());
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        oP(str);

    }
}
