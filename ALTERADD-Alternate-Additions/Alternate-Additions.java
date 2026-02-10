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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    
		    while(a<b){
		        if(a%2==0){
		            a=a+2;
		        }else{
		            a=a+1;
		        }
		    }
		    if(a==b){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}

	}
}
