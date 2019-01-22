/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.QuickSort;


import SortingBasic.InsertionSort.InsertionSort;

import static SortingBasic.QuickSort.InsertSort.insertSort;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/22
 */
public class QuickSort {


    public static void sort(Comparable[] arr){
        int n=arr.length;
        sort(arr,0,n-1);
    }

    public static void sort(Comparable[] arr,int l,int r){

        if (l>=r)
            return;

        // 对于小规模数组, 使用插入排序
        if( r - l <= 15 ){
            insertSort(arr, l, r);
            return;
        }

        int p=partition(arr,l,r);
        sort(arr,l,p-1);
        sort(arr,p+1,r);
    }

    public static int  partition(Comparable[] arr,int l,int r){

        swap(arr,l,(int)(Math.random()*(r-l+1)+l));

        Comparable v=arr[l];

        int j=l;
        for (int i=l+1;i<=r;i++){
            if (arr[i].compareTo(v)<0){
                j++;
                swap(arr,j,i);
            }
        }
        swap(arr,l,j);
        return j;
    }
    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    // 测试 QuickSort
    public static void main(String[] args) {

        // Quick Sort也是一个O(nlogn)复杂度的算法
        // 可以在1秒之内轻松处理100万数量级的数据
        int N = 100;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("SortingBasic.QuickSort.QuickSort", arr);
        SortTestHelper.printArray(arr);
        return;
    }
}