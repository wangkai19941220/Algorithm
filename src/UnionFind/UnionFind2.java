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
public class UnionFind2 {

    public int[] parent;
    public int count;

    public UnionFind2(int count){
        parent=new int[count];
        this.count=count;

        for (int i=0;i<count;i++){
            parent[i]=i;
        }
    }

    public int find(int p){
        while (p!=parent[p])
            p=parent[p];

        return p;
    }

    public boolean isConnected(int p,int q){ return find(p)==find(q);}

    public void unionElements(int p,int q){
        int pRoot=find(p);
        int qRoot=find(q);
        if (pRoot==qRoot)
            return;
        parent[pRoot]=qRoot;
    }
}