/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 */
package Patterns;
import java.util.Scanner;
class Q104{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        int i=1;
        int c=0;
        while(i!=0){
            for(int j=1;j<=i;j++){
                System.out.print("*");
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