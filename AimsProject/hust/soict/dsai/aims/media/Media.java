package hust.soict.dsai.aims.media;

public abstract class Media {
    
    private int id;
    private String title;
    private String category;
    private float cost;

    public int getId()
    {
        return this.id;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getCategory(){
        return this.category;
    }

    public float getCost()
    {
        return this.cost;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setTitle(String title)
    {
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

}
