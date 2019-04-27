class Solution {
    public int removeElement(int[] nums, int val) {
        int tail = nums.length - 1;
        int i = 0;
        int t;
        
        while(i <= tail){
            if(nums[tail] == val){
                    tail --;
            }else{
                if(nums[i] == val){
                    t = nums[tail];
                    nums[tail] = nums[i];
                    nums[i] = t;
                    i ++;
                    tail --;
                }else{
                    i ++;
                }
            }
            
        }
        return tail + 1;
    }
}