class Solution {
    public int largestAltitude(int[] gain) {
        int start =0;int max=0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<gain.length;i++)
        {
            al.add(start);
            start=start+gain[i];
            if(max<start)
            {
                max=start;
            }
        }
        
        return max;
    }
}
