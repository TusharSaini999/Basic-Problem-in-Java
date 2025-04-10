/// 1234567
/// 123456
/// 12345
/// 1234
/// 123
/// 12
/// 1
package Patterns;
import java.util.Scanner;
class Q99{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
        }
    }
}