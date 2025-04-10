/// 0
/// 101
/// 21012
/// 3210123
/// 432101234
package Patterns;
import java.util.Scanner;
class Q91{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j>=-i;j--){
                System.out.print(Math.abs(j));
            }
            System.out.println();
        }
    }
}