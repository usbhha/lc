package com.lc._3_longest_substring_distinct;

import java.util.HashMap;

/**
 * 3. 无重复字符的最长子串
 *
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 *
 * @author: Feng YuJie
 * @create: 2021/10/13 10:55
 */
public class Main_3_2 {

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
        //1. 在map中维护不重复子串；
        //2. 查询重复，则删除一个左侧的元素
        HashMap<Character, Character> map = new HashMap<>();
        int result = 0;
        int index = 0;
        int end = 0;
        while (end < s.length()){
            //从左侧删除， 直到重复元素
            if (map.containsKey(s.charAt(end))){
                // map中元素重复
                map.remove(s.charAt(index));
                index++;
            }else{
                map.put(s.charAt(end),s.charAt(end));
                result = Math.max(result,end-index+1);
                end++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Main_3_2 m = new Main_3_2();
        System.out.println(m.lengthOfLongestSubstring("abcabcbb"));;
    }
}
