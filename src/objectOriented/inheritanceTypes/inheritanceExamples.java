package objectOriented.inheritanceTypes;
// Single Inheritance

//Using Const to call base class through derived class
class University{
    void University(int _dept_id, int num_of_faculties){
        System.out.println("Department_ID: " +_dept_id + " Number of Faculties: "+num_of_faculties);
    }
}
class Departments extends University {
    void display(){
        super.University(1,100);
    }
}
public class inheritanceExamples {
    public static void main(String[] args) {
        Departments d = new Departments();
        d.display();
    }
}
