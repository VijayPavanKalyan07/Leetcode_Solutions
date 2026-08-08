class Solution {

    public List<Integer> grayCode(int n) {

        // Base case
        // Gray Code for 1 bit is [0, 1]
        if (n == 1) {

            List<Integer> ans = new ArrayList<>();

            ans.add(0);
            ans.add(1);

            return ans;
        }

        // Get Gray Code for n - 1 bits
        List<Integer> subAns = grayCode(n - 1);

        // Create the answer for n bits
        List<Integer> ans = new ArrayList<>();

        // First half:
        // Keep the previous Gray Code as it is
        // This represents 0G(n)
        for (int i = 0; i < subAns.size(); i++) {
            ans.add(subAns.get(i));
        }

        // Second half:
        // Take previous Gray Code in reverse order
        // and add the new highest bit
        // This represents 1R(n)
        for (int i = subAns.size() - 1; i >= 0; i--) {

            ans.add(subAns.get(i) + (1 << (n - 1)));
        }

        return ans;
    }
}