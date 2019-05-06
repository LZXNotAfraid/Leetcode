class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0 ; i < A.length ; i ++){
            for(int j = 0 ; j < (A[0].length + 1) / 2 ; j ++){
                if(j != (A[0].length - 1 - j)){
                    if(A[i][j] == 1 && A[i][A[0].length - 1 - j] == 1){
                        A[i][j] = 0;
                        A[i][A[0].length - 1 - j] = 0;
                    }else if(A[i][j] == 1 && A[i][A[0].length - 1 - j] == 0){
                        A[i][j] = 1;
                        A[i][A[0].length - 1 - j] = 0;
                    }else if(A[i][j] == 0 && A[i][A[0].length - 1 - j] == 1){
                        A[i][j] = 0;
                        A[i][A[0].length - 1 - j] = 1;
                    }else{
                        A[i][j] = 1;
                        A[i][A[0].length - 1 - j] = 1;
                    }
                }else{
                    A[i][j] = A[i][j] == 0 ? 1:0;
                }
            }
        }
        return A;
    }
}
