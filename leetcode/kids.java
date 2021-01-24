class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> al=new ArrayList<Boolean>();
        int arr[]=new int[candies.length];
        arr=Arrays.copyOf(candies,candies.length);
        int max=0;
        Arrays.sort(candies);
        max=candies[candies.length-1];
        for(int i=0;i<arr.length;i++){
                
            
                if(max<=extraCandies+arr[i]){
                    al.add(true);}
                else{
                    al.add(false);}
        }
        return al;
        
    }
}
