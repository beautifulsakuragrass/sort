package com.wyc.sort.bucketsort;

import java.util.ArrayList;

/**
 * 桶排序
 *
 * @author wyc
 * @date 2019/9/11
 */
public class BucketSort {

    /**
     * 桶排序
     *
     * @param array      int[] 要排序的数组
     * @param bucketSize int 大小
     * @return ArrayList<Integer> 返回排序后的集合
     */
    public static ArrayList<Integer> BucketSort(ArrayList<Integer> array, int bucketSize) {
        if (array == null || array.size() < 2) {
            return array;
        }
        int max = array.get(0), min = array.get(0);
        // 找到最大值最小值
        for (Integer integer : array) {
            if (integer > max) {
                max = integer;
            }
            if (integer < min) {
                min = integer;
            }
        }
        int bucketCount = (max - min) / bucketSize + 1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketCount);
        ArrayList<Integer> resultArr = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            bucketArr.add(new ArrayList<>(16));
        }
        for (Integer value : array) {
            bucketArr.get((value - min) / bucketSize).add(value);
        }
        for (int i = 0; i < bucketCount; i++) {
            // 如果带排序数组中有重复数字时  感谢 @见风任然是风 朋友指出错误
            if (bucketSize == 1) {
                resultArr.addAll(bucketArr.get(i));
            } else {
                if (bucketCount == 1) {
                    bucketSize--;
                }
                ArrayList<Integer> temp = BucketSort(bucketArr.get(i), bucketSize);
                resultArr.addAll(temp);
            }
        }
        return resultArr;
    }
}
