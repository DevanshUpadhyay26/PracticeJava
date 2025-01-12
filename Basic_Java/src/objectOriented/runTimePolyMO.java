package objectOriented;

class School{
    int c_id = 1;
    public int display(){
        return c_id;
    }
}
class dept extends School{
    int d_id = 101;
    public int display(){
        return d_id;
    }
}
class admin_office extends School{
    int a_id=1011;
    public int display(){
        return a_id;
    }
}
public class runTimePolyMO {
    public static void main(String[] args) {
        School s = new School();
        System.out.println("School ID: " +  s.display());

        s = new admin_office();
        System.out.println("Admin Office ID: "+ s.display());

        s = new dept();
        System.out.println("Dept ID: " + s.display());
    }
}
