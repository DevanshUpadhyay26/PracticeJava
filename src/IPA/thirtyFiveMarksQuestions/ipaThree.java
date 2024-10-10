package IPA.thirtyFiveMarksQuestions;

import java.util.*;
import java.lang.*;
import java.io.*;


class College{
    private String name,address;
    private int id, contactNo, pinCode;

    //Getter

    public int getId(){return id;}
    public String getName(){return name;}
    public int getContactNo(){return contactNo;}
    public String getAddress(){return address;}
    public int getPinCode(){return pinCode;}


    //Setter

    public void setId(){this.id = id;}
    public void setName(){this.name = name;}
    public void setContactNo(){this.contactNo = contactNo;}
    public void setAddress(){this.address = address;}
    public void setPinCode(){this.pinCode = pinCode;}

    //Constructor

    College(int id, String Name, int contactNo,String address, int pinCode) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pinCode = pinCode;
    }

}

class Solution1{


    public static College findCollegeWithMaximumPincode(College[] colleges)
    {
        int max = 0;
        //Comparision

        for(int i = 0; i <colleges.length; i++){
            if(colleges[i].getPinCode() > max){
                max = colleges[i].getPinCode();
            }
        }
        //Searching and returning whole data of college
        for(int i = 0; i< colleges.length; i++){
            if(colleges[i].getPinCode() == max){
                return colleges[i];
            }
        }
        return null;

    }

    public static College searchCollegeByAddress(College[] colleges, String addy)
    {
        for(int i = 0; i<colleges.length ; i++)
        {
            if(colleges[i].getAddress().equalsIgnoreCase(addy)){
                return colleges[i];
            }
        }

        return null;

    }

    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        //Inputs

        int numberOfInputs = sc.nextInt();sc.nextLine();
        College[] colleges = new College[numberOfInputs];

        for(int i=0; i<colleges.length;i++){
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int contactNo=sc.nextInt();sc.nextLine();
            String address = sc.nextLine();
            int pinCode = sc.nextInt();sc.nextLine();
            colleges[i] = new College(id, name, contactNo, address, pinCode);

        }

        String inputAddress = sc.nextLine();


        //Method 1

        College ansOne = findCollegeWithMaximumPincode(colleges);
        if(ansOne!=null){
            System.out.println(
                    "id-"+ ansOne.getId() + "\n"
                            +"name-"+ansOne.getAddress() + "\n"
                            +"contactNo-"+ansOne.getContactNo()+ "\n"
                            +"address-"+ansOne.getAddress() + "\n"
                            +"pincode-" + ansOne.getPinCode() );

        }
        else{
            System.out.println("No college found with mentioned attribute.");
        }

        //Method 2

        College ansTwo = searchCollegeByAddress(colleges, inputAddress);
        if(ansTwo != null){
            System.out.println(
                    "id-"+ ansTwo.getId() + "\n"
                            +"name-"+ansTwo.getAddress() + "\n"
                            +"contactNo-"+ansTwo.getContactNo()+ "\n"
                            +"address-"+ansTwo.getAddress() + "\n"
                            +"pincode-" + ansTwo.getPinCode() );
        }
        else{
            System.out.println("No college found with mentioned attribute.");
        }
    }
}

/*
input 1:

4
109
ACT
2500256
mumbai
695001
107
MCE
2500254
malapuram
612354
113
CTE
2500252
chennai
623145
102
SCT
2500255
AP
523641
AP



OUTPUT1:

id-109

name-ACT

contactNo-2500256

address-mumbai

pincode-695001

id-102

name-SCT

contactNo-2500255

address-AP

pincode-523641







INPUT2:

4
111
MJT
2500251
Calicut
401235
105
MET
2500256
kochi
668745
115
IIT
2500262
banglore
569874
110
ACT
2500263
delhi
687945
delhi


output2:

id-110

name-ACT

contactNo-2500263

address-delhi

pincode-687945

id-110

name-ACT

contactNo-2500263

address-delhi

pincode-687945
* */