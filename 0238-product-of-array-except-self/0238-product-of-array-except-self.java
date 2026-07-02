class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] ans = new int[N];
        int[] prefixSumArr = new int[N];
        prefixSumArr[0] = nums[0];
        for(int i = 1; i < N; i++)
        {
            prefixSumArr[i] = prefixSumArr[i-1] * nums[i];
        }
        int[] suffixSumArr = new int[N];
        suffixSumArr[N-1] = nums[N-1];
        for(int i = N-2; i >= 0; i--)
        {
            suffixSumArr[i] = suffixSumArr[i+1] * nums[i];
        }
        for(int i = 0; i < N; i++)
        {
            if(i == 0)
            {
                ans[i] = suffixSumArr[i+1];
            }
            else if(i == N-1)
            {
                ans[i] = prefixSumArr[i-1];
            }
            else
            {
                ans[i] = prefixSumArr[i-1] * suffixSumArr[i+1];
            }
        }
        return ans;
    }
}