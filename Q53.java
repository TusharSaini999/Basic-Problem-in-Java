/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/

import java.util.Scanner;
class Q53 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                System.out.print(j);
                if(j!=1){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}