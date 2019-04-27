class Solution {
    public int numJewelsInStones(String J, String S) {
        int j = J.length();
        Set<Character> set = new HashSet();
        for(int m = 0 ; m < j ; m ++){
            set.add(J.charAt(m));
        }
        int k = S.length();
        int re = 0;
        for(int n = 0 ; n < k ; n ++){
            if(set.contains(S.charAt(n)))
                re ++;
        }
        return re;
    }
}