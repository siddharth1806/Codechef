class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
      //  Arrays.sort(arr2);
        int count=arr1.length;
        int dif=0;
        int m=0;
        for(int i:arr1){
            for(int j:arr2 ){
                dif=Math.abs(i-j);
                     if(dif<=d){
                            count--;
                        break;
                         }
                    
                   
            }
       
            
        }
        return count;
    }
}
