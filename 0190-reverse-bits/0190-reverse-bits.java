class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++)
        {
            // make space for next bit
            result = result << 1;
            // copy last bit of n
            result = result | (n & 1);
            n = n >> 1;
        }
        return result;
    }
}