class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans= new int[2*nums.length]; // creating an second array of size of first array*2

        for(int i=0;i<nums.length;i++) // traversing the loop i to length of the array
        {
            ans[i] = nums[i];  // copying value of first array in the second array;
            ans[i+nums.length] = nums[i];  // copying the elements
            
        }

        return ans;
    }
}