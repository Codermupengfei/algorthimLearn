import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/6/29.
 */
public class LeetCode77 {
    List<List<Integer>> res=new ArrayList<>();
    private void generateCombinations(int n, int k, int start,List<Integer> c) {
        if (c.size() == k) {
            res.add(new ArrayList<Integer>(c));
            return;
        }
        for(int i=start;i<=(n-(k-c.size())+1);i++) {
            c.add(i);
            generateCombinations(n,k,i+1,c);
            c.remove(c.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k <= 0 || k > n) {
            return res;
        }
        generateCombinations(n,k,1,new ArrayList<>());
        return res;
    }
}

