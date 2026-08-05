class Solution {
    public int search(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;

        while (head <= tail) {
            int mean = (head + tail) / 2;
            if (target == nums[mean]) {
                return mean;
            } else if (target > nums[mean]) {
                head = mean + 1;
            } else {
                tail = mean - 1;
            }
        }
        return -1;
    }
}
