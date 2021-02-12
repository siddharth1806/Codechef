class Solution {
    public int maxDepth(String s) {
        int count=0;
        int l=0;
        int r=0;
        if(s.length()==1){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                l++;
            }
            else if(s.charAt(i)==')'){
                l--;
            }
            r=Math.max(l,r);
        }
        return r;
        
    }
}
