import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dia {

    static int diagonalDifference(int[][] a,int n) {
        // Complete this function
        int sum1=0;
        int sum2=0;
	int temp = n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum1 = sum1 + a[i][j];
			
                }
                if(j==temp-1)
                {
                    sum2 = sum2 + a[i][j];
                    temp--;
                }
            }
        }
                    System.out.println(sum2);
        return Math.abs(sum1-sum2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a,n);
        System.out.println(result);
        in.close();
    }
}

