package objectOriented;

abstract class Uni{
    int uni_id;
    void Uni(int _id){
        this.uni_id = _id;
        System.out.println("University ID: "+_id);
    }
    abstract String totalIndividuals(int _total_students, int _total_teachers);
}

class College extends Uni{
    College(){
        Uni(101);
    }
    String totalIndividuals(int _total_students, int _total_teachers) {
        return "Total Individuals are: "+ (_total_teachers+_total_students) +"\n" +
                "Total Students: " + _total_students + "\n" +
                "Total Teachers: " + _total_teachers + "\n" ;
    }
    void displayData(){
        System.out.println(totalIndividuals(60,10));
    }
}
public class abstractionExample2 {
    public static void main(String[] args) {
        College c  = new College();
        c.displayData();
    }
}
