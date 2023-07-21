class Solution {
    public int[] sortedSquares(int[] nums) {
        // We don't need to create a new array to store the squared values because we can modify the 'nums' array directly.
        // int[] arr = new int[nums.length];

        // Loop through the 'nums' array to square each element and update its value in the same position.
        for (int i = 0; i < nums.length; i++)
            nums[i] = nums[i] * nums[i];

        // Sort the 'nums' array in ascending order.
        Arrays.sort(nums);

        // Return the sorted array of squared values.
        return nums;
    }
}
