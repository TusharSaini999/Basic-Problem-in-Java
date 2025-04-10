/// *
/// * *
/// * * *
/// * * * *
/// * * * * *
package Patterns;
import java.util.Scanner;
class Q43{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(i!=j){
                    System.out.print(" ");
                }
                if(i==j){
                    System.out.print("\n");
                }
                else{
                    System.out.print("*");
                }
            }
        }
    }
}