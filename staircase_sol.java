import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class staircase_sol {

    static void staircase(int n) {
        // Complete this function
	int temp = n;
	int i,j,k;
        for(i=0;i<n;i++)
        {
            for(j=temp-1;j>0;j--)
            {
                System.out.print(" ");
            }
	    for(k=temp;k<=n;k++)
	    {
		System.out.print("#");
	    }
	    if(j==0){System.out.print("\n");}		
	temp--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
