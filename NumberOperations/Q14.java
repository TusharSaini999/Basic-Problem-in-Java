///WAP to print the following
/// 10,11,12,1  SUMMER
/// 2,3,4,5  SPRING
/// 6,7,8,9  RAINING
package NumberOperations;
import java.util.Scanner;
class Q14{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Enter a Month: ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();

        if((a<1) || (a>12) || (b<1) || (b>12)||(c<1) || (c>12)||(d<1) || (d>12)){
            System.out.println("Enter no in 1 to 12");
        } else if ((a==10)&&(b==11)&&(c==12)&&(d==1)) {
            System.out.println("SUMMER");
        }
        else if ((a==2)&&(b==3)&&(c==4)&&(d==5)) {
            System.out.println("SPRING");
        }
        else if ((a==6)&&(b==7)&&(c==8)&&(d==9)) {
            System.out.println("RAINING");
        }
        else {
            System.out.println("Wronge Month");
        }
    }
}