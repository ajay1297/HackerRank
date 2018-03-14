import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class timeconv {

    static String timeConversion(String s) {
        // Complete this function
	int t=0;
	String i , j ;
	String s2="" , x;
	String s3="";
	i = s.substring(0,2);
	j = s.substring(8,10);
	int num = Integer.parseInt(i);
	//System.out.println("i:"+i);
	//System.out.println("j:"+j);
	//System.out.println(num);
	//System.out.println(j.equals("AM"));
	if(j.equals("AM") & i.equals("12"))
	{
		s2 = s.replaceAll("12","00");
		s3 = s2.replaceAll("AM","");
		//System.out.println(s2);
	}
	else if(j.equals("AM"))
	{
		s2 = s.replaceAll("12","12");
		s3 = s2.replaceAll("AM","");
	}
	else if(j.equals("PM") & i.equals("12"))
	{
		s2 = s.replaceAll("12","12");
		s3 = s2.replaceAll("PM","");
		//System.out.println(s2);
	}
	else if(j.equals("PM"))
	{
		t = num + 12;
		//System.out.println(t);
		x = Integer.toString(t);
		//System.out.println(x);
		s2 = s.replaceFirst(i,x);
		//System.out.println(s2);
		s3 = s2.replaceAll("PM","");
	}
	return s3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

