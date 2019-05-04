class Solution {
    
    String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};   
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<String>();
        for(int i = 0 ; i < words.length ; i ++){
            set.add(getCode(words[i]));
        }
        return set.size();
    }
    
    public String getCode(String in){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < in.length() ; i ++){
           sb.append(code[in.charAt(i) - 97]);
        }
        return sb.toString();
    }
}