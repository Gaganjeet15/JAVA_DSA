class Solution {
    public int singleNonDuplicate(int[] nums) {
        //  Initialize two pointers, left and right, to the first and last indices of the input array, respectively.
         int start =0;
         int end = nums.length-1;

          while(start < end)
          {
              int mid = (start + end)/2;

              if(mid %2 == 1) //If the index of the middle element is odd, subtract 1 to make it even.
              mid--;

             //Compare the middle element with its adjacent element on the right
              if(nums[mid] != nums[mid +1]) //If the middle element is not equal to its right neighbor, the single element must be on the left side of the array, so update the right pointer to be the current middle index.
              {
                  end = mid;
              }
              else 
              start = mid+2; //Otherwise, the single element must be on the right side of the array, so update the left pointer to be the middle index plus  2.
          }
          return nums[start];
    }
}