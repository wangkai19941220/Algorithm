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
 * @created 2019/1/23
 */
public class IndexMaxHeap1<Item extends Comparable> {

    protected Item[] data; //声明数据存放的数组

    protected int[] indexes; //声明最大堆存储的数组 indexes[x]=i;  表示索引i在x的位置

    protected int[] reverse; //反向索引   reverse[i]=x; 表示索引i在x的位置

    protected int capacity; //声明数组的容量

    protected int count; //声明堆的大小


    public IndexMaxHeap1(int capacity){
        data= (Item[]) new Comparable[capacity+1];
        indexes=new int[capacity+1];
        reverse=new int[capacity+1];

        for (int i=0;i<=capacity;i++){
            reverse[i]=0;
        }
        count=0;
        this.capacity=capacity;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return 0==count;
    }

    //向最大索引堆里插入一个元素

    public void insert(int i,Item item){
        i=i+1;
        data[i]=item;
        indexes[count+1]=i;
        reverse[i]=count+1;
        count++;
        shiftUp(count);
    }

    public Item  extractMax(){

        Item ret=data[indexes[1]];
        swapIndex(1,count);
        reverse[indexes[count]]=0;
        count--;
        shiftDown(1);
        return ret;

    }

    public void shiftUp(int k){
        while (k>1&&data[indexes[k]].compareTo(data[indexes[k/2]]>0)){
            swapIndex(k,k/2);
            k=k/2;
        }
    }

    private void shiftDown(int k){
        while (2*k<=count){
            int j=2*k;
            if (j+1<=count&&data[indexes[j+1]].compareTo(data[indexes[j]])>0)
                j++;

            if (data[indexes[k]].compareTo(data[indexes[j]])>=0)
                break;
            swapIndex(k,j);
            k=j;
        }
    }

    public void swapIndex(int i,int j){
        int t=indexes[i];
        indexes[i]=indexes[j];
        indexes[j]=t;


        reverse[indexes[i]]=i;
        reverse[indexes[j]]=j;
    }





}