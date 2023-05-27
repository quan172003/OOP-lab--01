package hust.soict.dsai.aims.cart;


import java.util.ArrayList;
import hust.soict.dsai.aims.media1.Media;

public class Card {
    public static final int MAX_NUMBERS_ORDERED = 20;
    public int qtyOrdered = 0;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(); 

    // -----------------------------------------------------------------------

        public void addMedia(Media newMedia)
        {
            if(itemsOrdered.contains(newMedia))
            {
                System.out.println("Already has this media.");
            }
            else
            {
                itemsOrdered.add(newMedia);
            }
        }

    // -----------------------------------------------------------------------


        public void removeMedia(Media deleteMedia)
        {
            if(!itemsOrdered.contains(deleteMedia))
            {
                System.out.println("Don't have this media.");
            }
            else
            {
                itemsOrdered.remove(deleteMedia);
            }
        }

    // -----------------------------------------------------------------------

        public float totalCost() {
            float total = 0f;
            
            for (Media a : itemsOrdered)
            {
                total = total + a.getCost();
            }
            return total;
        }


}