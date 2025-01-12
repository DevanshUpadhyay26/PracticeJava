package strings;



public class differentStringTypes {
    static void strExamples(){
        String str = "Hello World";
        StringBuffer sb = new StringBuffer("Bonjour World");
        StringBuilder sbu = new StringBuilder("Namaste Duniya");

        System.out.println(str + "\n" + sb + "\n" + sbu);


        str = str.concat(" Programming");

        System.out.println(str + "\n" + sb + "\n" + sbu);



    }
    public static void main(String[] args) {
        strExamples();


    }
}
