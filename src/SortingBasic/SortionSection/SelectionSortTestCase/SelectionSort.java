/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.SortionSection.SelectionSortTestCase;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/16
 */
public class SelectionSort {


    //声明私有构造方法,不允许外部调用
    private SelectionSort(){}

    public static void sort(Comparable[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if (arr[j].compareTo(arr[min])<0){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
    }
    public static void swap(Object[] arr,int i, int j){
        Object t=arr[i];
        arr[i] =arr[j];
        arr[j] =t;
    }

    public static void main(String[] args) {

        // 测试排序算法辅助函数
        int N = 20;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SelectionSort.sort( arr );
        SortTestHelper.printArray(arr);
        return;
    }
}