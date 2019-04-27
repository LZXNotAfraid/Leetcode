class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List res = new ArrayList<List<Integer>>();
        
        for(int i = 0; i< nums.length-2; i ++){
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end){
                if(nums[start] + nums[end] + nums[i] == 0){
                    List t = new ArrayList<Integer>();
                    t.add(nums[i]);
                    t.add(nums[start]);
                    t.add(nums[end]);
                    res.add(t);
                    start ++;
                    end --;
                    while(nums[start] == nums[start - 1] && start < end)
                        start ++;
                    while(nums[end] == nums[end + 1] && end >start)
                        end --;
                }else if(nums[start] + nums[end] + nums[i] < 0){
                    start ++;
                }else{
                    end --;
                }
            }
            while(i<nums.length -2 && nums[i] == nums[i + 1])
                i ++;
        }
        return res;
    }
}