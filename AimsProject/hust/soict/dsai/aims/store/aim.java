package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.cart.Card;
import hust.soict.dsai.aims.media.DigitalVideoDics;

public class aim {
    public static void main(String[] args) {
        // Create a new cart
        Card user_01_card = new Card();

        // Create new dvds object
        DigitalVideoDics dvd_01 = new DigitalVideoDics("Avatar", "Science Fiction",
                "James Cameron", 87, 19.95f);
        DigitalVideoDics dvd_02 = new DigitalVideoDics("Annabelle", "Horror",
                "James want", 87, 24.95f);
        DigitalVideoDics dvd_03 = new DigitalVideoDics("Only title");
        DigitalVideoDics dvd_04 = new DigitalVideoDics("Doreamon", "Animation", 12.5f);
        user_01_card.addDigitalVideoDics(dvd_01);
        user_01_card.addDigitalVideoDics(dvd_02);
        user_01_card.addDigitalVideoDics(dvd_02);
        user_01_card.addDigitalVideoDics(dvd_02);
        user_01_card.addDigitalVideoDics(dvd_02);
        user_01_card.addDigitalVideoDics(dvd_04);
        user_01_card.addDigitalVideoDics(dvd_04);
        user_01_card.addDigitalVideoDics(dvd_04);
        user_01_card.removeDigitalVideoDics(dvd_01);
        user_01_card.removeDigitalVideoDics(dvd_03);
        user_01_card.removeDigitalVideoDics(dvd_02);
        System.out.println(user_01_card.totalCost());

    }
}