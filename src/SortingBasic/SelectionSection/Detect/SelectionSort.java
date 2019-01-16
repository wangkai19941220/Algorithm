/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.SelectionSection.Detect;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/16
 */
public class SelectionSort {
    private SelectionSort(){}

    public static void sort(Comparable[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if (arr[j].compareTo(arr[min])<0){
                    min=j;
                }
                swap(arr,i,min);
            }
        }
    }

    public static void swap(Object[] arr,int i,int j){
        Object temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args){
        int N=200;
        Integer[] arr=SortTestHelper.generateRandomArray(N,0,1000);
        //SortTestHelper.printArray(arr);
        SortTestHelper.testSort("SortingBasic.SelectionSection.Detect.SelectionSort",arr);
        SortTestHelper.printArray(arr);
        return;
    }
}