class Solution {
    public void moveZeroes(int[] nums) {
        
        // // Loop through each element in the array
        // for (int i = 0; i < nums.length; i++) {
            
        //     // For each element, check the subsequent elements
        //     for (int j = i + 1; j < nums.length; j++) {
                
        //         // If the current element is zero, then we need to move it to the end
        //         if (nums[i] == 0) {
                    
        //             // Swap the current element (zero) with the non-zero element following it
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
                    
        //             // At this point, the zero has been moved to the end, and the non-zero element
        //             // has been moved to the current position (i). We continue with the next element.
        //         }
        //     }
        // }

        
    
   
        int i = 0; // Initialize a pointer for placing non-zero elements
        
        // Iterate through each element in the array
        for (int j = 0; j < nums.length; j++) {
            int num = nums[j]; // Get the current element
            
            // If the current element is non-zero
            if (num != 0) {
                nums[i] = num; // Place the non-zero element at position i
                i++; // Move the pointer to the next position for the next non-zero element
            }
        }
        
        // Fill the remaining positions in the array with zeroes
        while (i < nums.length) {
            nums[i] = 0; // Place a zero at the remaining positions
            i++; // Move the pointer to the next position
        }
    
    }
}
  


    





