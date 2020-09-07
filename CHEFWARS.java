
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int darthp=sc.nextInt();
		    int chefp=sc.nextInt();
            
		  while(chefp>0 && darthp>0 )
		  {
		        darthp=darthp-chefp;
		        chefp=chefp/2;
		    
		        
		   }    
		      if(darthp>chefp)
		      {
		        System.out.println(0);
		      }
		      else
		      {
		            System.out.println(1);
		      }
		       
		}
	}
}
