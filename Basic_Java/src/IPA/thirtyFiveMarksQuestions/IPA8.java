package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;


class Book {
    private int id, pages;
    private String title, author;
    private double price;

    //Getters
    public int getId(){return id;}
    public int getPages(){return pages;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public double getPrice(){return price;}

    //Setters

    public void setId(int id){this.id = id;}
    public void setPages(int pages){this.pages = pages;}
    public void setTitle(String title){this.title = title;}
    public void setAuthor(String author){this.author = author;}
    public void setPrice(double price){this.price = price;}

    //Constructors
    Book(int id, int pages, String title, String author, double price){
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
class Solution5{


    public static Book[] findBookWithMaximumPrice(Book[] books){
        Book[] newBook = new Book[0];
        double max = 0;

        //Store the maximum Price in max variable
        for(int i = 0; i<books.length;i++){
            if(books[i].getPrice() >= max){
                max = books[i].getPrice();
            }
        }

        //Search the book with max variable, if yes then store the array objects into newBook

        for(int i = 0; i<books.length;i++){
            if(books[i].getPrice() == max){
                newBook = Arrays.copyOf(newBook, newBook.length + 1 );
                newBook[newBook.length - 1] = books[i];
            }
        }
        //checkpoint

        if(newBook.length > 0 ){
            return newBook;
        }else{return null;}
    }
    public static Book searchBookByTitle(Book[] books, String title){
        for(int i = 0; i<books.length;i++){
            if(books[i].getTitle().equalsIgnoreCase(title)){
                return books[i];
            }
        }
        return null;
    }



    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[4];
        for(int i = 0; i<books.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            int pg = sc.nextInt();sc.nextLine();
            String ti =sc.nextLine();
            String aut=sc.nextLine();
            double pri=sc.nextDouble();sc.nextLine();
            books[i] = new Book(id,pg,ti,aut,pri);
        }
        String inputTitle = sc.nextLine();

        Book[] ansOne = findBookWithMaximumPrice(books);
        if(ansOne != null){
            for(int i = 0; i<ansOne.length;i++){
                System.out.println(ansOne[i].getId()+" "+ ansOne[i].getTitle());
            }

        }
        else{
            System.out.println("No Book found with mentioned attribute.");
        }
        Book ansTwo =  searchBookByTitle(books,inputTitle);
        if(ansTwo != null){
            System.out.println(ansTwo.getId() + "\n" + ansTwo.getPages());
        }




    }



}
/*
1
845
Bengali
Arijit
525.50
2
456
English
Raju
412.30
3
1022
History
Kaka
525.50
4
125
geography
MN
524
English
* */