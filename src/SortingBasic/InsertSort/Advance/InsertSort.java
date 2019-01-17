/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.InsertSort.Advance;

import SortingBasic.InsertionSort.InsertionSort;

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

}