import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by OovEver on 2017/6/28.
 */
public class LeetCode350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums1.length;i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int j=0;j<nums2.length;j++) {
            if (map.containsKey(nums2[j])&& map.get(nums2[j])>0) {
                res.add(nums2[j]);
                map.put(nums2[j], map.get(nums2[j]) - 1);
            }
        }
        int[] resArr = new int[res.size()];
        for(int i=0;i<res.size();i++) {
            resArr[i] = res.get(i);
        }
        return resArr;
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {1, 1};
        System.out.println(intersect(nums1,nums2));
    }
}
