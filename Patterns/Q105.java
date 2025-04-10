/*
5
54
543
5432
54321
5432
543
54
5
*/
package Patterns;
import java.util.Scanner;
class Q105{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        int i=1;
        int flag=0;
        while(i!=0){
            for(int j=1;j<=i;j++){
                System.out.print((n+1)-j);
            }
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