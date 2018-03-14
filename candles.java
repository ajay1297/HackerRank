import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class candles {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
	int p=1,k,i,j,temp;
	Arrays.sort(ar);
	for(i = 0;i<n;i++)
	{
		System.out.println(ar[i]);
	}
	temp = ar[n-1];
		System.out.println("--------------------"+temp);
	for(j=n-1;j>0;j--)
	{
		k = j-1;
		if(temp==ar[k])
		{
			//System.out.println(""+ar[j]+ar[k]);
			p++;
		}
	}	
	return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}

