/// 5
/// 54
/// 543
/// 5432
/// 54321
package Patterns;
import java.util.Scanner;

class Q95{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            int cout=n;
            for(int j=1;j<=i;j++){
                System.out.print(cout--);
                if(j==i){
                    System.out.println();
                }
            }
        }
    }
}