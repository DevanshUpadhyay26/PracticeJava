public class characterClassMethods {
    public static void main(String[] args) {

        String str = "foobar";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(Character.isLetter(str.charAt(i)));
        }
        }
}
