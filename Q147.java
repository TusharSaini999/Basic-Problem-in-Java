///WAP to print the following Series:
/// 1 +7 + 12 + 19+ 25+ 33………..
import java.util.Scanner;
class Q147{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        if(n<1){
            System.out.println("No is less then 1");
            return;
        }
        int c=1;
        int p1=6;
        int p2=5;
        int flag=0;
        System.out.print(c);
        for(int i=1;i<n;i++){
            System.out.print(" + ");
            if(flag==0){
                c+=p1;
                System.out.print(c);
                flag=1;
                p1++;
            }
            else {
                c+=p2;
                System.out.print(c);
                flag=0;
                p2++;
            }
        }
    }
}