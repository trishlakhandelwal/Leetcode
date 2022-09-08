class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        boolean flag = false;
        int ans = 0;
        for(int i = 0; i<nums.length-1; i+=2)
        {
            if(nums[i]!=nums[i+1])
            {
                ans = nums[i];
                flag = true;
                break;
            }
        }
        if(flag == false)
            ans = nums[nums.length-1];
        return ans;
    }
}