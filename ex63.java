
import java.util.Scanner;

public class ex63 {

    public static void main(String args[])
    {


        java.util.Scanner scanner = new Scanner(System.in);


        int i, j, k1, k2, n;

        System.out.println("Enter the height of triangle");
        n = scanner.nextInt();
        System.out.println("Result:");

        k1 = n - 1;
        k2 = 1;

        for(i = 0; i < n; i ++)
        {
            for(j = k1 - 1 ; j >= 0; j--)
            {
                System.out.print(" ");
            }
            for(j = 0; j < k2; j++)
            {
                System.out.print("*");
            }
                System.out.print("\n");
                
                k1 = k1 -1;
                k2 = k2 +2;
        }


    }
    

    
}
