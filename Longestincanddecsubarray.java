public class Longestincanddecsubarray {
    // Problem: Find the length of the longest strictly increasing or decreasing subarray
// Time Complexity: O(n)
// Space Complexity: O(1)

    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;     // current length of increasing subarray
        int dec = 1;     // current length of decreasing subarray
        int maxlen = 1;  // stores the maximum found so far

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1; // reset decreasing counter
            } else if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1; // reset increasing counter
            } else {
                // If equal, reset both
                inc = 1;
                dec = 1;
            }

            // Update maxlen at each step
            maxlen = Math.max(maxlen, Math.max(inc, dec));
        }

        return maxlen;
    }
}


