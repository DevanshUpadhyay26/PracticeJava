package objectOriented.inheritanceTypes;

class gParent{
    public void propertyInfo(){
        System.out.println("100 Acre Land in XYZ Location");
    }
}
class parent extends gParent{
    public void houseInfo(){
        super.propertyInfo();
        System.out.println("This is all we have! ");
    }
}
class child extends parent{
    public void finalInfo(){
        super.houseInfo();
        System.out.println("oof");
    }
}
public class multiLevel {
    public static void main(String[] args) {
        child c = new child();
        c.finalInfo();
    }
}
