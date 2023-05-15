package lab1;
import java.util.Scanner;

public class ex64 {
    
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int j, k;

        int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Enter month");
        j = scanner.nextInt();

        System.out.println("Enter year:");
        k = scanner.nextInt();

        if(j == 2)
        {
            if(((k % 4 == 0)&&(k % 100 != 0))||(k % 400 == 0))
            {
                System.out.println(j +"-"+ k+ " has 29 days" );
            }
            else{
                System.out.println(j +"-"+ k+ " has 28 days" );
            }
        }
        else{
            System.out.println(j +"-"+ k+ " has " +a[j-1] +" days" );
        }
        
        
    }
}
