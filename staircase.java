import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class staircase {

    static void staircase(int n) {
        // Complete this function
	int temp = n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<temp-1;j++)
            {
                   System.out.println("#");
            }
	temp--;
	System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
