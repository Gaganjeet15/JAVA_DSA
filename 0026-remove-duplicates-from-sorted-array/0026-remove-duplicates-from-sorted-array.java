class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // i=0 (for iteration)
        
            for(int j=1;j<nums.length;j++) //using loop for comparing i nd j
            {
                if(nums[i]!=nums[j]) // is i[0] not equal to j[1] then i will become i[1] and j value will be updated in i[i]
                {
                    i++; // i+1
                    nums[i] = nums[j]; 
                }
            }
        
        return i+1;
    }
}