package leetcode_problems.binary_search;

/*
    求一个数的开方，取不超过开方后数的最大整数
 */
public class sqrt_binary_search {

    /*
       ① sqrt = x / sqrt
       ② sqrt ∈ 0 ~ x
     */
    public int sqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int l = 1;
        int r = x;
        while (l <= r) {
            int mid = l + ( r - l ) / 2;
            int sqrt = x / mid;
            System.out.println(sqrt+" "+mid);
            if (sqrt == mid) {
                return sqrt;
            } else if (sqrt < mid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int l = 1, h = x;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int sqrt = x / mid;
            if (sqrt == mid) {
                return mid;
            } else if (mid > sqrt) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        sqrt_binary_search sqs = new sqrt_binary_search();
        System.out.println(sqs.sqrt(14511));
//        System.out.println(sqs.mySqrt(10));
        return;
    }
}
