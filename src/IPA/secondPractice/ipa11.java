package IPA.secondPractice;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef11 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        Movie[] movie = new Movie[4];
        for(int i = 0; i<movie.length ; i++)
        {
            String name = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt(); sc.nextLine();
            movie[i] = new Movie(name, company, genre, budget);
        }
        String inputGenre = sc.nextLine();
        Movie[] ansOne = getMovieByGenre(movie, inputGenre);
        if(ansOne != null)
        {
            for(int i= 0; i<ansOne.length; i++)
            {
                if(ansOne[i].getBudget() > 80000000)
                {
                    System.out.println("High Budget Movie");
                }
                else{System.out.println("Low Budget Movie");}
            }
        }
        else{
            System.out.println("Meow");
        }
        sc.close();
    }

    public static Movie[] getMovieByGenre(Movie[] movie, String gen)
    {
        int count = 0;
        for(int i =0; i<movie.length;i++)
        {
            if(movie[i].getGenre().equalsIgnoreCase(gen))
            {
                count++;
            }
        }
        if(count<1){return null;}
        int index = 0;
        Movie[] movies = new Movie[count];
        for(int i =0; i<movie.length;i++)
        {
            if(movie[i].getGenre().equalsIgnoreCase(gen))
            {
                movies[index] = movie[i];
                index++;
            }
        }
        return movies;
    }

}

class Movie{
    private int budget;
    private String name, company, genre;

    public int getBudget(){return budget;}
    public String getName(){return name;}
    public String getCompany(){return company;}
    public String getGenre(){return genre;}

    public void setBudget(int budget){this.budget=budget;}
    public void setName(String name){this.name = name;}
    public void setCompany(String company){this.company = company;}
    public void setGenre(String genre){this.genre = genre;}

    Movie(String name, String company, String genre, int budget)
    {
        this.name = name;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }


}