package leetcode_problems.binary_search;

/*
    在一个有重复元素的数组中查找 target 的最左位置
 */
public class _leftindex_binary_search {

    public int m_binary_search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int len = nums.length;
        int r = len-1;
        int l = 0;

        while (l < r) {
            int mid = l + ( r - l ) / 2;
            // 最后 l == r 的时候结束循环, r会从大于target的地方向target靠拢，最后不会小于最左端的target下标，
            // 而l会从小与最左端target下标一直运行到与最左端下标相等时结束
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
//        System.out.println("r和l的变换：+ r:"+r+" l:"+l);
        return l;
    }

    public static void main(String[] args) {
        _leftindex_binary_search mbs = new _leftindex_binary_search();
        System.out.println(mbs.m_binary_search(new int[]{1, 2, 3, 3, 4, 5, 6}, 3));
        return;
    }
}
