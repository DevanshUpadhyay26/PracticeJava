package IPA.secondPractice;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef4
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        College[] co = new College[n];
        for(int i =0; i<co.length;i++)
        {
            int id =sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int num= sc.nextInt();sc.nextLine();
            String add =sc.nextLine();
            int pin = sc.nextInt();sc.nextLine();
            co[i] = new College(id, name, num, add, pin);
        }
        String inputAdd = sc.nextLine();
        College[] ansOne = findCollegeWithMaximumPincode(co);
        if(ansOne != null)
        {
            System.out.println("Id - " + ansOne[0].getId() + "\n" +
                    "Name - " + ansOne[0].getName() + "\n" +
                    "Contact No - " + ansOne[0].getNum() + "\n" +
                    "Address - " + ansOne[0].getAdd() + "\n" +
                    "Pin Code - " + ansOne[0].getPin());
        }
        else{System.out.println("Meow");}

        College[] ansTwo = searchCollegeByAddress(co, inputAdd);
        if(ansTwo != null)
        {
            for(int i =0;i<ansTwo.length;i++)
            {
                System.out.println("Id - " + ansTwo[i].getId() + "\n" +
                        "Name - " + ansTwo[i].getName() + "\n" +
                        "Contact No - " + ansTwo[i].getNum() + "\n" +
                        "Address - " + ansTwo[i].getAdd() + "\n" +
                        "Pin Code - " + ansTwo[i].getPin());
            }
        }
        else{System.out.println("Meow");}

        sc.close();
    }

    public static College[] findCollegeWithMaximumPincode(College[] co)
    {
        int count = 0;
        for(int i = 0; i<co.length;i++)
        {
            count++;
        }
        if(count<1){return null;}

        for(int i = 0; i<co.length -1; i++)
        {
            for(int j =0; j<co.length - i -1; j++)
            {
                if(co[j].getPin() < co[j+1].getPin())
                {
                    College temp = co[j];
                    co[j] = co[j+1];
                    co[j+1] = temp;
                }
            }
        }
        return co;
    }

    public static College[] searchCollegeByAddress(College[] co, String add)
    {
        int count =0;
        for(int i =0 ;i<co.length;i++)
        {
            if(co[i].getAdd().equalsIgnoreCase(add))
            {
                count++;
            }
        }
        if(count<1){return null;}

        int index = 0;
        College[] coS = new College[count];
        for(int i =0; i<co.length;i++)
        {
            if(co[i].getAdd().equalsIgnoreCase(add))
            {
                coS[index] = co[i];
                index++;
            }
        }

        return coS;
    }
}


class College{

    private int id, num, pin;
    private String name, add;

    public int getId(){return id;}
    public int getNum(){return num;}
    public int getPin(){return pin;}
    public String getName(){return name;}
    public String getAdd(){return add;}

    public void setId(int id){this.id = id;}
    public void setNum(int num){this.num = num;}
    public void setPin(int pin){this.pin = pin;}
    public void setName(String name){this.name = name;}
    public void SetAdd(String add){this.add = add;}

    College(int id, String name, int num, String add ,int pin)
    {
        this.id= id;
        this.name = name;
        this.num = num;
        this.add=  add;
        this.pin = pin;
    }


}