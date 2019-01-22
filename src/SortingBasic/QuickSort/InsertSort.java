/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.QuickSort;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/17
 */
public class InsertSort {

    private InsertSort(){}

    public static void sort(Comparable[] arr){
        int n=arr.length;

        for (int i=0;i<n;i++){

            Comparable e=arr[i];
            int j=i;
            for (;j>0&&arr[j-1].compareTo(e)>0;j--){
                arr[j]=arr[j-1];
            }
            arr[j]=e;
        }
    }

    // 对arr[l...r]的区间使用InsertionSort排序
    public static void insertSort(Comparable[] arr, int l, int r){

        for( int i = l + 1 ; i <= r ; i ++ ){
            Comparable e = arr[i];
            int j = i;
            for( ; j > l && arr[j-1].compareTo(e) > 0 ; j--)
                arr[j] = arr[j-1];
            arr[j] = e;
        }
    }

}