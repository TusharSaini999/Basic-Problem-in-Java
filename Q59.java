/*
11111
2222
333
44
5
*/

import java.util.Scanner;
class Q59{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        int x=1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(x);
            }
            x++;
            System.out.print("\n");
        }
    }
}