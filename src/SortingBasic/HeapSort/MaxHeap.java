/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.HeapSort;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/2/12
 */
public class MaxHeap<Item extends Comparable> {

    public Item[] data;
    public int count;
    public int capacity;
    //初始化最大堆
    public MaxHeap(int capacity){
        data= (Item[]) new Comparable[capacity+1];
        count=0;
        this.capacity=capacity;
    }

    public MaxHeap(Item[] arr){
        int n=arr.length;

        data= (Item[]) new Comparable[n+1];
        count=n;
        capacity=n;
        for (int i=0;i<n;i++){
            data[i+1]=arr[i];
        }
        for (int i=n/2;i>=1;i--){
            shiftDown(i);
        }
    }
    //返回堆的大小
    public int size(){
        return count;
    }
    //判断堆是否为空
    public boolean isEmpty(){
        return count==0;
    }

    //插入一个元素
    public void insert(Item item){

        assert count+1 <= capacity;
        data[count+1]=item;
        count++;
        shiftUp(count);
    }

    //取出最大的元素
    public Item extractMax(){
        Item ret=data[1];

        swap(1,count);
        count--;
        shiftDown(1);
        return ret;
    }

    // 最大堆核心辅助函数
    public void shiftUp(int k){

        while (k>1&&data[k/2].compareTo(data[k])<0){
            swap(k,k/2);
            k=k/2;
        }
    }
    //
    public void shiftDown(int k){
        while (2*k<count){
            int j=2*k;
            if (j+1<=count&&data[j].compareTo(data[j+1])<0){
                j++;
            }

            if (data[k].compareTo(data[j])>0) break;
            swap(k,j);

            k=j;
        }
    }
    //交换函数
    public void swap(int i,int j){
        Item t=data[i];
        data[i]=data[j];
        data[j]=t;
    }


    public static void main(String[] args){
        MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(100);
        int N = 100; // 堆中元素个数
        int M = 100; // 堆中元素取值范围[0, M)
        for( int i = 0 ; i < N ; i ++ )
            maxHeap.insert( new Integer((int)(Math.random() * M)) );

        Integer[] arr = new Integer[N];
        // 将maxheap中的数据逐渐使用extractMax取出来
        // 取出来的顺序应该是按照从大到小的顺序取出来的
        for( int i = 0 ; i < N ; i ++ ){
            arr[i] = maxHeap.extractMax();
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 确保arr数组是从大到小排列的
        for( int i = 1 ; i < N ; i ++ )
            assert arr[i-1] >= arr[i];



    }

}