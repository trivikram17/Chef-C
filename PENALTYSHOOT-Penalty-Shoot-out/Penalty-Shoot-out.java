import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x==y)
		    {
		        System.out.println("Yes");
		    }
		    else if(y>x)
		    {
		        if((y-x)<=2)
		        {
		            System.out.println("Yes");
		        }
		        else
		        {
		            System.out.println("No");
		        }
		    }
		    else if(y<x)
		    {
		        if((x-y)<=1)
		        {
		            System.out.println("Yes");
		        }
		        else
		        {
		            System.out.println("No");
		        }
		    }
		}

	}
}