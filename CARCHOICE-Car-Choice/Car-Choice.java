import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int x1=sc.nextInt();
		    int x2=sc.nextInt();
		    int y1=sc.nextInt();
		    int y2=sc.nextInt();
		    
		    if(y1/x1 > y2/x2){
		        System.out.println(1);
		    }else if (y1/x1 < y2/x2){
		        System.out.println(-1);
		        
		    }else{
		        System.out.println(0);
		    }
		    
		}
		

	}
}
