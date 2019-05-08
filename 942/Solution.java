class Solution {
    public int[] diStringMatch(String S) {
        int[] A = new int[S.length() + 1];
        
        int count_d = 0;
        for(int i = 0 ; i < S.length() ; i ++){
            if(S.charAt(i) == 'D')
                count_d ++;
        }
        A[0] = count_d;
        int left = count_d - 1;
        int right = count_d + 1;
        for(int i = 0 ; i < S.length() ; i ++){
            A[i + 1] = S.charAt(i) == 'I' ? right ++ : left --;
        }
        return A;
    }
}
