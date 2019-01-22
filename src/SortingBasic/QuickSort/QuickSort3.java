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
 * @created 2019/1/22
 */
public class QuickSort3 {

    private QuickSort3(){}

    public static void sort(Comparable[] arr){
        int n=arr.length;
        sort(arr,0,n-1);
    }

    public static void sort(Comparable[] arr,int l,int r){

        if (r-l<=15){
            InsertSort.insertSort(arr,l,r);return;
        }
        swap(arr,l,(int)(Math.random()*(r-l+1)+l));
        Comparable v=arr[l];

        int lt=l;
        int gt=r+1;
        int i=l+1;
        while (i<gt){
            if (arr[i].compareTo(v)<0){
                swap(arr,i,lt+1);
                i++;
                lt++;
            }else if(arr[i].compareTo(v)>0) {
                swap(arr,i,gt-1);
                gt--;
            }else {
                i++;
            }
        }
        swap(arr,l,lt);

        sort(arr,l,lt-1);
        sort(arr,gt,r);

    }


    public static void swap(Object[] arr,int i,int j){
        Object temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args){
        int N=1000;
        Integer[] arr=SortTestHelper.generateRandomArray(N,1,20000);
        SortTestHelper.testSort("SortingBasic.QuickSort.QuickSort3",arr);
        SortTestHelper.printArray(arr);
    }
}