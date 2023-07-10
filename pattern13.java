/*
       1
      1 2
     1 2 3
    1 2 3 4
   1 2 3 4 5
    1 2 3 4
     1 2 3
      1 2
       1
 */

import java.util.Scanner;
public class pattern13 {
    public static void main(String[] args) {
        int n,i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=n;j>i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(i=1;i<n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(k=1;k<n-i+1;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
