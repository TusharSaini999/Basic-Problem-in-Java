/// *
/// **
/// ***
/// ****
/// *****

import java.util.Scanner;

class Q39{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}