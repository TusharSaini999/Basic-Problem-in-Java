///WAP to check a given point within a window, window contained four points like (x1,y1) (x2,y2)
/// (x3,y3) (x4,y4).
///xmin=(x1,x2,x3,x4)
///xmax=(x1,x2,x3,x4)
///ymin=(y1,y2,y3,y4)
///xmax=(y1,y2,y3,y4)
///x and y is point
///if (xmin < x < xmax) AND (ymin < y < ymax)
package NumberOperations;
import java.util.Scanner;
class Q9{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        float x1,y1,x2,y2,x3,y3,x4,y4,x,y;
        System.out.println("Enter a Screen Points:");
        System.out.print("Enter a (X1,Y1) : ");
        x1=s.nextFloat();
        y1=s.nextFloat();
        System.out.print("Enter a (X2,Y2) : ");
        x2=s.nextFloat();
        y2=s.nextFloat();
        System.out.print("Enter a (X3,Y3) : ");
        x3=s.nextFloat();
        y3=s.nextFloat();
        System.out.print("Enter a (X4,Y4) : ");
        x4=s.nextFloat();
        y4=s.nextFloat();

        System.out.print("Enter a Point:");
        x=s.nextFloat();
        y=s.nextFloat();

        //logic
        float minx=min(x1,x2,x3,x4);
        float maxx=max(x1,x2,x3,x4);

        float miny=min(y1,y2,y3,y4);
        float maxy=max(y1,y2,y3,y4);
        if((minx<x) && (x<maxx) && (miny<y) && (y<maxy)) {
            System.out.println("Point in Windows");
        }
        else{
            System.out.println("Point not in Windows");
        }
    }
    static float max(float a,float b,float c,float d){
        float maxno=a;
        if(maxno<b){
            maxno=b;
        }
        if(maxno<c){
            maxno=c;
        }
        if(maxno<d){
            maxno=d;
        }
        return maxno;
    }
    static float min(float a,float b,float c,float d){
        float minno=a;
        if(minno>b){
            minno=b;
        }
        if(minno>c){
            minno=c;
        }
        if(minno>d){
            minno=d;
        }
        return minno;
    }
}