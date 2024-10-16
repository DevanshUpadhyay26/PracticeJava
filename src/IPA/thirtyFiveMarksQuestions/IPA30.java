package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechefeee
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Newspaper[] nw = new Newspaper[4];
        for(int i = 0; i< nw.length; i++){

            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int year = sc.nextInt();sc.nextLine();
            int price = sc.nextInt();sc.nextLine();
            nw[i] = new Newspaper(id, name, year, price);
        }
        int inputYear = sc.nextInt();sc.nextLine();
        String inputName = sc.nextLine();

        int ansOne = findTotalPriceByPublicationYear(nw, inputYear);
        if(ansOne != 0)
        {
            System.out.println(ansOne);
        }
        else{
            System.out.println("Meow");
        }
        Newspaper[] ansTwo = searchNewspaperByName (nw, inputName);
        if(ansTwo !=null){
            for(int i = 0; i<ansTwo.length;i++){
                System.out.println("regNo-"+ ansTwo[i].getRegNo() + "\n"
                        + "name-"+ ansTwo[i].getName() + "\n"
                        + "publicationYear-" + ansTwo[i].getPubYear() + "\n"
                        + "price-" + ansTwo[i].getPrice());
            }
        }
        else{
            System.out.println("Meow");
        }
        sc.close();

    }

    public static int findTotalPriceByPublicationYear(Newspaper[] nw, int year)
    {
        int sum = 0;
        for(int i =0; i<nw.length;i++)
        {
            if(nw[i].getPubYear() == year)
            {
                sum +=nw[i].getPrice();
            }
        }
        if(sum<0)
        {
            return 0;
        }
        return sum;
    }

    public static Newspaper[] searchNewspaperByName(Newspaper[] nw, String name)
    {
        int count = 0;
        for(int i = 0; i<nw.length;i++)
        {
            if(nw[i].getName().equalsIgnoreCase(name))
            {
                count++;
            }
        }
        if(count<1)
        {
            return null;
        }
        int index = 0;
        Newspaper[] sortedN = new Newspaper[count];
        for(int i = 0; i<nw.length;i++)
        {
            if(nw[i].getName().equalsIgnoreCase(name))
            {
                sortedN[index] = nw[i];
                index++;
            }
        }
        return sortedN;
    }
}


class Newspaper{
    private int regNo, pubYear, price;
    private String name;

    public int getRegNo(){return regNo;}
    public int getPubYear(){return pubYear;}
    public int getPrice(){return price;}
    public String getName(){return name;}

    public void setRegNo(int regNo){this.regNo = regNo;}
    public void setPubYear(int pubYear){this.pubYear = pubYear;}
    public void setPrice(int price){this.price =price;}
    public void setName(String name ){this.name = name;}

    Newspaper(int regNo, String name, int pubYear, int price )
    {
        this.regNo = regNo;
        this.name = name;
        this.pubYear = pubYear;
        this.price = price;
    }
}
/*134
Evening Mail
2018
79
178
Morning Mail
2017
65
176
Daily News
2017
98
219
Times of India
1988
15
2017
Times of India*/