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
public class UnionFind5 {

    public int[] parent;
    public int[] rank;
    public int count;

    public UnionFind5(int count){
        rank=new int[count];
        parent=new int[count];
        this.count=count;

        for (int i=0;i<count;i++){
            parent[i]=i;
            rank[i]=1;
        }
    }

    public int find(int p){
        /*while (p!=parent[p]){
            parent[p]=parent[parent[p]];
            p=parent[p];
        }
        return p;*/


        if (p!=parent[p]){
            parent[p]=find(parent[p]);
        }
        return parent[p];
    }

    public boolean isConnected(int p,int q){
        return  find(p)==find(q);
    }

    public void unionElements(int p,int q){
        int pRoot=find(p);
        int qRoot=find(q);

        if (pRoot==qRoot) return;

        if (rank[pRoot]>rank[qRoot]){
            parent[qRoot]=pRoot;
        }else if (rank[pRoot]>rank[qRoot]){
            parent[pRoot]=qRoot;
        }else {
            parent[pRoot]=qRoot;
            rank[qRoot]++;
        }
    }
}