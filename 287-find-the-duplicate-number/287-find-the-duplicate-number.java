class Solution {
    public int findDuplicate(int[] nums) {
        //HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(nums[0]);
        int ans = 0;
        for(int i = 1; i<nums.length; i++)
        {
            if(set.contains(nums[i]))
            {
                ans = nums[i];
                break;
            }
            else
                set.add(nums[i]);  
        }
        return ans;
    }
}