/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.QuickSort;

import java.lang.reflect.Method;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/1/16
 */
public class SortTestHelper {
    private SortTestHelper(){}

    public static Integer[] generateRandomArray(int n,int rangeL,int rangeR){
        assert rangeL<=rangeR;

        Integer[] arr=new Integer[n];

        for (int i=0;i<n;i++){
            arr[i]=new Integer((int)(Math.random()*(rangeR-rangeL+1)+rangeL));
        }
        return arr;
    }

    public static void printArray(Object[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            System.out.println(' ');
        }
        System.out.println();
        return;
    }

    public static boolean isSorted(Comparable[] arr){
        for (int i=0;i<arr.length-1;i++){
            if (arr[i].compareTo(arr[i+1])>0){
                return false;
            }
        }
        return true;
    }

    public static void testSort(String sortClassName, Comparable[] arr){

        try {
            Class sortClass=Class.forName(sortClassName);
            Method sortMethod=sortClass.getMethod("sort",new Class[]{Comparable[].class});
            Object[] params=new Object[]{arr};

            Long startTime=System.currentTimeMillis();
            sortMethod.invoke(null,params);
            Long endTime=System.currentTimeMillis();

            assert isSorted(arr);
            System.out.println(sortClass.getSimpleName()+":"+(endTime-startTime)+"ms");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}