class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        int left = 0;
        int right = size-1;
        int ans = -1;
        while(left <= right)
        {
            int middle = (left + right) / 2;
            if(nums[middle] == target)
            {
                return middle;
            }
            else if(nums[middle] < target)
            {
                left = middle + 1;
            }
            else
            {
                ans = middle;
                right = middle - 1;
            }
        }
        return ans == -1 ? size : ans;
    }
}