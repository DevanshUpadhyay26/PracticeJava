package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodechefMeow
{
    public static int FindNumClearancedByLoc(Institution[] inst, String loc){

        int sum = 0;
        for(int i = 0; i<inst.length;i++){
            if(inst[i].getLocation().equalsIgnoreCase(loc)){
                sum+=inst[i].getCleared();
            }
        }
        if(sum<0){
            return 0;
        }
        return sum;
    }

    public static Institution[] UpdateInstitutionGrade(Institution[] inst, String name){
        int count = 0;

        for(int i=0;i< inst.length;i++){
            if(inst[i].getName().equalsIgnoreCase(name)){
                count++;
            }
        }
        if(count<1){
            return null;
        }
        int index=0;
        Institution[] sortedInst = new Institution[count];

        for(int i = 0; i<inst.length;i++){
            if(inst[i].getName().equalsIgnoreCase(name)){
                sortedInst[index] = inst[i];
                index++;
            }
        }
        return sortedInst;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Institution[] inst = new Institution[4];
        for(int i =0; i<inst.length;i++){
            int id= sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int placed=sc.nextInt();sc.nextLine();
            int cleared=sc.nextInt();sc.nextLine();
            String loc=sc.nextLine();
            inst[i] = new Institution(id, name, placed, cleared, loc);
        }
        String inputLocation = sc.nextLine();
        String inputName = sc.nextLine();

        int ansOne = FindNumClearancedByLoc(inst, inputLocation);
        if(ansOne !=0){
            System.out.println(ansOne);
        }
        else{
            System.out.println("Meow");

        }

        Institution[] ansTwo = UpdateInstitutionGrade(inst, inputName);
        if(ansTwo != null){
            for(int i = 0 ;i < ansTwo.length;i++){
                int rating = ansTwo[i].getPlaced() * 100 / ansTwo[i].getCleared();
                if(rating >= 80){
                    System.out.println(ansTwo[i].getName() + "::A");
                }
                else{
                    System.out.println(ansTwo[i].getName() + "::B");

                }
            }
        }
        else{System.out.println("Meow");}
    }
}




class Institution{
    private int  insId, placed, cleared;
    private String name, loc;

    //Getterss
    public int getId(){return insId;}
    public int getPlaced(){return placed;}
    public int getCleared(){return cleared;}
    public String getName(){return name;}
    public String getLocation(){return loc;}
    //Setters
    public void setId(int insID){this.insId=insId;}
    public void setPlaced(int placed){this.placed=placed;}
    public void setCleared(int cleared){this.cleared=cleared;}
    public void setName(String name){this.name=name;}
    public void setLocation(String loc){this.loc=loc;}
    // Consts
    Institution(int insId, String name, int placed, int cleared, String loc){
        this.insId=insId;
        this.name=name;
        this.placed=placed;
        this.cleared=cleared;
        this.loc=loc;
    }
}
/*111
Amrita
5000
10000
Chennai
222
Karunya
16000
20000
Coimbatore
333
AppleTech
10000
12000
Chennai
444
Aruna
6000
10000
Vellore
Chennai
Karunya*/