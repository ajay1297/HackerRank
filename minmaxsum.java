import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class minmaxsum {

    static void miniMaxSum(int[] arr) {
        // Complete this function
	long val=0;
	long[] arr1 = new long[5];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
	    {
		if(j == i)
			continue;
		else
			val += arr[j];
	    }
	    arr1[i] = val;
	    val = 0;
        }
	for(int k=0;k<5;k++)
	{
		System.out.println(arr1[k]);
	}
	Arrays.sort(arr1);
	System.out.println(arr1[4]+" "+arr1[0]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}

