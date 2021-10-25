package com.space._3_longest_substring_distinct;

/**
 * 3. 无重复字符的最长子串
 *
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 *
 * @author: Feng YuJie
 * @create: 2021/10/13 10:55
 */
public class Main_3_1 {

    /**
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        StringBuffer ss = new StringBuffer(s);
        StringBuffer singleBuffer = new StringBuffer();
        int result = 0;
        while ( result <ss.length()){
            int index = 0;
            while (index<s.length()) {
                singleBuffer.append(ss.charAt(index));
                index++;
                if(index == ss.length() || singleBuffer.indexOf(String.valueOf(ss.charAt(index))) != -1 ){
                    break;
                }
            }
            result = result >  singleBuffer.length() ? result : singleBuffer.length();
            singleBuffer.setLength(0);
            ss.delete(0,1);
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Main_3_1 m = new Main_3_1();
        m.lengthOfLongestSubstring(" ");
    }
}
