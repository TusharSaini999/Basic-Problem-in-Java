/*
E E E E E
D D D D D
C C C C C
B B B B B
A A A A A
*/
package Patterns;
import java.util.Scanner;
class Q55 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Character:");
        char n=s.next().charAt(0);
        int temp=n;
        for(int i=n;i>=65;i--){
            for(int j=temp;j>=65;j--){
                System.out.print(n);
                if(j!=1){
                    System.out.print(" ");
                }
            }
            n--;
            System.out.print("\n");
        }
    }
}