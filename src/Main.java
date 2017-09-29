import java.util.*;
public class Main {

    public static void main(String[] args) {
        int a,b,c,d,e;
        int x,y;
        Scanner input = new Scanner(System.in);
        x=input.nextInt();
        y=input.nextInt();
        System.out.printf("%d+%d=%d\n",x,y,x+y);
        System.out.printf("%d-%d=%d\n",x,y,x-y);
        System.out.printf("%d*%d=%d\n",x,y,x*y);
        System.out.printf("%d/%d=%d...%d",x,y,x/y,x%y);
        input.close();


    }
}
