/// E E E E E
/// DDDD
/// CCC
/// BB
/// A

import java.util.Scanner;
class Q100{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i+64));
                if(i==n||i==1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}