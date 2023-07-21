class Solution {
    public int removeElement(int[] nums, int val) {
        
        // Initialize a variable to store the final length of the modified array.
        int ans = 0;

        // Iterate through the input array 'nums'.
        for (int i = 0; i < nums.length; i++) {

            // Check if the current element is not equal to the given 'val'.
            if (nums[i] != val) {

                // If the current element is not equal to 'val', update the element at index 'ans' in the array to be the current element.
                nums[ans] = nums[i];

                // Increment the 'ans' variable to move to the next position in the modified array  h.
                ans++;
            }
        }

        // Return the final length of the modified array, which represents the number of elements that are not equal to   'val'.
        return ans;
    }
}
