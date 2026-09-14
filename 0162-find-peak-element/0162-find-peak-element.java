class Solution {
    public int findPeakElement(int[] nums) {
        int size = nums.length;
        if(size == 1)
        {
            return 0;
        }
        if(nums[0] > nums[1])
        {
            return 0;
        }
        if(nums[size-1] > nums[size-2])
        {
            return size-1;
        }
        int left = 1;
        int right = size - 2;

        while(left <= right)
        {
            int middle = (left + right) / 2;

            if(nums[middle] > nums[middle - 1] && nums[middle] > nums[middle + 1])
            {
                return middle;
            }
            else if(nums[middle] < nums[middle + 1])
            {
                left = middle + 1;
            }
            else
            {
                right = middle - 1;
            }
        }
        return -1;
    }
}