import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student{
    String name;
    String roll_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }


}




public class jvmExample {
    public static void main(String[] args) {
        Student s1 = new Student();

        Class c = s1.getClass();
        System.out.println("Class Name: "+ c.getName());

        Method m[] = c.getDeclaredMethods();
        for (Method method: m) {System.out.println("Methods: \n" +method.getName());}

        Field f[] = c.getDeclaredFields();
        for (Field field: f) {System.out.println("Fields: \n"+field.getName());}

        System.out.println(Student.class.getClassLoader());  //Class Loader
    }
}


