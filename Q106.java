/*
5
45
345
2345
12345
2345
345
45
5
*/

import java.util.Scanner;
class Q106{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        int i=1;
        int flag=0;
        int c;
        while(i!=0){
            c=n+1-i;
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
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