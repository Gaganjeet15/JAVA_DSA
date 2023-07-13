class Solution {
    public int search(int[] nums, int target) {
        
        int start =0; // first  taking a variable start (while index is 0 )
        int end= nums.length-1; //(end)
         while(start <= end)
         {
             int mid = (start + end)/2; // this is a formula for the mid

             if(target < nums[mid]) // if target is smaller  then mid we will search in left 
             
                 end = mid -1; // // this is for finding the middle.

                 else if(target > nums[mid]) // if taget  is greater then mid we will search in right
                     start = mid +1;
                 
              else 
             {
                 return mid;
             }

             
         }
         return -1;
    }
}