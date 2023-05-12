package AimsProject;

public class card {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDics[] itemsOrdered = new DigitalVideoDics[MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0;

    // -----------------------------------------------------------------------

    public void addDigitalVideoDics(DigitalVideoDics disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full!");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added!");
    }

    // -----------------------------------------------------------------------
    public void removeDigitalVideoDics(DigitalVideoDics disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;

                System.out.println("The dics has been removed!");
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }

                qtyOrdered--;
                break;
            }
        }
        if (!found) {
            System.out.println("Error 404! The dics is not found!");
        }
    }

    // -----------------------------------------------------------------------
    public void addDigitalVideoDics(DigitalVideoDics [] dvdlist)
    {
        int i;
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full!");
            return;
        }
        for(i = 0; i < dvdlist.length; i++)
        {
            itemsOrdered[qtyOrdered] = dvdlist[i];
            qtyOrdered++; 
        }
        System.out.println("The disc has been added!");

    }
    // -----------------------------------------------------------------------
    public void addDigitalVideoDics(DigitalVideoDics dvd1, DigitalVideoDics dvd2)
    {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full!");
            return;
        }
        itemsOrdered[qtyOrdered] = dvd1;
        qtyOrdered++; 
        itemsOrdered[qtyOrdered] = dvd2;
        qtyOrdered++; 
    }
    // -----------------------------------------------------------------------


    public float totalCost() {
        float total = 0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}