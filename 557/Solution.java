class Solution {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String d: a){
            sb.append(reverse(d) + " ");
        }
        String re = sb.toString();
        return re.substring(0, re.length() - 1);
    }
    
    public String reverse(String s){
        StringBuilder t = new StringBuilder(s);
        return t.reverse().toString();
    }
}
