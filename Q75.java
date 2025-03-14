/// ABCDE
/// ABCD
/// ABC
/// AB
/// A

import java.util.Scanner;
class Q75{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Charecter:");
        char n=s.next().charAt(0);
        for(int i=(int)n;i>=65;i--){
            for (int j=65;j<=i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}