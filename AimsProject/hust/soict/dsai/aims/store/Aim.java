package hust.soict.dsai.aims.store;

import java.util.Scanner;

public class Aim {

    public static void main(String[] args) {

        showMenu();

    }

    public static void showMenu()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("AIMS: "); 
        System.out.println("--------------------------------"); 
        System.out.println("1. View store"); 
        System.out.println("2. Update store"); 
        System.out.println("3. See current cart"); 
        System.out.println("0. Exit"); 
        System.out.println("--------------------------------"); 
        System.out.println("Please choose a number: 0-1-2-3"); 

        int i = input.nextInt();

        switch(i)
        {
            case 1:
            {
                storeMenu();
                break;
            }
        }
    }

    public static void storeMenu()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Options: "); 
        System.out.println("--------------------------------"); 
        System.out.println("1. See a media’s details"); 
        System.out.println("2. Add a media to cart"); 
        System.out.println("3. Play a media"); 
        System.out.println("4. See current cart"); 
        System.out.println("0. Back"); 
        System.out.println("--------------------------------"); 
        System.out.println("Please choose a number: 0-1-2-3-4"); 

        int i = input.nextInt();

        switch(i)
        {
            case 1:
            {
                mediaDetailsMenu();
                break;
            }
        }
    }

    public static void mediaDetailsMenu()
    { 
        Scanner input = new Scanner(System.in);

        System.out.println("Options: ");      
        System.out.println("--------------------------------");       
        System.out.println("1. Add to cart");       
        System.out.println("2. Play");       
        System.out.println("0. Back");        
        System.out.println("--------------------------------");       
        System.out.println("Please choose a number: 0-1-2"); 

        int i = input.nextInt();

        switch(i)
        {
            case 1:
            {
                cartMenu();
            }
        }
        
    } 

    public static void cartMenu()
    { 
        System.out.println("Options: ");    
        System.out.println("--------------------------------");   
        System.out.println("1. Filter medias in cart");   
        System.out.println("2. Sort medias in cart"); 
        System.out.println("3. Remove media from cart"); 
        System.out.println("4. Play a media"); 
        System.out.println("5. Place order"); 
        System.out.println("0. Back"); 
        System.out.println("--------------------------------"); 
        System.out.println("Please choose a number: 0-1-2-3-4-5"); 
        } 
}