/// 54321
/// 4321
/// 321
/// 21
/// 1
package Patterns;
import java.util.Scanner;

class Q64 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n = s.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}