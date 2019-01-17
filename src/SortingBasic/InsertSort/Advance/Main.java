/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.InsertSort.Advance;

import java.util.Arrays;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/17
 */
public class Main {
    public static void main(String[] args){

        int N=10000;

        Integer[] arr1=SortTestHelper.generateRandomArray(N,1,1000000);
        Integer[] arr2=Arrays.copyOf(arr1,arr1.length);
        Integer[] arr3=Arrays.copyOf(arr1,arr1.length);

        SortTestHelper.testSort("SortingBasic.InsertionSort.InsertionSort",arr1);
        SortTestHelper.testSort("SortingBasic.InsertSort.Advance.InsertSort",arr2);
        SortTestHelper.testSort("SortingBasic.InsertSort.Advance.SelectionSort",arr3);
    }
}