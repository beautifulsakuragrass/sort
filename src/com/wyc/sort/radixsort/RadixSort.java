package com.wyc.sort.radixsort;

import java.util.ArrayList;

/**
 * 基数排序
 *
 * @author wyc
 * @date 2019/9/11
 */
public class RadixSort {

    /**
     * 基数排序
     *
     * @param array int[] 要排序的数组
     * @return int[] 排序后的数组
     */
    public static int[] RadixSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        // 1.先算出最大数的位数；
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        int maxDigit = 0;
        while (max != 0) {
            max /= 10;
            maxDigit++;
        }
        int mod = 10, div = 1;
        ArrayList<ArrayList<Integer>> bucketList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++) {
            bucketList.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < maxDigit; i++, mod *= 10, div *= 10) {
            for (int value : array) {
                int num = (value % mod) / div;
                bucketList.get(num).add(value);
            }
            int index = 0;
            for (ArrayList<Integer> integers : bucketList) {
                for (Integer integer : integers) {
                    array[index++] = integer;
                }
                integers.clear();
            }
        }
        return array;
    }
}
