/*
E
ED
EDC
EDCB
EDCBA
EDCB
EDC
ED
E
*/
package Patterns;
import java.util.Scanner;
class Q108{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        int i=1;
        int flag=0;
        int c=n;

        while(i!=0){

            for(int j=1;j<=i;j++){
                System.out.print((char)(c+64));
                c--;
            }
            c=n;
            System.out.println();
            if(i<n && flag==0){
                i++;
            }
            else{
                flag=1;
                i--;
            }
        }
    }
}