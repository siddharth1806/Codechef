/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
     void leftRotate(int arr[], int steps, int n)
    {
        for (int i = 0; i < steps; i++)
            leftRotatebyOne(arr, n);
    }
    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		GFG rotate=new GFG();
		int t=sc.nextInt();
		while(t-->0){
		    
		
		    int size=sc.nextInt();
		    int steps=sc.nextInt();
		    int arr[]=new int[size];
		    for(int i=0;i<arr.length;i++){
		        arr[i]=sc.nextInt();
		    }
		   
		rotate.leftRotate(arr,steps,size);    
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i] + " ");
	}
	System.out.println();
		    
		}
	}
	}

