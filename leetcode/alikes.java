class Solution {
    public boolean halvesAreAlike(String s) {
   int c=0,r=0;String s1="aeiouAEIOU";
        for(int i=0;i<s.length()/2;i++){
            if(s1.contains(String.valueOf(s.charAt(i)))){
                c++;
            }
        }
         for(int i=s.length()/2;i<s.length();i++){
            if(s1.contains(String.valueOf(s.charAt(i)))){
                r++;
            }
        }
        if(c==r){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}
