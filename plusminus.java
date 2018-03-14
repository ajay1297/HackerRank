import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class plusminus {

    static void plusMinus(int[] arr,int n) {
        // Complete this function
        double neg=0,pos=0,zero=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
                neg++;
            if(arr[i]==0)
                zero++;
            if(arr[i]>0)
                pos++;
        }
        double frac1 = pos/n;
        double frac2 = neg/n;
        double frac3 = zero/n;
	System.out.println(frac1);
	System.out.println(frac2);
	System.out.println(frac3);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr,n);
        in.close();
    }
}

