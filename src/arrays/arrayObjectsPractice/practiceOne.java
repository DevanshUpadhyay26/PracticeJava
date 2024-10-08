package arrays.arrayObjectsPractice;


import java.util.Arrays;
import java.util.Scanner;



class Book{
    private String title, author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString(){
        return "Title: " + title + "\n"
        + "Author: " + author + "\n"
        + "Price: " + price;
    }
}
public class practiceOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[1];
        for (int i = 0; i < books.length ; i++) {
            System.out.println("Enter Your Title: ");
            String bookTitle = sc.nextLine();
            System.out.println("Enter Your Author: ");
            String bookAuthor = sc.nextLine();
            System.out.println("Enter Your Price: ");
            int price = sc.nextInt();sc.nextLine();
            books[i] = new Book(bookTitle,bookAuthor,price);
        }
        for (Book book1: books) {System.out.println(book1);}
        sc.close();
    }}
