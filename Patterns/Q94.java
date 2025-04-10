/// A
/// ABA
/// ABCBA
/// ABCDCBA
package Patterns;
import java.util.Scanner;
class Q94{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            int j=1;
            int c=1;
            while (j != 0) {
                System.out.print((char)(Math.abs(j)+64));
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