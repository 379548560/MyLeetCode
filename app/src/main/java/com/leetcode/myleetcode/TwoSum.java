package com.leetcode.myleetcode;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Created by androidgj on 17/9/12.
 */

public class TwoSum {
    /**
     * 分析：
     * 给定指定数组，以及目标函数值，要求从数组中找到和为目标值的两个数，注意为第一次出现的两个数
     * 有即返回
     * 思路：
     * 最简单的方法遍历两次，两层循环，求和即可达到目的，时间复杂度为O(n²)
     * 以下方法使用hashmap ，时间复杂度为O(n)
     *
     * @param nums
     * @param target
     * @return
     */
    //采用hashMap
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int numsLength = nums.length;

        for (int i = 0; i < numsLength; i++) {

            int targetNum = target - nums[i];

            if (map.containsKey(targetNum) && map.get(targetNum) != i) {

                return new int[]{map.get(targetNum), i};

            }
            
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
