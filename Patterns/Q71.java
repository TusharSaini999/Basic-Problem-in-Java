/// 5 5 5 5 5
/// 4 4 4 4
/// 3 3 3
/// 2 2
/// 1
package Patterns;
import java.util.Scanner;
class Q71{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
                if(i!=j){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}