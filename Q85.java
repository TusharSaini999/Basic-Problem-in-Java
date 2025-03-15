/// 1
/// 123
/// 12345
/// 1234567
/// 123456789

import java.util.Scanner;
class Q85{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}