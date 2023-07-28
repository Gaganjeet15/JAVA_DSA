class Solution {
    public int search(int[] arr, int target) {
        
         int start = 0;              // Starting index of the search space
        int end = arr.length - 1;   // Ending index of the search space

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index
            int midVal = arr[mid];              // Get the value at the middle index

            if (midVal == target) {             // If the middle value is the target, return the index
                return mid;
            } else if (midVal < target) {       // If the middle value is less than the target, adjust the start
                start = mid + 1;
            } else {                            // If the middle value is greater than the target, adjust the end
                end = mid - 1;
            }
        }

        return -1;    // Target not found in the array
    }
}