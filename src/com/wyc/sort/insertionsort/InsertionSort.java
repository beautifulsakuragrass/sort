package com.wyc.sort.insertionsort;

/**
 * 插入排序
 *
 * @author wyc
 * @date 2019/9/10
 */
public class InsertionSort {

    /**
     * 插入排序
     *
     * @param array int[] 要排序的数组
     * @return int[] 排序后的数组
     */
    public static int[] insertionSort(int[] array) {
        if (array.length == 0) {
            return array;
        }

        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }
}
