class Solution {
    public void moveZeroes(int[] nums) {
        int newpos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[newpos] = nums[i];
                newpos++;
            }
        }
        for (int i = newpos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
