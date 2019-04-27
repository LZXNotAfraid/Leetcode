public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int a = 0, b = 0;
        for (int i = 0 ; i < len ; i ++ ){
            for (int j = i ; j < len ; j ++ ){
                if(nums[i] + nums[j] == target && i != j){
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        int[] re = new int[2];
        if(a > b){
            re[0] = b;
            re[1] = a;
            return re;
        }else{
            re[0] = a;
            re[1] = b;
            return re;
        }
    }
    
}