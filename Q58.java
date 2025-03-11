/*
A
AB
ABC
ABCD
ABCDE
*/

import java.util.Scanner;
class Q58{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Character:");
        char n=s.next().charAt(0);
        for(int i=65;i<=n;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char)j);
            }
            System.out.print("\n");
        }
    }
}