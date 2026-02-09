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
		    int x1=sc.nextInt();
		    int x2=sc.nextInt();
		    int y1=sc.nextInt();
		    int y2=sc.nextInt();
		    int z1=sc.nextInt();
		    int z2=sc.nextInt();
		    
		    if(x2>=x1 && y2 >= y1 && z2 <=z1){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		    
		}

	}
}
