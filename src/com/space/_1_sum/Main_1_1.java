package com.space._1_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 1. 两数之和
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author FYJ
 */
public class Main_1_1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Object, Object> map = new HashMap<>();
        ConcurrentHashMap<Object, Object> hashMap = new ConcurrentHashMap<>();
        hashMap.put("","");
        int sum = 0;
        int eqI = 0;
        int i = 0;
        int[] indexs= new int[2];
        for( i=0; i<nums.length; i++){
            eqI = i;
            for (int j=0; j<nums.length; j++){
                if (eqI == j) {
                    continue;
                }
                sum = nums[i]+nums[j];
                if (sum == target){
                    indexs[0] = i;
                    indexs[1] = j;
                    return indexs;
                }
            }
        }
        return null;
    }

    /**
     *  优化： 使用hashmap containsKey
     */
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(8);
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // write your code here
        Main_1_1 m = new Main_1_1();
//        int[] array = {-3,4,3,90}; target = 0;
        int[] array = {-1,-2,-3,-4,-5};
        System.out.println(Arrays.toString(m.twoSum(array,-8) ));
        System.out.println(Arrays.toString(m.twoSum2(array,-8) ));
    }
}
