///WAP to Find the union and intersection of two given array.
/// Sets always store unique values where union and intersection are Perform
import java.util.Arrays;
import java.util.Scanner;

class Q130{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Size of Array 1: ");
        int n1=s.nextInt();
        int[] arr1 =new int[n1];
        System.out.print("Enter a Element:");
        for(int i=0;i<n1;i++){
            arr1[i]=s.nextInt();
        }

        System.out.print("Enter a Size of Array 2: ");
        int n2=s.nextInt();
        int[] arr2 =new int[n2];
        System.out.print("Enter a Element:");
        for(int i=0;i<n2;i++){
            arr2[i]=s.nextInt();
        }
        union(arr1,arr2);
    }
    private static void union(int []arr1,int []arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[] newarr =new int[n1+n2];
        int[] newptr =new int[n1+n2];
        int po=0;
        int ind=0;
        for(int i=0;i<n1;i++){
            newarr[ind++]=arr1[i];
        }
        for(int i=0;i<n2;i++){
            int flag=0;
            for(int j=0;j<ind;j++){
                if(arr2[i]==newarr[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                newarr[ind++]=arr2[i];
            }
            else{
                newptr[po++]=arr2[i];
            }
        }
        System.out.println();
        System.out.print("Union Array:");
        for (int i: (Arrays.copyOf(newarr,ind))){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Intersection Array:");
        for (int i:(Arrays.copyOf(newptr,po))){
            System.out.print(i+" ");
        }
    }
}