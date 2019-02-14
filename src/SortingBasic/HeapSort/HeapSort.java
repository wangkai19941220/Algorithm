/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.HeapSort;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/2/12
 */
public class HeapSort {

    private HeapSort(){}

    public static void sort(Comparable[] arr){
        int n=arr.length;

        for (int i=(n-1-1)/2;i>0;i++){
            shiftDown2(arr,n,i);
        }

        for (int i=n-1;i>0;i--){
            swap(arr,i,0);
            shiftDown2(arr,i,0);
        }

    }

    public static void swap(Object[] arr,int i,int j){
        Object t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void shiftDown2(Comparable[] arr,int n,int k){
        Comparable e=arr[k];
        while (2*k+1<n){
            int j=2*k+1;
            if (j+1<n&&arr[j].compareTo(arr[j+1])<0){
                j++;
            }

            if (arr[j].compareTo(e)<0) break;

            arr[k]=arr[j];
            k=j;
        }
        arr[k]=e;
    }
}