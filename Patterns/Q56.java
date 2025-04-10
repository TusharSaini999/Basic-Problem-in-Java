/*
E D C B A
E D C B A
E D C B A
E D C B A
E D C B A
*/
package Patterns;
import java.util.Scanner;
class Q56{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Character:");
        char n=s.next().charAt(0);
        char temp=n;
        for(int i=n;i>=65;i--){
            for(int j=n;j>=65;j--){
                System.out.print(temp);
                if(j!=1){
                    System.out.print(" ");
                }
                temp--;
            }
            temp=n;
            System.out.print("\n");
        }
    }
}