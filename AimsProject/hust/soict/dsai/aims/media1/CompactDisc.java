package hust.soict.dsai.aims.media1;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{

    private String artist;
    private List<Track> track = new ArrayList<Track>();
    

    public String getArtist() {
        return artist;
    }


    public List<Track> getTrack() {
        return track;
    }


    public CompactDisc(int id, String title, String category, float cost, String director, float length, String artist,
            List<Track> track) {
        super(id, title, category, cost, director, length);
        this.artist = artist;
        this.track = track;
    }

    public void addTrack(Track trackName)
    {
        if(!track.contains(trackName))
        {
            track.add(trackName);
        }
        else
        {
            System.out.println("Already has this track.");
        }
    }

    public void removeTrack(Track trackName)
    {
        if(track.contains(trackName))
        {
            track.remove(trackName);
        }
        else
        {
            System.out.println("Don't have this track.");
        }
    }

    public float getLength()
    {
        float totalLength = 0;

        for(Track a: track)
        {
            totalLength = totalLength + a.length ;
        }
        return totalLength;
        
    }

    public void play()
    {
        for(Track a: track)
        {
            a.play();
        }
    }


    
}
