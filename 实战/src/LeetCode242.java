/**
 * Created by OovEver on 2017/6/28.
 */
public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        if (s == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int[] temp = new int[128];
        for (char c : sChar) {
            temp[c]++;
        }
        for (char c : tChar) {
            temp[c]--;
            if (temp[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
