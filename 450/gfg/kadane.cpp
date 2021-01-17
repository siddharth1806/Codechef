// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


 // } Driver Code Ends


// Function to find subarray with maximum sum
// arr: input array
// n: size of array
int maxSubarraySum(int arr[], int n){
    int max=arr[0];
    int sum=max;
    for(int i=1;i<n;i++)
    {
        
        if(arr[i]+max>arr[i])
        {
            max=arr[i]+max;
        }
        else{
            max=arr[i];
        }
        if(max>sum)
    {
        sum=max;
    }
        
    }
    

        return sum;
    
    // Your code here
    
}

// { Driver Code Starts.

int main()
{
    int t,n;
    
    cin>>t; //input testcases
    while(t--) //while testcases exist
    {
        
        cin>>n; //input size of array
        
        int a[n];
        
        for(int i=0;i<n;i++)
            cin>>a[i]; //inputting elements of array
        
        cout << maxSubarraySum(a, n) << endl;
    }
}
  // } Driver Code Ends
