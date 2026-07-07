class Solution {
    public int specialArray(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > maxValue)
            {
                maxValue = nums[i];
            }
        }
        for(int i = 0; i <= maxValue; i++)
        {
            int numberOfValuesGreaterThanX = 0;
            int x = i;
            int count = 0;
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[j] >= x)
                {
                    count++;
                }
            }
            if(count == x)
            {
                return x;
            }
        }
        return -1;
    }
}