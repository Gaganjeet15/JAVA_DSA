class Solution {
    public int[] runningSum(int[] nums) {
        for ( int i=1;i<nums.length;i++) // traversing
        {
            nums[i]= nums[i]+nums[i-1]; // here we are addint the value of the current index and the value of current index -1 and the copying the result in the cureent index for example when i=2 then adding i value with i-value that is 1 that will be 2+1=2 and replacing the added value with the current index.
           
        }
       
    return nums; 
    }
}