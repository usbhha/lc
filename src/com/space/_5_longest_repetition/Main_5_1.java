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
    public  String longestPalindrome(String s) {
        String subString = String.valueOf(s.charAt(0)) ;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++){
            //奇数个
            int odd = findLongest(s, i, i);
            //偶数个
            int even = findLongest(s, i, i + 1);
            maxLen = Math.max(odd,even);
            if ( maxLen > subString.length()){
                if (maxLen % 2 == 0){
                    //偶 1 2 3 4 5 6
                    subString = s.substring(i-maxLen/2+1, i+ maxLen/2+1);
                }else{
                    subString = s.substring(i-maxLen/2, i+maxLen/2+1);
                }
            }
        }
        return subString;
    }

    public int findLongest(String s, int left, int right){
        while( left>=0 && right <s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        Main_5_1 m = new Main_5_1();
        System.out.println(m.longestPalindrome("aacabdkacaa"));
    }
}
