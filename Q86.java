/// 1
/// 1 2 3
/// 1 2 3 4 5
/// 1 2 3 4 5 6 7
/// 1 2 3 4 5 6 7 8 9

import java.util.Scanner;
class Q86{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                    if(i!=j){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}