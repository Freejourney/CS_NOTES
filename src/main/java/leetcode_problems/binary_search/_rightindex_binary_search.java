package leetcode_problems.binary_search;

/*
    在一个有重复元素的数组中查找 target 的最右位置
 */
public class _rightindex_binary_search {

    public int m_binary_search(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }

        int len = nums.length;
        int l = 0;
        int r = len;

        while (l < r) {
            int mid = l + ( r - l ) / 2;

            // 让最左下标抵住最右端，让最又下标向其靠近
            if (nums[mid] <= target) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        _rightindex_binary_search rbs = new _rightindex_binary_search();
        System.out.println(rbs.m_binary_search(new int[]{1, 2, 3, 3, 4, 5, 6}, 3));
        return;
    }
}
