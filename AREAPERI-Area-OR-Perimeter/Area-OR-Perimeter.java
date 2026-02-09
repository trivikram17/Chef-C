import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		
		if(l*b > 2*(l+b)){
		    System.out.println("Area"+"\n"+l*b);
		}else if(l*b < 2*(l+b)){
		    System.out.println("Peri"+"\n"+2*(l+b));
		}else{
		    System.out.println("Eq");
		}

	}
}
