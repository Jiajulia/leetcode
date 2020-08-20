package array;
//0088-有序数组平方
import java.util.Arrays;

public class SquareNums {
    public int[] sortedSquares(int[] nums) {
        int length;
        if (nums == null || (length = nums.length) == 0) {
            return new int[0];
        }
        int i = 0;
        int j = length - 1;
        int k = length - 1; // 数组index初始值
        int[] result = new int[length]; //定义新的数组
        while (i <= j) {
            int temp; //存储最大元素
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                temp = nums[i] * nums[i]; //最大元素，i++
                i++;
            } else {
                temp = nums[j] * nums[j];
                j--;
            }
            result[k--] = temp; // k--存储由大到小的值
        }
        return result;
    }
    public static void main(String[] args) {
        SquareNums twoSum = new SquareNums();
        int[] result = twoSum.sortedSquares(new int[] { -2,-1,0,1,2 });
        System.out.println("Pair with target sum: "+ Arrays.toString(result));
    }
}
