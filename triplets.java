import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class triplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] a = new int[2];
       // System.out.println(""+a0+a1+a2+b0+b1+b2);
        System.out.println(""+a0+b0);
        if(a0 > b0)
            System.out.println("0:"+a[0]+a[1]+(++(a[0])));
        else
            System.out.println(++(a[1]));

        System.out.println(""+a1+b1+a[0]+a[1]);
        if(a1 > b1)
            System.out.println(++(a[0]));
	if(a1 == b1)
            System.out.println("same"+a[0]+a[1]);
        else
            System.out.println(++(a[1]));

        System.out.println(""+a2+b2+a[0]+a[1]);
        if(a2 > b2)
            System.out.println(++(a[0]));
        else
            System.out.println(++(a[1]));
        
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        //System.out.println(""+a0+a1+a2+b0+b1+b2);
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
