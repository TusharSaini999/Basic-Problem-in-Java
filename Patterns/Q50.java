/// 1 1 1 1 1
/// 2 2 2 2 2
/// 3 3 3 3 3
/// 4 4 4 4 4
/// 5 5 5 5 5
package Patterns;
import java.util.Scanner;
class Q50{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Noo: ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
                if (j != n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}