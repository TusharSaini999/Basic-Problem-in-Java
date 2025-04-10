/*
1
12
123
1234
12345
1234
123
12
1
*/
package Patterns;
import java.util.Scanner;
class Q101{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        int i=1;
        int c=0;
        while(i!=0){
            for(int j=1;j<=i;j++){
                System.out.print(j);
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