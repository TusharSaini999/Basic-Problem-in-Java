/// A
/// BBB
/// CCCCC
/// DDDDDDD
/// EEEEEEEEE

import java.util.Scanner;
class Q81{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        char c=s.next().charAt(0);
        int n=((int)c-64);
        for(int i=1;i<=n*2;i++){
            if(i%2!=0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print((char)((i/2)+65));
                }
                System.out.println();
            }
        }
    }
}