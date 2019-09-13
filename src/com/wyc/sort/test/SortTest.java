package com.wyc.sort.test;

import com.wyc.sort.bubblesort.BubbleSort;
import com.wyc.sort.insertionsort.InsertionSort;
import com.wyc.sort.mergesort.MergeSort;
import com.wyc.sort.selectionsort.SelectionSort;
import com.wyc.sort.shellsort.ShellSort;

import java.util.Arrays;

/**
 * 客户端代码
 *
 * @author wyc
 * @date 2019/9/10
 */
public class SortTest {

    public static void main(String[] args) {

        int[] array = {1, 4, 5, 7, 2, 3, 9, 8, 6};
        System.out.println("排序之前的数组为：" + Arrays.toString(array));

        // 冒泡排序
        int[] bubbleSort = BubbleSort.bubbleSort(array);
        System.out.println("冒泡排序之后数组为：" + Arrays.toString(bubbleSort));

        // 选择排序
        int[] selectionSort = SelectionSort.selectionSort(array);
        System.out.println("选择排序之后数组为：" + Arrays.toString(selectionSort));

        // 插入排序
        int[] insertionSort = InsertionSort.insertionSort(array);
        System.out.println("插入排序之后数组为：" + Arrays.toString(insertionSort));

        // 希尔排序
        int[] shellSort = ShellSort.shellSort(array);
        System.out.println("希尔排序之后数组为：" + Arrays.toString(shellSort));

        // 归并排序
        int[] mergeSort = MergeSort.mergeSort(array);
        System.out.println("归并排序之后数组为：" + Arrays.toString(mergeSort));

        // 快速排序
        int[] quickSort = MergeSort.mergeSort(array);
        System.out.println("快速排序之后数组为：" + Arrays.toString(quickSort));

        // 堆排序
        int[] heapSort = MergeSort.mergeSort(array);
        System.out.println("堆排序之后数组为：" + Arrays.toString(heapSort));

        // 计数排序
        int[] countingSort = MergeSort.mergeSort(array);
        System.out.println("计数排序之后数组为：" + Arrays.toString(countingSort));

        // 桶排序
        int[] bucketSort = MergeSort.mergeSort(array);
        System.out.println("桶排序之后数组为：" + Arrays.toString(bucketSort));

        // 基数排序
        int[] radixSort = MergeSort.mergeSort(array);
        System.out.println("基数排序之后数组为：" + Arrays.toString(radixSort));
    }
}
