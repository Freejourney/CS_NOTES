package leetcode_problems.binary_search;

public class The_First_Bad_Version {

    public int findTheFirstBadVersion(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }

        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + ( r - l ) / 2;
            if (isBadVersion(nums[mid])) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    private boolean isBadVersion(int version) {
        if (version >= 5)
            return true;
        return false;
    }

    public static void main(String[] args) {
        The_First_Bad_Version tfbv = new The_First_Bad_Version();
        System.out.println(tfbv.findTheFirstBadVersion(new int[]{1, 2, 3, 4, 4, 5, 5, 5, 6}));
        return;
    }
}
