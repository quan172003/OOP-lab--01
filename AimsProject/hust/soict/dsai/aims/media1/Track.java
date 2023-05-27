package hust.soict.dsai.aims.media1;

public class Track implements Playable{
    
    private String title;
    float length;
    
    public String getTitle() {
        return title;
    }
    public float getLength() {
        return length;
    }
    public Track(String title, float length) {
        this.title = title;
        this.length = length;
    }

    public void play()
    {
        System.out.println("Playing DVD: " + this.getTitle()); 
        System.out.println("DVD length: " + this.getLength()); 
    }

}
