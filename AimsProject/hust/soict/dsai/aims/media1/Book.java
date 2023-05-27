package hust.soict.dsai.aims.media1;

import java.util.ArrayList;
import java.util.List;


public class Book extends Media{
    
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public int getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getCategory(){
        return this.category;
    }

    public float getCost(){
        return this.cost;
    }

    public List<String> getAuthors(){
        return  this.authors;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public void setCost(float cost)
    {
        this.cost = cost;
    }

    public void setAuthors(List<String> authors)
    {
        this.authors = authors;
    }


 

    public Book(int id, String title, String category, float cost, int id2, String title2, String category2,
            float cost2, List<String> authors) {
        super(id, title, category, cost);
        id = id2;
        title = title2;
        category = category2;
        cost = cost2;
        this.authors = authors;
    }

    public void addAuthor(String authorName){

       if(!authors.contains(authorName))
       {
        authors.add(authorName);
       }

    }

    public void removeAuthor(String authorName)
    {
        if(authors.contains(authorName))
        {
            authors.remove(authorName);
        }
    }
}
