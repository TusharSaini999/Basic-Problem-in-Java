/// 999999999
/// 7777777
/// 55555
/// 333
/// 1

import java.util.Scanner;
class Q98{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Odd No: ");
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            if(i%2!=0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}