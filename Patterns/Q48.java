/// 1
/// 2 3
/// 4 5 6
/// 7 8 9 10
/// 11 12 13 14 15
package Patterns;
import java.util.Scanner;
class Q48{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                c++;
                System.out.print(c);
                if(j!=i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}