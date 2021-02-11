class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
          boolean flag=true;
        int count=0;
        for(int i=0;i<words.length;i++){
            flag = true;
            String s=words[i];
            for(int j=0;j<s.length();j++){
                if(!(allowed.contains(String.valueOf(s.charAt(j))))){
                    flag=false;
                }
                
    
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}
