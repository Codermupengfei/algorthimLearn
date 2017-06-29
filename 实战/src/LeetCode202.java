import java.util.HashSet;
import java.util.Set;

/**
 * Created by OovEver on 2017/6/28.
 */
public class LeetCode202 {
    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<>();
        int squreSum;
        int remain;
        while (inLoop.add(n)) {
            squreSum = 0;
            while (n > 0) {
                remain = n % 10;
                squreSum += remain * remain;
                n /= 10;
            }
            if (squreSum == 1) {
                return true;
            }else
                n = squreSum;
        }
        return false;
    }
}
