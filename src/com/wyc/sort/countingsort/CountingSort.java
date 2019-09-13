package com.wyc.sort.countingsort;

import java.util.Arrays;

/**
 * 计数排序
 *
 * @author wyc
 * @date 2019/9/11
 */
public class CountingSort {
    /**
     * 计数排序
     *
     * @param array int[] 要排序的数组
     * @return int[] 排序之后的数组
     */
    public static int[] CountingSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int bias, min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        bias = 0 - min;
        int[] bucket = new int[max - min + 1];
        Arrays.fill(bucket, 0);
        for (int value : array) {
            bucket[value + bias]++;
        }
        int index = 0, i = 0;
        while (index < array.length) {
            if (bucket[i] != 0) {
                array[index] = i - bias;
                bucket[i]--;
                index++;
            } else {
                i++;
            }
        }
        return array;
    }
}
