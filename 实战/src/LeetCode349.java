import java.util.HashSet;
import java.util.Set;

/**
 * Created by OovEver on 2017/6/28.
 */
public class LeetCode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++) {
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++) {
            if (set.contains(nums2[i])) {
                res.add(nums2[i]);
            }
        }
        int [] resArr = new int[res.size()];
        int len=0;
        for (int x : res) {
            resArr[len++] = x;
        }
        return resArr;
    }
}
