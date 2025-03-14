/// 1
/// 222
/// 33333
/// 4444444
/// 555555555

import java.util.Scanner;
class Q79{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        for(int i=1;i<=n*2;i++){
           if(i%2!=0) {
               for (int j = 1; j <= i; j++) {
                   System.out.print((i/2)+1);
               }
               System.out.println();
           }
        }
    }
}