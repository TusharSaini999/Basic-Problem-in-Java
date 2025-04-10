/// A
/// BAB
/// CBABC
/// DCBABCD
/// EDCBABCDE
package Patterns;
import java.util.Scanner;
class Q92{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j>=-i;j--){
                System.out.print((char)(Math.abs(j)+65));
            }
            System.out.println();
        }
    }
}