/// 1
/// 121
/// 12321
/// 1234321
/// 123454321
package Patterns;
import java.util.Scanner;
class Q93{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            int j=1;
            int c=1;
            while (j != 0) {
                System.out.print(Math.abs(j));
                if (j < i && c==1) {
                    ++j;
                } else {
                    c=0;
                    --j;
                }
            }
            System.out.println();
        }
    }
}