package IPA.secondPractice;
import java.util.*;
import java.io.*;

class Codechef8 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        Book[] book = new Book[4];

        // Reading book details from user
        for (int i = 0; i < book.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            int pages = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            book[i] = new Book(id, pages, title, author, price);
        }

        // Input for title to search
        String inputTitle = sc.nextLine();

        // Find book with the maximum price
        Book[] ansOne = findBookWithMaximumPrice(book);
        if (ansOne != null) {
            for (int i = 0; i < ansOne.length; i++) {
                System.out.println(ansOne[i].getId() + " " + ansOne[i].getTitle());
            }
        } else {
            System.out.println("Meow");
        }

        // Search book by title
        Book[] ansTwo = searchBookByTitle(book, inputTitle);
        if (ansTwo != null) {
            System.out.println(ansTwo[0].getTitle() + "\n" + ansTwo[0].getId());
        } else {
            System.out.println("Meow");
        }

        sc.close();
    }

    // Method to find the book with the maximum price
    public static Book[] findBookWithMaximumPrice(Book[] bo) {
        if (bo.length == 0) return null;

        double maxPrice = 0;
        for (Book b: bo) {
            if (b.getPrice() > maxPrice) {
                maxPrice = b.getPrice();
            }
        }

        int count = 0;
        for (Book b: bo) {
            if (b.getPrice() == maxPrice) {
                count++;
            }
        }

        if (count < 1) return null;

        Book[] bookS = new Book[count];
        int index = 0;
        for (Book b: bo) {
            if (b.getPrice() == maxPrice) {
                bookS[index++] = b;
            }
        }

        return bookS;
    }

    // Method to search for books by title
    public static Book[] searchBookByTitle(Book[] bo, String title) {
        int count = 0;
        for (Book b: bo) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                count++;
            }
        }

        if (count < 1) return null;

        Book[] bookS = new Book[count];
        int index = 0;
        for (Book b: bo) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                bookS[index++] = b;
            }
        }

        return bookS;
    }
}

class Book {
    private int id, pages;
    private String title, author;
    private double price;

    public int getId() {
        return id;
    }
    public int getPage() {
        return pages;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setPage(int pages) {
        this.pages = pages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    Book(int id, int pages, String title, String author, double price) {
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
