/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.SelectionSort;

import java.util.Arrays;

/**
 * 普通选择排序
 * 选择排序的核心在于从[i,n)中找到最小值，放到i位置
 * 为什么叫选择排序，因为它在不断选择剩余元素的最小值
 * @author wangkai
 * @created 2019/1/16
 */
public class SelectionSort{

    //声明私有构造方法,不允许外部调用
    private SelectionSort(){}

    public static void sort(int[] arr){
        int n=arr.length;
        //确定外层有多少选择位置
        for (int i=0;i<n;i++){
            int min=i;
            //寻找【i,n)中最小值
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            //交换最小值到i最小值的位置
            swap(arr,i,min);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args){
      int[] arr={10,3,4,3,4,6,6,88};
      SelectionSort.sort(arr);
      System.out.println(Arrays.toString(arr));
    }

}