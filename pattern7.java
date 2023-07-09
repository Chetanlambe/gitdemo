import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        n = sc.nextInt();
        for (i = 1; i<=n; i++) {
            for (j=i; j>=1; j--)
                System.out.print(j);
            System.out.println();
        }
    }

}
