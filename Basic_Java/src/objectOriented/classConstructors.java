package objectOriented;

// PARAMETERIZED AND DEFAULT CONSTRUCTOR
public class classConstructors {
    int age;
    String name;

    //Constructor
    public  classConstructors(int duration, String callOut){
        this.age = duration;
        this.name = callOut;
    }

    public int getAge(){return age;}
    public String getName(){return name;}

    public static void main(String[] args) {
        classConstructors cc = new classConstructors(10,"Ghost");
        System.out.println("Age is : " + cc.getAge() + " and Name is : " + cc.getName());
    }


}
