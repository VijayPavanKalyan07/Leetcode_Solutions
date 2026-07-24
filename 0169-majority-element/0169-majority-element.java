class Solution {
    public int majorityElement(int[] nums) {
        // stores the current majority candidate
        int candidate = 0;
        // vote count for candidate
        int count = 0;
        for(int num: nums)
        {
            // if count becomes 0, choose current element as candidate element
            if(count == 0)
            {
                candidate = num;
            }
            // same element - increase the count
            // different element - decrease the count
            if(num == candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
         // Since the problem guarantees a majority element,
        // the remaining candidate is the answer.
        return candidate;
    }
}