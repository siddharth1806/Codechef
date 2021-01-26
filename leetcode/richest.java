class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        
        int sumrow=0;
        int colsum=0;
        
        for(int i=0;i<n;i++)
        {
            sumrow=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sumrow=sumrow+accounts[i][j];
                
            }
              if(sumrow>colsum)
        {
            colsum=sumrow;
        }
        }
      
        return colsum;
        
    }
}
