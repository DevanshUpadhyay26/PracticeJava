package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class CodechefPPP
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Song[] s = new Song[5];
        for(int i =0 ; i<s.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String title= sc.nextLine();
            String artist=sc.nextLine();
            double duration = sc.nextDouble(); sc.nextLine();
            s[i] = new Song(id, title, artist, duration);
        }
        String inputArtist = sc.nextLine();
        String inputArtist2=sc.nextLine();

        int ansOne = findSongDurationForArtist(s, inputArtist);
        if(ansOne != 0)
        {
            System.out.println(ansOne);
        }
        else{System.out.println("Meow");}

        Song[] ansTwo = getSongsInAscendingOrder(s, inputArtist2);
        if(ansTwo != null)
        {
            for(int i=0;i<ansTwo.length;i++)
            {
                System.out.println(ansTwo[i].getId() + "\n" + ansTwo[i].getTitle());
            }
        }
        else{System.out.println("Meow");}
        sc.close();

    }





    public static int findSongDurationForArtist(Song[] s, String artist)
    {
        int sum=0;
        for(int i =0;i<s.length;i++)
        {
            if(s[i].getArtist().equalsIgnoreCase(artist))
            {
                sum+=s[i].getDuration();
            }
        }
        if(sum<0)
        {
            return 0;
        }
        return sum;

    }



    public static Song[] getSongsInAscendingOrder(Song[] so, String artis)
    {
        int count = 0;
        for(int i =0; i<so.length;i++)
        {
            if(so[i].getArtist().equalsIgnoreCase(artis))
            {
                count++;
            }
        }
        if(count<0)
        {return null;}

        int index = 0;
        Song[] sortedSongs = new Song[count];
        for(int i = 0; i<so.length;i++)
        {
            if(so[i].getArtist().equalsIgnoreCase(artis))
            {
                sortedSongs[index] = so[i];
                index++;
            }
        }
        for(int i = 0; i<sortedSongs.length - 1; i++)
        {
            for(int j = 0; j<sortedSongs.length -i -1;j++)
            {
                if(sortedSongs[j].getDuration() > sortedSongs[j+1].getDuration())
                {
                    Song temp = sortedSongs[j];
                    sortedSongs[j] = sortedSongs[j+1];
                    sortedSongs[j+1] = temp;
                }
            }
        }
        return sortedSongs;
    }
}


class Song{

    private int songId;
    private String title, artist;
    private double duration;

    public int getId(){return songId;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
    public double getDuration(){return duration;}

    public void setId(int songId){this.songId=songId;}
    public void setTitle(String title){this.title=title;}
    public void setArtist(String artist){this.artist=artist;}
    public void setDuration(double duration){this.duration=duration;}

    Song(int songId, String title, String artist, double duration)
    {
        this.songId=songId;
        this.title=title;
        this.artist=artist;
        this.duration=duration;
    }
}
/*2150
In time
Justin Timberlake
4
250
Cry Me
Justin Timberlake
3
1200
Mirrors
Justin Timberlake
5
1300
That's the way it is
celion dion
5
500
Ashes
celion dion
3
celion dion
Justin Timberlake*/