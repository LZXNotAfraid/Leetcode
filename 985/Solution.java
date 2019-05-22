class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int n = 0;
        int[] re = new int[queries.length];
        for(int i = 0 ; i < A.length ; i ++){
            if(A[i] % 2 == 0)
                n += A[i];
        }
        int index = 0;
        int value = 0;
        for(int i = 0 ; i < A.length ; i ++){
            index = queries[i][1];
            value = queries[i][0];
            
            if(A[index] % 2 == 0){
                if(value % 2 == 0){
                    n += (value);
                }else{
                    n -= A[index];
                }
            }else{
                if(value % 2 != 0){
                    n += (A[index] + value);
                }
            }
            A[index] += value;
            re[i] = n;
            //System.out.println(Arrays.toString(A));
        }
        return re;
    }
}
