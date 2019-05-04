class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0 ; i < A.length ; i ++){
            if(s.contains(A[i]))
                return A[i];
            else
                s.add(A[i]);
        }
        return 0;
    }
}