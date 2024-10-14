package IPA.thirtyFiveMarksQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechefasdsad
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        Document[] doc = new Document[4];
        for(int i=0;i<doc.length;i++)
        {
            int id= sc.nextInt();sc.nextLine();
            String title = sc.nextLine();
            String name=sc.nextLine();
            int pages = sc.nextInt();
            doc[i] = new Document(id, title, name, pages);
        }
        Document[] ansOne = docsWithOddPages(doc);
        if(ansOne != null)
        {
            for(int i = 0; i<ansOne.length;i++)
            {
                System.out.println(ansOne[i].getId() + " " +ansOne[i].getTitle() + " " + ansOne[i].getName() + " " + ansOne[i].getPages());
            }
        }
        else{
            System.out.println("Meow");
        }
    }

    public static Document[] docsWithOddPages(Document[] docs)
    {
        //pages pages%2 !=0 then return
        //sort the array in ascending order with id


        int count = 0;
        for(int i = 0; i<docs.length; i++)
        {
            if(docs[i].getPages() % 2 != 0)
            {
                count++;
            }
        }
        if(count < 1)
        {
            return null;
        }
        int index = 0;
        Document[] docs2 = new Document[count];
        for(int i = 0; i<docs.length; i++)
        {
            if(docs[i].getPages() % 2 != 0)
            {
                docs2[index] = docs[i];
                index++;
            }
        }

        for(int i = 0; i<docs2.length-1;i++)
        {
            for(int j = 0; j<docs2.length - i - 1;j++)
            {
                if(docs2[j].getId() > docs2[j+1].getId())
                {
                    Document temp = docs2[j];
                    docs2[j] = docs[j+1];
                    docs2[j+1] = temp;
                }
            }
        }
        return docs2;


    }
}


class Document{
    private int id, pages;
    private String title, name;


    //getter
    public int getId(){return id;}
    public int getPages(){return pages;}
    public String getTitle(){return title;}
    public String getName(){return name;}

    //setters
    public void setId(int id){this.id=id;}
    public void setPages(int pages){this.pages=pages;}
    public void setTitle(String title){this.title = title;}
    public void setName(String name) {this.name = name;}
    //consts

    Document(int id, String title, String name, int pages)
    {
        this.id=id;
        this.title=title;
        this.name=name;
        this.pages=pages;
    }
}

//1
//        resume
//        personal
//        50
//        2
//        question1
//        exams
//        55
//        3
//        question2
//        exams
//        45
//        4
//        India
//        misc
//        40
