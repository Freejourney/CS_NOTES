package leetcode_problems.binary_search;

/*
    给定一个有序的字符数组 letters 和一个字符 target，要求找出 letters 中大于 target 的最小字符，如果找不到就返回第 1 个字符。
 */
public class The_Smallest_Letter_Greater_Than_Target {

    public char findTSLGTHT_1(char[] str, char c) {
        if (str.length == 0 || str == null) {
            return 'e';
        }

        int l = 0;
        int r = str.length - 1;

        while (l <= r) {
            int mid = l + ( r - l ) / 2;
            if (str[mid] == c) {
                return str[mid+1];
            } else if (str[mid] < c) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return str[0];
    }

    public char findTSLGTHT_2(char[] str, char c) {
        if (str.length == 0 || str == null) {
            return 'e';
        }

        int l = 0;
        int r = str.length - 1;

        // 使用最左端下标l抵住刚好大于str[mid]==c的mid，让右端r向l靠近，相等时退出循环
        while (l < r) {
            int mid = l + ( r - l ) / 2;
            if (str[mid] <= c) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        // 循环结束，r对应刚好大于c的字符，r-1则是字符c
        return str[r-1] == c ? str[r]:str[0];
    }

    public static void main(String[] args) {
        The_Smallest_Letter_Greater_Than_Target tslgtt = new The_Smallest_Letter_Greater_Than_Target();
        System.out.println(tslgtt.findTSLGTHT_1(new char[]{'a', 'b', 'c'}, 'b'));
        System.out.println(tslgtt.findTSLGTHT_2(new char[]{'a', 'b', 'c'}, 'b'));
        return;
    }
}
