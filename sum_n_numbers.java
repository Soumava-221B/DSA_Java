import java.util.Scanner;

public class sum_n_numbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, i, sum = 0;
        System.out.print("Enter the n number upto which you want to find the sum: ");
        n = sc.nextInt();
        for (i=1; i<=n; i++)
            sum = sum + i;
        System.out.println("Sum of the n numbers is: "+sum);

        // for (i=1; i<=n; i++)
        //     for (j=1; j<=i; j++)
        //         sum++;
    }
}