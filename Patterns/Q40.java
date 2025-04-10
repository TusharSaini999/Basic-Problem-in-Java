/// * * * * *
/// *       *
/// *       *
/// *       *
/// * * * * *
package Patterns;
import java.util.Scanner;

class Q40{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");

                }
                if(j!=n){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}