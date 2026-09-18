class Solution {
    public int findMin(int[] nums) {
        int N = nums.length;
        int ans = Integer.MAX_VALUE;
        if(nums[0] < nums[N-1])
        {
            return nums[0];
        }
        int left = 0;
        int right = N-1;
        while(left <= right)
        {
            int middle = left + (right-left) / 2;

            if(nums[middle] >= nums[left])
            {
                ans = Math.min(ans,nums[left]);
                left = middle + 1;
            }
            else 
            {
                ans = Math.min(ans,nums[middle]);
                right = middle - 1;
            }
        }
        return ans;
    }
}