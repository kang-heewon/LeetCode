class Solution {
    public void rotate(int[] nums, int k) {
        int movement = k % nums.length;
        int[] copied = new int[nums.length];
        System.arraycopy(nums, 0, copied, 0, nums.length);

        for(int index = 0; index < nums.length; index++) {
            int shiftedIndex = index - movement < 0 ? nums.length + (index - movement) : index - movement;
            nums[index] = copied[shiftedIndex];
        }
    }
}