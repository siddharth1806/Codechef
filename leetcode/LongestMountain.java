class Solution {
    public int longestMountain(int[] arr) {
        int longest = 0;
        int startIndex = 0;
        int endIndex = arr.length - 1;
                
        for(int i = 1; i < endIndex; i++) {
            int topIndex = i;
            int leftIndex = i - 1;
            int rightIndex = i + 1;
            
            if(arr[leftIndex] >= arr[topIndex] || arr[rightIndex] >= arr[topIndex]) {
                continue;
            }
            
            while(leftIndex != startIndex && arr[leftIndex] > arr[leftIndex - 1]) {
                leftIndex--;
            }
            
            while(rightIndex != endIndex && arr[rightIndex] > arr[rightIndex + 1]) {
                rightIndex++;
            }
            
            longest = Math.max(longest, rightIndex - leftIndex + 1);
        }
        return longest;
        
    }
}
