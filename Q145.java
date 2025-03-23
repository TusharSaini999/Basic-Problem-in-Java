///WAP to find the sum of following series to nth terms.
/// 1 / 2 + 1/ 22 + 1 / 23 +…………….
import java.util.Scanner;
class Q145{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int flag=0;
        int no=2;
        System.out.print("1/"+2);
        int c=2;
        for(int i=2;i<=n;i++){
            System.out.print(" + ");
            if(flag==0){
                no=(no*10)+c;
                System.out.print("1/"+no);
                flag=1;
                c++;
            }
            else {
                no+=1;
                System.out.print("1/"+no);
                flag=0;
            }
        }
    }
}