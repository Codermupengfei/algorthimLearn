import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/6/29.
 */
public class LeetCode46 {
    private static void generatePernutation(int[] nums, int index, List<Integer> p,List<List<Integer>> res) {
        if (p.size() == nums.length) {
            res.add(p);
            return;
        }
        for(int i=0;i<=p.size();i++) {
            List<Integer> newPermutation = new ArrayList<>(p);
            newPermutation.add(i, nums[index]);
            generatePernutation(nums, index+1, newPermutation,res);


        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        generatePernutation(nums,0,new ArrayList<>(),res);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> res = new ArrayList<>();
        res = permute(nums);
        System.out.println(res);

    }
}
