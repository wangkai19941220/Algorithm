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
 * @created 2019/1/22
 */
public class MaxHeap<Item extends Comparable> {

    protected Item[] data;
    protected int count;
    protected int capacity;
    protected MaxHeap(int capacity){
        data= (Item[]) new Comparable[capacity+1];
        count=0;
        this.capacity=capacity;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }

    public void insert(Item item){
        assert count+1<=capacity;
        data[count+1]=item;
        count++;
        shitUp(count);
    }

    private void shitUp(int k){
        while (k>1&&data[k/2].compareTo(data[k])<0){
            swap(k,k/2);
            k=k/2;
        }
    }
    // 交换堆中索引为i和j的两个元素
    private void swap(int i, int j){
        Item t = data[i];
        data[i] = data[j];
        data[j] = t;
    }


    public static void main(String[] args){
        MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(100);
        int N = 50; // 堆中元素个数
        int M = 100; // 堆中元素取值范围[0, M)
        for( int i = 0 ; i < N ; i ++ )
            maxHeap.insert(new Integer((int)(Math.random()*M)));

        System.out.println(maxHeap.size());
    }

}