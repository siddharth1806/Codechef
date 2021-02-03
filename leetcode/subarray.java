class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j=j+2)
            {
                for(int k=i;k<=j;k++)
                {
                    c=c+arr[k];
                }
            }
        }
        return c;
     
    }
}
