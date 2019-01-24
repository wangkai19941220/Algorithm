/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.Search.BinarySearch;

/**
 * 二分搜索
 *
 * @author wangkai
 * @created 2019/1/24
 */
public class BinarySearch {

    private BinarySearch(){}

    private static int find(Comparable[] arr,Comparable target){

        int n=arr.length;

        int l=0,r=n-1;

        while (l<=r){

            int mid=l+(l-r)/2;

            if (arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                 r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return -1;
    }
}