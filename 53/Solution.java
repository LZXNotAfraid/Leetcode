class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int t = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            if(t > 0){
                t += nums[i];
            }else{
                t = nums[i];
            }
            if(t > max)
                max = t;
        }
        return max;
    }
}
