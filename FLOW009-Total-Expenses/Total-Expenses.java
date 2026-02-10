import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- >0){
		    double q=sc.nextInt();
		    double p=sc.nextInt();
		    double to=p*q;
		    
		    if(q>1000){
		        to=to-to*0.1;
		    }
		    
		    System.out.printf("%.6f\n", to);
		    
		    
		    
		}

	}
}
