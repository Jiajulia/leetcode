package array;

public class MinSubArrayLen {
        public int minSubArrayLen(int s, int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }
            int ans = Integer.MAX_VALUE;
            int start = 0, end = 0;
            int sum = 0;
            while (end < n) {
                sum += nums[end];
                while (sum >= s) {
                    ans = Math.min(ans, end - start + 1);
                    sum -= nums[start];
                    start++;
                }
                end++;
            }
            return ans == Integer.MAX_VALUE ? 0 : ans;
        }

    public static void main(String args[]) {
        int[] nums = new int[]{8, 2, 4, 3};
        MinSubArrayLen remove = new MinSubArrayLen();
        int len = remove.minSubArrayLen(7, nums);
        System.out.println("latest length is " + len);
    }
}

