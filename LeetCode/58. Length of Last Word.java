
/**
 * Created by lrtwjhs on 2018/6/28.
 *
 * https://leetcode.com/problems/length-of-last-word/description/
 */

class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0, i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >=0 && s.charAt(i) != ' ') {
            result++;
            i--;
        }
        return result;
    }
}