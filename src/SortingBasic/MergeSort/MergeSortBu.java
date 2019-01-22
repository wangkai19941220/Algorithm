/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.MergeSort;

import java.util.Arrays;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/22
 */
public class MergeSortBu {
    private MergeSortBu(){}


    public static void merge(Comparable[] arr,int l,int mid,int r){

        Comparable[] aux=Arrays.copyOfRange(arr,l,r+1);

        int i=l,j=mid+1;
        for(int k=l;k<=r;k++){
            if( i > mid ){  // 如果左半部分元素已经全部处理完毕
                arr[k] = aux[j-l]; j ++;
            }
            else if( j > r ){   // 如果右半部分元素已经全部处理完毕
                arr[k] = aux[i-l]; i ++;
            }
            else if( aux[i-l].compareTo(aux[j-l]) < 0 ){  // 左半部分所指元素 < 右半部分所指元素
                arr[k] = aux[i-l]; i ++;
            }
            else{  // 左半部分所指元素 >= 右半部分所指元素
                arr[k] = aux[j-l]; j ++;
            }
        }

    }

    public static void sort(Comparable[] arr){

        int n=arr.length;

        /*for(int sz=1;sz<n;sz*=2)
            for(int i = 0;i < n-sz;i+=sz+sz)
                Merge(arr,i,i+sz-1,Math.min(i+sz+sz-1,n-1));*/

        for (int i=0;i<n;i+=16){
            InsertSort.insertSort(arr,i,Math.min(i+15,n-1));
        }

        for (int sz=16;sz<n;sz+=sz){
            for (int i=0;i<n-sz;i+=sz+sz){
                if(arr[i+sz-1].compareTo(arr[i+sz])>0){
                    merge(arr,i,i+sz-1,Math.min(i+sz+sz-1,n-1));
                }
            }
        }
    }

    public static void main(String[] args){
        int N=100;
        Integer[] arr=SortTestHelper.generateRandomArray(N,0,100);
        SortTestHelper.testSort("SortingBasic.MergeSort.MergeSortBu",arr);
        SortTestHelper.printArray(arr);
    }
}


