package lab1;
import java.util.Scanner;

public class ex66 {
    
    public static void main(String args[]){
        int a, b, i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of colum's matrix : ");
        a = scanner.nextInt();
        System.out.print("Enter the number of row's matrix : ");
        b = scanner.nextInt();

        int m[][] = new int[a][b];

        System.out.println("Enter the matrix 1");
        for(i = 0; i < b; i++)
        {
            for(j = 0; j < a; j++)
            {
                m[j][i] = scanner.nextInt();
            }
        }
        System.out.println("Enter the matrix 2");
        int n[][] = new int[a][b];

        for(i = 0; i < b; i++)
        {
            for(j = 0; j < a; j++)
            {
                m[j][i] = scanner.nextInt();
            }
        }

        int p[][] = new int[a][b];
        for(i = 0; i < b; i++)
        {
            for(j = 0; j < a; j++)
            {
                p[j][i] = m[j][i] + n[j][i];
            }
        }

        System.out.println("Result:");
        for(i = 0; i < b; i++)
        {
            for(j = 0; j < a; j++)
            {
                System.out.print(p[j][i]+" ");
            }
            System.out.print("\n");
        }
    }
}
