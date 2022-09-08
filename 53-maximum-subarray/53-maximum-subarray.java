class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        // else if(nums.length == 2)
        //     return Math.max(nums[0], nums[1]);
        else
        {
            int maxSum = nums[0];
            int currSum = 0;
            for(int i = 0; i<nums.length; i++)
            {
                if(currSum<0) //if u encounter any negative number
                    currSum = 0; //discard it and reset currSum
                currSum = currSum + nums[i];
                maxSum = Math.max(maxSum, currSum);
            }
            return maxSum;
        } 
    }
}