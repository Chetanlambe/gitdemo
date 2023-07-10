import java.util.Scanner;
public class pattern12 {
    public static void main(String[] args) {
        int n,i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=n-i+1;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
