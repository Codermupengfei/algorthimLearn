import java.util.HashMap;
import java.util.Map;

/**
 * Created by OovEver on 2017/6/28.
 */
public class LeetCode290 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map map = new HashMap<>();
        for(int i=0;i<words.length;i++) {
            if (map.put(pattern.charAt(i), i) != map.put(words[i], i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
