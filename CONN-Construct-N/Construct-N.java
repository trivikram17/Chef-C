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
		    int n=sc.nextInt();
		    int i,j;
		    boolean possible=false;
		    for(i=0;i<n;i++){
		        for(j=0;j<n;j++){
		            if((2*i) + (7*j)==n ){
		                possible=true;
		                break;
		            }
		            
		        }
		    }
		    if(possible){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}

	}
}
