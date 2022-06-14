package yxl.test;

public class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        return midSearch(nums, start, end, target);
    }

    private int midSearch(int[] nums, int start, int end, int target) {
        if (start == end)
            return -1;
        int mid = (end + start) / 2;
        if (nums[mid] > target)
            return midSearch(nums, start, mid, target);

        if (nums[mid] < target)
            return midSearch(nums, mid + 1, end, target);

        if (nums[mid] == target)
            return mid;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        Solution s = new Solution();
        System.out.println(s.search(nums, target));
    }
}
