package basicJava;

public class variablesAndOperators {
int x =20;
    public void getNonNumericOutput(){
        boolean isReal = true;
        char name= 'D';
        System.out.println("Sizes of Non Numberic DT is : " +
                " Boolean: " + isReal+
                " Char: " + name);
    }
    public void getNumericOutput(){
        byte var = 1;
        short var2 = 2;
        long var3 = 8;
        int var4 = 4;

        float var5 = 4.0F;
        double var6 = 8.0;

        System.out.println("Sizes of Numeric DT is : " +
                "Byte: " + var +
                " Short: " + var2+
                " Long: " +var3+
                " Int: " + var4+
                " Float: " + var5+
                " Double: " + var6);

    }


    public static void main(String[] args) {
    variablesAndOperators vao = new variablesAndOperators();

//    vao.getNumericOutput();
//    vao.getNonNumericOutput();

        System.out.println(vao.x);
    }}
