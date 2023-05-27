package hust.soict.dsai.aims.media1;

public class Disc extends Media{

    private String director;
    private float length;

    public String getDirector()
    {
        return this.director;
    }

    public float getLength()
    {
        return this.length;
    }

    public Disc(int id, String title, String category, float cost, String director, float length) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }





    
}
