//WAP to check array elements are prime or not.
package ArrayOperations;
import java.util.Scanner;
class Q113{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i:arr){
            if(i==1 || i<=0){
                System.out.print(i+" is not Prime Number");
            }
            else{
                int flag=0;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println(i+" is a Prime Number ");
                }
                else {
                    System.out.println(i+" is not a Prime Number");
                }
            }
        }


    }
}