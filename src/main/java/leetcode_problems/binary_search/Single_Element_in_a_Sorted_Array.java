package leetcode_problems.binary_search;

/*
    一个有序数组只有一个数不出现两次，找出这个数
 */
public class Single_Element_in_a_Sorted_Array {

    /*
        mid将数组分成两段，一段有single element，一段没有

        有single element的一段：AABBCDDEE
        没有single element的一段： QQWWEERRTT

        从偶数位搜索的时候，在有single element的一段中会出现nums[n] != nums[n-1]的情况, 对于没有single element的那段舍弃
     */
    public int findTheSingleElementinaSortedArray(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }

        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + ( r - l ) / 2;
            if ((mid % 2) == 1) {
                mid--;
            }

            // r从右往左最后停留在nums[mid] != nums[mid+1]的地方，即single element所在的地方，然后l会一步步靠近，直到l == r
            if (nums[mid] == nums[mid+1]) {
                l = mid + 2;
            } else {
                r = mid;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        Single_Element_in_a_Sorted_Array seiasa = new Single_Element_in_a_Sorted_Array();
        System.out.println(seiasa.findTheSingleElementinaSortedArray(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        return;
    }
}
