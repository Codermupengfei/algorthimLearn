/**
 * Created by OovEver on 2017/6/27.
 * 思路1:
 * 将数组所有非0元素找出放到数组前面
 * 剩余部分放0
 * 思路2：
 * 遍历保证前Len元素非0后面元素为0
 */
public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length<1)
            return;
        int len = 0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i]!=0) {
                /*对于全为0的情况*/
                if (i != len) {
                    int temp = nums[i];
                    nums[i] = nums[len];
                    nums[len] = temp;
                    len++;
                }else
                    len++;
            }
        }
    }
}
