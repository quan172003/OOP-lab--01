package hust.soict.dsai.aims.media1;

public class DigitalVideoDics extends Media implements Playable{
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void play()
    {
        System.out.println("Playing DVD: " + this.getTitle()); 
        System.out.println("DVD length: " + this.getLength()); 
    }

    

    public DigitalVideoDics(int id, String title, String category, float cost, String title2) {
        super(id, title, category, cost);
        title = title2;
    }

    
    public DigitalVideoDics(int id, String title, String category, float cost, String title2, String category2,
            float cost2) {
        super(id, title, category, cost);
        title = title2;
        category = category2;
        cost = cost2;
    }



    public DigitalVideoDics(int id, String title, String category, float cost, String title2, String category2,
            String director, float cost2) {
        super(id, title, category, cost);
        title = title2;
        category = category2;
        this.director = director;
        cost = cost2;
    }

    public DigitalVideoDics(int id, String title, String category, float cost, String title2, String category2,
            String director, int length, float cost2) {
        super(id, title, category, cost);
        title = title2;
        category = category2;
        this.director = director;
        this.length = length;
        cost = cost2;
    }


    

}