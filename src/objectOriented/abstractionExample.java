package objectOriented;


abstract class mathFormulas{
    public abstract void Circleformulas(int radius);
    public abstract void rectangleFormulas(int width, int length);
}

class Shapes extends mathFormulas{
    public void Circleformulas(int radius){
        double area = Math.PI *(radius*radius);
        System.out.println("Area of Circle is : " + area);
    }
    public void rectangleFormulas(int width, int length) {
        double area = width * length;
        System.out.println("Area of Rectangle is: " + area);
    }
}
public class abstractionExample {
    public static void main(String[] args) {
    Shapes s = new Shapes();
    s.Circleformulas(9);
    s.rectangleFormulas(10,20);
    }
}
