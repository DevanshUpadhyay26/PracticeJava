package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;




class Movie{
    private int budget;
    private String movieName, company, genre;


    //getters
    public int getBudget(){return budget;}
    public String getMovieName(){return movieName;}
    public String getCompany(){return company;}
    public String getGenre(){return genre;}

    //Setters
    public void setBudget(int budget){this.budget = budget;}
    public void setMovieName(String movieName){this.movieName = movieName;}
    public void setCompany(String company){this.company = company;}
    public void setGenre(String genre){this.genre = genre;}
    //Const
    Movie(String movieName, String company, String genre, int budget)
    {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }
}


class Solution13
{


    public static Movie[] getMovieByGenre(Movie[] movies, String searchGenre){

        int count = 0;
        for(int i = 0;i<movies.length;i++){
            if(movies[i].getGenre().equalsIgnoreCase(searchGenre)){
                count++;
            }
        }

        if(count<1){
            return null;
        }

        Movie[] mm = new Movie[count];
        int index = 0;

        for(int i = 0; i<movies.length;i++){
            if(movies[i].getGenre().equalsIgnoreCase(searchGenre)){
                mm[index] = movies[i];
                index++;
            }
        }

        return mm;

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Movie[] mm = new Movie[4];
        for(int i = 0; i<mm.length;i++)
        {
            String mN=sc.nextLine();
            String cp = sc.nextLine();
            String ge = sc.nextLine();
            int bu = sc.nextInt();sc.nextLine();
            mm[i] = new Movie(mN,cp,ge,bu);
        }

        String inputGenre = sc.nextLine();

        Movie[] m1 = getMovieByGenre(mm, inputGenre);
        if(m1 != null)
        {
            for(int i = 0; i <m1.length;i++){
                if(m1[i].getBudget() > 80000000 )
                {
                    System.out.println("High Budget Movie");
                }
                else{
                    System.out.println("Low Budget Movie");
                }
            }
        }

        sc.close();
    }
}

/*
* aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action
* */