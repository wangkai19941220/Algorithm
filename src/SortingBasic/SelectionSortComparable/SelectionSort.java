/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.SelectionSortComparable;


/**
 * 实现多种数据结构的比较  类型声明使用包装类
 * 对比使用compareTo
 * 交换的使用使用顶级Object类
 * @author wangkai
 * @created 2019/1/16
 */
public class SelectionSort {

    //声明私有构造方法,不允许外部调用
    private SelectionSort(){}

    public static void sort(Comparable[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if (arr[j].compareTo(arr[min])<0){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
    }
    public static void swap(Object[] arr,int i, int j){
        Object t=arr[i];
        arr[i] =arr[j];
        arr[j] =t;
    }

    public static void main(String[] args){
        // 测试Integer
        Integer[] a = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort.sort(a);
        for( int i = 0 ; i < a.length ; i ++ ){
            System.out.print(a[i]);
            System.out.print(' ');
        }
        System.out.println();

        // 测试Double
        Double[] b = {4.4, 3.3, 2.2, 1.1};
        SelectionSort.sort(b);
        for( int i = 0 ; i < b.length ; i ++ ){
            System.out.print(b[i]);
            System.out.print(' ');
        }
        System.out.println();

        // 测试String
        String[] c = {"D", "C", "B", "A"};
        SelectionSort.sort(c);
        for( int i = 0 ; i < c.length ; i ++ ){
            System.out.print(c[i]);
            System.out.print(' ');
        }
        System.out.println();

        // 测试自定义的类 Student
        Student[] d = new Student[4];
        d[0] = new Student("D",90);
        d[1] = new Student("C",100);
        d[2] = new Student("B",95);
        d[3] = new Student("A",95);
        SelectionSort.sort(d);
        for( int i = 0 ; i < d.length ; i ++ )
            System.out.println(d[i]);
    }
}