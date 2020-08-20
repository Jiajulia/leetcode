package array;
//0027-移除元素，给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
public class removeElement {
    public int remove(int[] nums, int target){
        int i = 0;
        for (int j = 0; j < nums.length; j++) { // j=0,从第一个元素开始比较
            if (nums[j] != target) { //不等于目标元素
                nums[i] = nums[j];//j的元素存储到nums[i]数组中，index加1
                i++;
            }
        }
        return i;
    }
    public static void main(String args[]){
        int[] nums = new int[]{3,2,2,2,3};
        removeElement remove = new removeElement();
        int len = remove.remove(nums,2);
        System.out.println("latest length is " + len);
    }
}
