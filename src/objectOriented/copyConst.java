package objectOriented;

public class copyConst {
    int student_id;
    String student_name;


    //Parameterized Constructor:
    public copyConst(int _id, String _name){
        this.student_id = _id;
        this.student_name = _name;
    }

    //Copy Constructor:
    public copyConst(copyConst obj){
        this.student_id = obj.student_id;
        this.student_name = obj.student_name;
        System.out.println("This is Copy Constructor !");
    }

    public void displayData(){
        System.out.println("Student ID: " + " : " + student_id);
        System.out.println("Student Name: " + " : " + student_name);
    }
    public static void main(String[] args) {

        copyConst obj_10 = new copyConst(10, "Devansh");
        copyConst obj_20 = new copyConst(20, "Sohail");
        copyConst obj_30 = new copyConst(30, "Aryan");
        copyConst obj_40 = new copyConst(40, "Shobhan");
        copyConst obj_50 = new copyConst(50, "Amrit");

        copyConst ccC = new copyConst(obj_10);
        ccC.displayData();
    }
}
