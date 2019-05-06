class Solution {
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while(left < right){
            if(A[left] % 2 == 0){
                left ++;
            }else{
                if(A[right] % 2 == 0){
                    int t = A[right];
                    A[right] = A[left];
                    A[left] = t;
                }else{
                    right --;
                }
            }
        }
        return A;
    }
}
