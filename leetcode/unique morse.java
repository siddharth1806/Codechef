class Solution {
   String[] ans = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word: words){
            String s = "";
            for(char c: word.toCharArray())
                s += ans[c - 'a'];  
            set.add(s);
        }
        return set.size();
    }
}
