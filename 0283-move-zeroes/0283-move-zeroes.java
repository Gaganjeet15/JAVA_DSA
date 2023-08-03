class Solution {
    public void moveZeroes(int[] nums) {
        
        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            
            // For each element, check the subsequent elements
            for (int j = i + 1; j < nums.length; j++) {
                
                // If the current element is zero, then we need to move it to the end
                if (nums[i] == 0) {
                    
                    // Swap the current element (zero) with the non-zero element following it
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    
                    // At this point, the zero has been moved to the end, and the non-zero element
                    // has been moved to the current position (i). We continue with the next element.
                }
            }
        }
    }
}
