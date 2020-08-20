package array;
//0026-删除数据中重复项
class RemoveDuplicates{
    public int remove(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {//前后两个比较，j=1
            if (nums[j] != nums[i]) { //不相等的就加到nums[i]中，
                i++; // i增加防止值被覆盖
                nums[i] = nums[j]; // 不相等的值加入nums[i]数组中
            }
        }
        return i + 1;
    }
    public static void main(String args[]){
        int[] nums = new int[]{1,2,2,3};
        RemoveDuplicates remove = new RemoveDuplicates();
        int len = remove.remove(nums);
        System.out.println("latest length is " + len);
    }
}