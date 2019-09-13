package com.wyc.sort.bubblesort;

/**
 * 冒泡排序
 *
 * @author wyc
 * @date 2019/9/10
 */
public class BubbleSort {

    /**
     * 冒泡排序
     *
     * @param array int[] 要排序的数组
     * @return int[] 排序后的数组
     */
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
