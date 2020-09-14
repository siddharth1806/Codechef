/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int min = 7;
            int max = -1;
            for (int i = 0; i < n; i++) {
                int arr2[]=new int[n] ;
                arr2[i] = 1;
             
               int k;
                for (int j = i; j >= 0; j--) 
                {
                    if (arr[j] > arr[i])
                    {
                        arr2[j] = (arr2[i] | arr2[j]);
                    
                    }
                }
                for (int j = i; j >= 0; j--)
                    for (k = i; k < n; k++)
                    {

                        if (arr[j] > arr[k])
                        {
                            arr2[j] |= arr2[k];
                            arr2[k] |=arr2[j];
                            
                        }

                    }
                
                int sum = 0;
                for (int j = 0; j < n; j++) 
                {
                    sum += arr2[j];
        
                }
                if(sum>max)
                {
                    max=sum;
                }
                if(sum<min)
                {
                    min=sum;
                }

        }
            System.out.println(min + " " + max);
        }
            
        }
}
