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
public class QuickSort2 {
    private QuickSort2(){}

    public static void sort(Comparable[] arr){
        int n=arr.length;
        sort(arr,0,n-1);
    }

    public static void sort(Comparable[] arr,int l,int r){
        if (r-l<15){
            InsertSort.insertSort(arr,l,r);
            return;
        }

        int p=partition(arr,l,r);
        sort(arr,l,p-1);
        sort(arr,p+1,r);
    }
    public static int  partition(Comparable[] arr,int l,int r){

        swap(arr,l,(int)(Math.random()*(r-l+1)+l));

        Comparable v=arr[l];

        int i=l+1,j=r;

        while (true){
            while (arr[i].compareTo(v)<0)
                i++;
            while (arr[j].compareTo(v)>0)
                j--;
            if (i>j)
                break;
            swap(arr,i,j);
        }
        swap(arr,l,j);
        return j;
    }

    public static void swap(Object[] arr,int i,int j){
        Object temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args){

        Integer[] arr=SortTestHelper.generateRandomArray(100,1,3333);
        SortTestHelper.testSort("SortingBasic.QuickSort.QuickSort2",arr);
        SortTestHelper.printArray(arr);
    }
}