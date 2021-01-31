class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            
                al.add(index[i],nums[i]);
        
        }
        Object o[]=al.toArray();
        int arr[]=new int[o.length];
        for(int i=0; i<o.length; i++){
         arr[i] = (int) o[i];
      }
        return arr;
    }
}
