class Solution {
    public int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        //return B;
        int min = 10000;
        int start = 0;
        for(int i = 0 ; i < A.length ; i ++){
            if(Math.abs(A[i] - 0) < min){
                min = Math.abs(A[i] - 0);
                start = i;
            }
        }
        System.out.println(start);
        int left = start - 1;
        int right = start + 1;
        B[0] = A[start] * A[start];
        int count = 1;
        while(left > -1 || right < A.length){
            /*if(Math.abs(A[left] - 0) == Math.abs(A[right - 0])){
                left --;
                B[count] = A[left] * A[left];
            }else if(Math.abs(A[left] - 0) > Math.abs(A[right - 0])){
                right ++;
                B[count] = A[right] * A[right];
            }else{
                left --;
                B[count] = A[left] * A[left];
            }*/
            if(left > -1 && right < A.length){
                if(Math.abs(A[left] - 0) > Math.abs(A[right - 0])){
                    System.out.println("居中且右边小");
                    B[count] = A[right] * A[right];
                    right ++;
                }else{
                    System.out.println("居中且左边小或等");
                    B[count] = A[left] * A[left];
                    left --;
                }
            }else if(left > -1 && right == A.length){
                System.out.println("右到头");
                B[count] = A[left] * A[left];
                left --;
            }else if(left == -1 && right < A.length){
                System.out.println("左到头");
                B[count] = A[right] * A[right];
                right ++;
            }
            count ++;
        }
        return B;
    }
}