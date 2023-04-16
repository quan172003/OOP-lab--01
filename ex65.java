import java.util.Scanner;

public class ex65 {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int n, i, j;

    System.out.println("Enter the number:");
    n = scanner.nextInt();

    int a[] = new int[n];
    int b[] = new int[n];
    int c[] = new int[n];

    for(i = 0; i< n; i++){
        a[i] = scanner.nextInt();
    }
    for(i = 0; i< n; i++){
        b[i] = 0;
    }

    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n; j++)
        {
            if(a[i] >= a[j])
            {
                b[i]++;
            }
        }  
        b[i]--;    
    }

    for(i = 0; i < n; i++)
    {
        c[b[i]] = a[i];
    }

    for(i = 0; i < n; i++)
    {
        System.out.print(c[i] + " ");
    }

}
}
