/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package UnionFind;

import com.sun.tools.hat.internal.model.Root;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/2/14
 */
public class UnionFind3 {

    public int[] parent;
    public int[] sz;
    public int count;

    public UnionFind3(int count){

        this.count=count;
        parent=new int[count];
        sz=new int[count];

        for (int i=0;i<count;i++){
            parent[i]=i;
            sz[i]=1;
        }

    }

    private int find(int p){
        while (p!=parent[p])
            p=parent[p];

        return p;
    }

    public boolean isConnected(int p,int q){
        return find(p)==find(q);
    }

    public void unionElements(int p,int q){
        int pRoot=find(p);
        int qRoot=find(q);

        if (pRoot==qRoot) return;

        if (sz[pRoot]>sz[qRoot]){
            parent[qRoot]=pRoot;
            sz[pRoot]=sz[pRoot]+sz[qRoot];
        }else {
            parent[pRoot]=qRoot;
            sz[qRoot]=sz[qRoot]+sz[pRoot];
        }
    }
}