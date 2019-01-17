/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.InsertionSort;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/17
 */
public class InsertionSort {

    private InsertionSort(){}
    public static void sort(Comparable[] arr){
        int n=arr.length;

        for (int i=0;i<n;i++){
           /* for (int j=i;j>0;j--){
                if (arr[j].compareTo(arr[j-1])<0){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }*/

           for (int j=i;j>0&&arr[j].compareTo(arr[j-1])<0;j--){
               swap(arr,j,j-1);
           }
        }
    }
    public static void swap(Object[] arr,int i,int j){
        Object temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args){
        int N=2000;
        Integer[] arr=SortTestHelper.generateRandomArray(N,1,20);
        SortTestHelper.testSort("SortingBasic.InsertionSort.InsertionSort",arr);
        SortTestHelper.printArray(arr);

    }
}