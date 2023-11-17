package com.lc._4__search_array_middle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 *
 * @author: Feng YuJie
 * @create: 2021/10/15 16:25
 */
public class Main_4_1 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /**
         * 困难，先跳过-- 未用算法
         */
        List<Integer> a = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> b = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        a.addAll(b);
        double d = 2d;
        List<Integer> collect = a.stream().sorted().collect(Collectors.toList());
        if (collect.size() % 2 == 0){
            return (collect.get(collect.size()/2)+collect.get(collect.size()/2-1)) / d;
        }else{
            return collect.get((collect.size() -1)/2);
        }

    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {4};
        System.out.println(findMedianSortedArrays(a, b));
    }

}
