/*WAP to find the rating of a movie. e.g
takes a No of Human and takes a rating after last print the rating with count
 *     5
 **    7
 ***   2
 ****  8
 ***** 10
 */
package ArrayOperations;
import java.util.Scanner;
class Q120{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Entre a No of Human");
        int size=s.nextInt();
        int[] arr =new int[size];
        int []star=new int[5];
        for(int i=0;i<size;i++){
            System.out.print("Hey ! Enter a Rating in Star (1 Star to 5 Star) :");
            int x=s.nextInt();
            if(x<1 || x>5){
                System.out.println("Wronge Rating");
                break;
            }
            star[(x-1)]++;
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j<=i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.println(star[i]);
        }
    }
}
