/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package UnionFind;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/2/14
 */
public class UnionFind1 {
    private int[] id; // 第一版的并查集本质就是一个数组
    private int count; // 数据个数

    public UnionFind1(int n){
        count=n;
        id=new int[n];
        for (int i=0;i<n;i++){
            id[i]=i;
        }
    }

    private int find(int p){
        assert p>=0&&p<count;
        return id[p];
    }

    public boolean isConnected(int p,int q){ return find(p)==find(q);}

    public void unionElements(int p,int q){
        int pId=find(p);
        int qId=find(q);
        if (pId==qId) return;
       for (int i=0;i<count;i++){
           if (id[i]==pId)
               id[i]=qId;
       }
    }

}