package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechefewrewrewr
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Music[] ms = new Music[4];
        for(int i = 0; i< ms.length; i++)
        {
            int pNo = sc.nextInt();sc.nextLine();
            String type = sc.nextLine();
            int count = sc.nextInt();sc.nextLine();
            double dur = sc.nextDouble();sc.nextLine();

            ms[i] = new Music(pNo, type, count, dur);
        }
        int inputCount = sc.nextInt();sc.nextLine();
        int inputDuration = sc.nextInt();
        int ansOne  = findAvgCount(ms, inputCount);
        if(ansOne != 0 )
        {
            System.out.println(ansOne);
        }
        else{System.out.println("Meow");}
        Music[] ansTwo = sortTypeByDuration(ms, inputDuration);
        if(ansTwo != null)
        {
            for(int i = 0; i<ansTwo.length;i++)
            {
                System.out.println(ansTwo[i].getType());
            }
        }
        else{System.out.println("Meow");}
        sc.close();

    }
    //object count > input count
    public static int findAvgCount(Music[] ms, int count){
        int counter=0;
        int sum = 0;
        for(int i = 0; i<ms.length;i++)
        {
            if(ms[i].getCount() > count){
                sum+=ms[i].getCount();
                counter++;
            }
        }
        if(counter<1){
            return sum/counter;
        }
        return 0;

    }
    //asc of duration
    public static Music[] sortTypeByDuration(Music[] ms, int dura)
    {
        int count = 0;
        for(int i = 0; i< ms.length; i++)
        {
            if(ms[i].getDur() == dura)
            {
                count++;
            }
        }
        if(count<1)
        {return null;}

        int index = 0;
        Music[] sortedMs = new Music[count];
        for(int i = 0; i< ms.length; i++)
        {
            if(ms[i].getDur() == dura)
            {
                sortedMs[index] = ms[i];
                index++;
            }

        }
        for(int i = 0; i < sortedMs.length - 1; i++)
        {
            for(int j = 0; j < sortedMs.length - i - 1; j++)
            {

                if(sortedMs[j].getDur() > sortedMs[j+1].getDur())
                {
                    Music temp = sortedMs[j];
                    sortedMs[j] = sortedMs[j+1];
                    sortedMs[j+1] = temp;
                }
            }
        }
        return sortedMs;
    }
}


class Music{
    private int count,pNo;
    private double dur;
    private String type;


    public int getCount(){return count;}
    public int getPno(){return pNo;}
    public double getDur(){return dur;}
    public String getType(){return type;}

    public void setCount(int count){this.count=count;}
    public void setPno(int pNo){this.pNo=pNo;}
    public void setDur(double dur){this.dur=dur;}
    public void setType(String type){this.type=type;}

    Music(int pNo, String type, int count, double dur){
        this.pNo=pNo;
        this.type=type;
        this.count=count;
        this.dur=dur;
    }
}