class Solution {
    public int singleNumber(int[] nums) {
        int N = 0;
        for(int i = 0; i < nums.length; i++)
        {
            N = N ^ nums[i];
        }
        return N;
    }
}