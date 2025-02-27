///WAP to check enter character is vowel or not.
///check all vowel
import java.util.Scanner;
class Q12{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        char n;
        System.out.print("Enter a Char: ");
        n=s.next().charAt(0);
        if((n=='a')||(n=='e')||(n=='o')||(n=='u')||(n=='i')){
            System.out.println("Char is Vowel");
        } else {
            System.out.println("Char is not Vowel");
        }
    }
}