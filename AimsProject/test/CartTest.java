package AimsProject;

public class CartTest {
    public static void main(String [] args){

        card card = new Card();

        DigitalVideoDics dvd1 = new DigitalVideoDics("the lion king", "animation", "Roger Allay", 87, 19.95f);
        card.addDigitalVideoDics(dvd1);
        DigitalVideoDics dvd2 = new DigitalVideoDics("Star war", "Science fiction", "Georgo Lucas", 87, 24.95f);
        card.addDigitalVideoDics(dvd2);
        DigitalVideoDics dvd3 = new DigitalVideoDics("Aladin", "animation", "Disney", 87, 18.99f);
        card.addDigitalVideoDics(dvd3);
        card.print();

    }
}
