class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;              // Initialize the starting index of the search space
        int end = nums.length - 1;  // Initialize the ending index of the search space
        int ans[] = new int[2];    // Initialize an array to store the result [start, end]

        ans[0] = searchFirst(nums, target);  // Find the index of the first occurrence of target
        ans[1] = searchLast(nums, target);   // Find the index of the last occurrence of target

        return ans;  // Return the result array containing [start, end]
    }
    
    public int searchFirst(int[] nums, int target) {
        int start = 0;              // Initialize the starting index of the search space
        int end = nums.length - 1;  // Initialize the ending index of the search space
        int result = -1;            // Initialize the result to -1 (not found)

        while (start <= end) {  // Perform binary search until the search space is valid
            int mid = start + (end - start) / 2;  // Calculate the middle index

            if (nums[mid] == target) {
                result = mid;      // Update result to the current mid index (possible first occurrence)
                end = mid - 1;     // Continue searching towards the left to find the first occurrence
            } else if (target > nums[mid]) {
                start = mid + 1;   // Target is greater, so narrow the search space to the right
            } else {
                end = mid - 1;     // Target is smaller, so narrow the search space to the left
            }
        }

        return result;  // Return the index of the first occurrence of target (or -1 if not found)
    }
    
    public int searchLast(int[] nums, int target) {
        int start = 0;              // Initialize the starting index of the search space
        int end = nums.length - 1;  // Initialize the ending index of the search space
        int result = -1;            // Initialize the result to -1 (not found)

        while (start <= end) {  // Perform binary search until the search space is valid
            int mid = start + (end - start) / 2;  // Calculate the middle index

            if (nums[mid] == target) {
                result = mid;      // Update result to the current mid index (possible last occurrence)
                start = mid + 1;   // Continue searching towards the right to find the last occurrence
            } else if (target > nums[mid]) {
                start = mid + 1;   // Target is greater, so narrow the search space to the right
            } else {
                end = mid - 1;     // Target is smaller, so narrow the search space to the left
            }
        }

        return result;  // Return the index of the last occurrence of target (or -1 if not found)
    }
}
