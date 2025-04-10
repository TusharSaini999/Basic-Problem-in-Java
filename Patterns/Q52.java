///A B C D E
///A B C D E
///A B C D E
///A B C D E
///A B C D E
package Patterns;
import java.util.Scanner;

class Q52{
    public static void main(String[]arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No :");
        int n=s.nextInt();
        char c=65;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c);
                c++;
                if(j!=n-1){
                    System.out.print(" ");
                }
            }
            c=65;
            System.out.println();
        }
    }
}