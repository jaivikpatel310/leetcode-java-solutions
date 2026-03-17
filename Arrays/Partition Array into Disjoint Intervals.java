class Solution {
    public int partitionDisjoint(int[] nums) {
        int leftMax = nums[0];
        int currMax = nums[0];
        int partitionIdx = 0;
        
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(currMax, nums[i]);
            
            if (nums[i] < leftMax) {
                leftMax = currMax;
                partitionIdx = i;
            }
        }
        
        return partitionIdx + 1;
    }
}
