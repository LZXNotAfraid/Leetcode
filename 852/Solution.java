class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int d = 1;
        for(; d < A.length - 1 ; d ++){
            if((A[d - 1] < A[d]) && (A[d] > A[d + 1]))
                return d;
        }
        return 0;
    }
}
