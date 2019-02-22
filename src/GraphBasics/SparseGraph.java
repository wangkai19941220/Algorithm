/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package GraphBasics;

import java.util.Iterator;
import java.util.Vector;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/2/15
 */
public class SparseGraph implements Graph {

    private int n;
    private int m;
    private boolean directed;
    private Vector<Integer>[] g;

    public SparseGraph(int n,boolean directed){
        this.n=n;
        this.m=0;
        this.directed=directed;
        g=(Vector<Integer>[]) new Vector[n];

        for (int i=0;i<n;i++)
            g[i]=new Vector<Integer>();
    }

    @Override
    public int V() {
        return n;
    }

    @Override
    public int E() {
        return m;
    }

    @Override
    public void addEdge(int v, int w) {
        g[v].add(w);
        if (!directed)
            g[w].add(v);
        m++;
    }

    @Override
    public boolean hasEdge(int v, int w) {
        for (int i=0;i<g[v].size();i++){
            if (g[v].elementAt(i)==w)
                return true;
        }
        return false;
    }

    @Override
    public void show() {
        for (int i=0;i<n;i++){
            for (int j=0;j<g[i].size();j++){
                System.out.print(g[i].elementAt(j)+"\t");
            }
            System.out.println();
        }
    }

    @Override
    public Vector<Integer> adj(int v) {

        return g[v];
    }
}