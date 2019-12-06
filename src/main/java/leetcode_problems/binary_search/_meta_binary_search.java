package leetcode_problems.binary_search;

public class _meta_binary_search {

    public int binary_search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int len = nums.length;
        int l = 0;
        int r = len-1;

        while (l <= r) {
            int mid = l+(r-l)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                l = mid + 1;
            }
            if (nums[mid] > target) {
                r = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        _meta_binary_search mbs = new _meta_binary_search();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("The index of target is : " + mbs.binary_search(nums, 5));
        return;
    }
}
