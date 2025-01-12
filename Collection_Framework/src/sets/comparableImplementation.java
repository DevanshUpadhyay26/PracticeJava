package sets;


import java.util.ArrayList;

class helperC implements  Comparable<helperC>{
    int n;
    helperC(int n){this.n = n;}

    @Override
    public String toString() {
        return String.valueOf(n);
    }

    @Override
    public int compareTo(helperC o) {
        return this.n - o.n;
     }
}
public class comparableImplementation {
    public static void main(String[] args) {
        ArrayList<helperC> c = new ArrayList<>();
        for (int i = 10; i >= 1; i--) {
            c.add(new helperC(i));
        }
        System.out.println(c);
        c.sort(helperC::compareTo);
        System.out.println(c);

    }

}