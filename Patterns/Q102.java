/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
package Patterns;
import java.util.Scanner;
class Q102{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        int i=1;
        int c=0;
        while(i!=0){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                if(j!=i){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            if(i<n && c==0){
                i++;
            }
            else{
                c=1;
                i--;
            }
        }
    }
}