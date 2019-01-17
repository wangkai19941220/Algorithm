/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.InsertionSort;

import java.util.Arrays;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/17
 */
public class Main {
    public static void main(String[] args){
        int N=20000;
        Integer[] arr1=SortTestHelper.generateRandomArray(N,1,200000);
        Integer[] arr2=Arrays.copyOf(arr1, arr1.length);

        SortTestHelper.testSort("SortingBasic.InsertionSort.InsertionSort",arr1);
        SortTestHelper.testSort("SortingBasic.InsertionSort.SelectionSort",arr2);
    }
}