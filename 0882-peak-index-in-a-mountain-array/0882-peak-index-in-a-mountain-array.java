class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;                  // Initialize the start pointer to the beginning of the array.
        int end = arr.length-1;         // Initialize the end pointer to the end of the array.

        while(start < end)              // Enter the binary search loop until start crosses end.
        {
            int mid = start + (end - start) / 2;  // Calculate the middle index of the current range.

            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) {
                // If arr[mid] is greater than its both left and right neighbors, it is the peak element.
                return mid;             // Return the index of the peak element.
            }

            if(arr[mid] < arr[mid+1]) {
                // If arr[mid] is less than arr[mid+1], peak element lies on the right side of mid.
                start = mid + 1;        // Update start to narrow the search range to the right half.
            } else {
                // Otherwise, peak element lies on the left side of mid.
                end = mid - 1;          // Update end to narrow the search range to the left half.
            }
        }

        // If the loop exits without finding the peak element, the array is not a mountain array.
        // Return the current value of start, which points to the largest element in the non-mountain array.
        return start;
    }
}
