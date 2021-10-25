package com.space._5_longest_repetition;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 回文子串： 正序串 = 逆序串
 *
 * @author: Feng YuJie
 * @create: 2021/10/21 10:41
 */
public class Main_5_1 {

    //正序串 = 逆序串
    public static String longestPalindrome(String s) {
        String subString = String.valueOf(s.charAt(0)) ;
        int mid = s.length() / 2 ;
        int left = mid -1, right = mid +1;
        char sTemp = s.charAt(mid);
        for (int i = 0; i < s.length(); i++){

            if (sTemp == s.charAt(left)){
                left--;
            }
            while( left>=0 && right <s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }

        }
        return subString;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aacabdkacaa"));
    }
}
