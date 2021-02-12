class Solution {
    public String toLowerCase(String str) {
        //return str.toLowerCase(); or
        StringBuilder ans=new StringBuilder();
        for(char ch: str.toCharArray()){
            if(ch>=65 && ch<97){
                ans.append((char)(ch+32));
                
            }
            else{
                ans.append(ch);
            }
            
        }
        return ans.toString();
    }
}
