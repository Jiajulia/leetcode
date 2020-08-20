package search;
//https://leetcode-cn.com/problems/minimum-size-subarray-sum

public class MinSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i]; //sum每次赋值为num[i]
            if (sum >= s) //如果大于s,直接返回为最小子串长度为1
                return 1;
            for (int j = i + 1; j < nums.length; j++) { // i+1开始遍历，sum和大于s就取最小长度
                sum += nums[j];
                if (sum >= s) {
                    min = Math.min(min, j - i + 1);//判断上一次最小值和区间大小
                    break;
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    public static void main(String args[]){
        int[] nums = new int[]{8,2,4,3};
        MinSubArrayLen remove = new MinSubArrayLen();
        int len = remove.minSubArrayLen(7,nums);
        System.out.println("latest length is " + len);
    }
}
