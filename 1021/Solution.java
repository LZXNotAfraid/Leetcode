class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int last_left = -1;
        int count = 0;
        for(int i = 0 ; i < S.length() ; i ++){
            if(S.charAt(i) == '('){
                count ++;
            }else{
                count --;
            }
            if(count == 0){
                sb.append(S.substring(last_left + 2, i));
                last_left = i;
            }
        }
        return new String(sb);
    }
}