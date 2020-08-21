package search.code;
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引
public class twoSumWithTarget {
    public int insert(int[] nums, int target){
        if (nums.length == 0 ) return 0;
        int left = 0;
        int right = nums.length - 1;
        while (left<=right) {
            int mid = left + (right - left)/2;
            if (target == nums[mid]) return mid;
            else if (nums[left] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
    public static void main(String[] args) {
        twoSumWithTarget twoSum = new twoSumWithTarget();
        int result = twoSum.insert(new int[] { 1,2,4,5}, 0);
        System.out.println("Pair with target sum: " + result);
    }
}
