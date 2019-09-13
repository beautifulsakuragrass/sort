package com.wyc.sort.quicksort;

/**
 * 快速排序
 *
 * @author wyc
 * @date 2019/9/10
 */
public class QuickSort {
    /**
     * 快速排序方法
     *
     * @param array int[] 要排序的数组
     * @param start int[] 基准数字之前的数组
     * @param end   int[] 基准数字之后的数组
     * @return int[] 排序后的数组
     */
    public static int[] QuickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) {
            return null;
        }
        int smallIndex = partition(array, start, end);
        if (smallIndex > start) {
            QuickSort(array, start, smallIndex - 1);
        }
        if (smallIndex < end) {
            QuickSort(array, smallIndex + 1, end);
        }
        return array;
    }

    /**
     * 快速排序算法——partition
     *
     * @param array int[] 要排序的数组
     * @param start int[] 开始数组
     * @param end   int[] 结束数组
     * @return int[] 排序后的数组
     */
    public static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++) {
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex) {
                    swap(array, i, smallIndex);
                }
            }
        }
        return smallIndex;
    }

    /**
     * 交换数组内两个元素
     *
     * @param array int[] 数组
     * @param i     int 要交换的值
     * @param j     int 要交换的值
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
