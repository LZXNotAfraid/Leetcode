class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List res = new ArrayList<List<Integer>>();
        for(int i = 0; i< nums.length-3; i ++){
            for(int j = i +1; j <nums.length-2; j++){
            int start = j + 1;
            int end = nums.length - 1;
            while(start < end){
                if(nums[start] + nums[end] + nums[i]  + nums[j]== target){
                    List t = new ArrayList<Integer>();
                    t.add(nums[i]);
                    t.add(nums[j]);
                    t.add(nums[start]);
                    t.add(nums[end]);
                    res.add(t);
                    start ++;
                    end --;
                    while(nums[start] == nums[start - 1] && start < end)
                        start ++;
                    while(nums[end] == nums[end + 1] && end >start)
                        end --;
                }else if(nums[start] + nums[end] + nums[i] +nums[j] < target){
                    start ++;
                }else{
                    end --;
                }
            }
            while(i<nums.length -3 && nums[i] == nums[i + 1])
                i ++;
            while(j <nums.length -2 && nums[j] == nums[j+1])
                j ++;
        }}
        return res;

    }
}