package com.wyc.sort.selectionsort;

/**
 * 选择排序
 *
 * @author wyc
 * @date 2019/9/10
 */
public class SelectionSort {

    /**
     * 冒泡排序
     *
     * @param array int[] 要排序的数组
     * @return int[] 排序后的数组
     */
    public static int[] selectionSort(int[] array) {
        if (array.length == 0) {
            return array;
        }

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            // 找到最小的数
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    // 将最小数的索引保存
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
