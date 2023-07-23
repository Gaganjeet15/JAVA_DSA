class Solution {
    public int sumOfSquares(int[] nums) {
        // Get the length of the nums array
        int n = nums.length;
        
        // Initialize a variable to hold the sum of squares
        int sum = 0;
        
        // Iterate through the nums array
        for (int i = 0; i < nums.length; i++) {
            // Check if n (length of array) is divisible by (i + 1)
            if (n % (i + 1) == 0) {
                // If (i + 1) divides n evenly, add the square of the current element to the sum
                sum += nums[i] * nums[i];
            }
        }
        
        // Return the final sum of squares
        return sum;
    }
}
