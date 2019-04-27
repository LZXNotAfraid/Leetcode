class Solution {
    public int removeDuplicates(int[] nums) {
        //int cur = 0;
        int index = 0;
        for(int i = 1 ; i < nums.length ; i ++){
            //System.out.println("i: " + i);
            //System.out.println("before index: " + index);
            if(nums[i] != nums[index]){
                index ++;
                nums[index] = nums[i];
            }
            //System.out.println("after index: " + index);
        }
        return index+1;
    }
}