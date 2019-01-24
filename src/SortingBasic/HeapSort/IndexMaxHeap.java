/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package SortingBasic.HeapSort;

/**
 * 最大索引堆
 *
 * @author wangkai
 * @created 2019/1/23
 */
public class IndexMaxHeap <Item extends Comparable>{

    protected Item[] data;
    protected int[] indexes;
    protected int count;
    protected int capacity;

    private IndexMaxHeap(){}

    private IndexMaxHeap(int capacity){
        data= (Item[]) new Comparable[capacity+1];
        indexes=new int[capacity+1];
        count=0;
        this.capacity=capacity;
    }

    public int size(){
        return count;
    }

    public void insert(int i,Item item){

        i=i+1;
        data[i]=item;
        indexes[count+1]=i;
        count++;
        shiftUp(count);

    }

    private  void shiftUp(int k){
        while (k>1&&data[indexes[k/2]].compareTo(data[indexes[k]])<0){
            swapIndexes(k,k/2);
            k=k/2;
        }
    }

    private int extractMaxIndex(){

    }

    private int extractMax(){

        Item ret=data[indexes[1]];
        swapIndexes(1,count);
        count--;
        shiftDown(1);
        return ret;

    }

    private void  shiftDown(int k){
        while (2*k<count){
            int j=2*k;
            if (j+1<=count&&data[indexes[j+1]].compareTo(data[indexes[j]])>0)
                j++;
            if (data[indexes[j]].compareTo(data[indexes[k]])<0) break;

            swapIndexes(j,k);

            k=j;
        }
    }

    // 交换索引堆中的索引i和j
    private void swapIndexes(int i, int j){
        int t = indexes[i];
        indexes[i] = indexes[j];
        indexes[j] = t;
    }
}