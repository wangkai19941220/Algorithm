/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.MergeSort;


import java.util.Arrays;

import static SortingBasic.MergeSort.InsertSort.insertSort;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/22
 */
public class MergeSort {
    private MergeSort(){}

    public static void Merge(Comparable[] arr,int l,int mid,int r){
        Comparable[] aux=Arrays.copyOfRange(arr,l,r+1);

        int i=l,j=mid+1;
        for (int k=i;k<=r;k++){
            if (i > mid){
                arr[k] = aux[j-l];
                j++;
            }else if (j > r){
                arr[k] = aux[i-l];
                i++;
            }else if (aux[i-l].compareTo(aux[j-l])<0){
                arr[k] = aux[i-l];
                i++;
            }else{
                arr[k] = aux[j-l];
                j++;
            }
        }

    }
    public static void sort(Comparable[] arr,int l,int r){
        if (l>=r)
            return;
        if (r-l<15){
            insertSort(arr,l,r);
        }
        int mid=(l+r)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        if (arr[mid].compareTo(arr[mid+1])>0){
            Merge(arr,l,mid,r);
        }
    }

    public static void sort(Comparable[] arr){
        int n=arr.length;
        sort(arr,0,n-1);
    }

}