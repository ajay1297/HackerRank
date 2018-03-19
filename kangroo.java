import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class kangroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
	long n = 10000;
	long count = 0;
	String s = "YES";
	for(int i = 0 ; i < n ;i++)
	{
		x1 = x1 + v1;
		x2 = x2 + v2;
		if(x1 == x2)
		{
			count++;
		}
	}
	if(count > 0) 
		return "YES";
	else
		return"NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
