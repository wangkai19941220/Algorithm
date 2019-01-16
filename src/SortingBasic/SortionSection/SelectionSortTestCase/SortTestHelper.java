/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.SortionSection.SelectionSortTestCase;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/16
 */
public class SortTestHelper {

    private SortTestHelper(){}

    //生成Test数组
    public static  Integer[] generateRandomArray(int n,int rangL,int rangR){
        assert rangL<=rangR;
        Integer[] arr=new Integer[n];

        for (int i=0;i<n;i++){
            arr[i]=new Integer((int)(Math.random()*(rangR-rangL+1)+rangL));
        }
        return arr;
    }
    // 打印数组
    public static void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print( arr[i] );
            System.out.print( ' ' );
        }
        System.out.println();

        return;
    }
}