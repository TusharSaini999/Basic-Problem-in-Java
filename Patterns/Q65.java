/// 54321
/// 5432
/// 543
/// 54
/// 5
package Patterns;
import java.util.Scanner;

class Q65 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}