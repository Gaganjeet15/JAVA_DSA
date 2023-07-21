class Solution {
    public int findPeakElement(int[] nums) {
        // Initialize the start and end pointers for binary search.
        int start = 0;
        int end = nums.length - 1;

        // Binary search loop to find the peak element.
        while (start < end) {

            // Calculate the middle index to divide the search space in half.
            int mid = start + (end - start) / 2;

            // Check if the element at 'mid' is greater than the element at 'mid + 1'.
            if (nums[mid] > nums[mid + 1]) {
                // If true, it means the peak lies in the left half, so move 'end' to 'mid'.
                end = mid;
            } else {
                // If false, it means the peak lies in the right half, so move 'start' to 'mid + 1'.
                start = mid + 1;
            }
        }

        // At the end of the loop, 'start' will be pointing to the peak element.
        return start;
    }
}
