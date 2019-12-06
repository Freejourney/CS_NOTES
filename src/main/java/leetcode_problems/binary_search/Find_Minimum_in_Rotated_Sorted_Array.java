package leetcode_problems.binary_search;

/*
    数组没有重复数字
 */
public class Find_Minimum_in_Rotated_Sorted_Array {

    public int findTheMinimumFromRotatedSortedArray(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }

        int l = 0;
        int r = nums.length - 1;

        // 最终l会增加到刚好大于nums[l]的位置
        while (l < r) {
            int mid = l + ( r - l ) / 2;

            // nums[mid] <= nums[r]的时候，目标元素在左边
            if (nums[mid] <= nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        Find_Minimum_in_Rotated_Sorted_Array fmirsa = new Find_Minimum_in_Rotated_Sorted_Array();
        System.out.println(fmirsa.findTheMinimumFromRotatedSortedArray(new int[]{3,4,5,1,2}));
        return;
    }
}
