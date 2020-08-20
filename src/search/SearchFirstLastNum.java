package search;
//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置
//如果数组中不存在目标值，返回 [-1, -1]。
//输入: nums = [5,7,7,8,8,10], target = 8
//输出: [3,4]

import sun.jvm.hotspot.memory.Generation;

import java.util.Arrays;

public class SearchFirstLastNum {
    public int[] search(int[] nums,int target){
        if (nums.length == 0) return new int[]{-1,-1};
        int first = getIndex(nums, target);
        int last = getIndex(nums, target + 1);
        if (first != nums.length && nums[first] == target){
            return new int[]{first, last-1};
        }
        return new int[]{-1,-1};
    }

    public int getIndex(int[] nums, int n){
        int left=0;
        int right=nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if (n == nums[mid]) return mid;
            else if (nums[mid] < n)  left = mid +1;
            else right = mid -1;
        }
        return left;
    }

    public static void main(String[] args) {
        SearchFirstLastNum twoSum = new SearchFirstLastNum();
        int[] result = twoSum.search(new int[] { 1,2,2,3}, 2);
        System.out.println("Pair with target sum: " + Arrays.toString(result));
    }
}
