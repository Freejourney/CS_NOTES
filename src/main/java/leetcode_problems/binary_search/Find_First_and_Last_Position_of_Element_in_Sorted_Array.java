package leetcode_problems.binary_search;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

    public int[] findTheFirstandLastPositionofElementinSortedArray(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return new int[]{-1, -1};
        }

        _leftindex_binary_search lbs = new _leftindex_binary_search();
        _rightindex_binary_search rbs = new _rightindex_binary_search();
        int first = lbs.m_binary_search(nums, target);
        int last = rbs.m_binary_search(nums, target);

        System.out.println(first+" "+last);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        Find_First_and_Last_Position_of_Element_in_Sorted_Array ffalpoeisa = new Find_First_and_Last_Position_of_Element_in_Sorted_Array();
        System.out.println(ffalpoeisa.findTheFirstandLastPositionofElementinSortedArray(new int[]{5,7,7,8,8,10}, 8));
        return;
    }
}
