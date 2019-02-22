/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package MinimunSpanTrees;

import java.util.Vector;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/2/20
 */
public class SparseWeightedGraph<Weight extends Number & Comparable> implements WeightedGraph {

    private int n;
    private int m;
    private boolean directed;
    private Vector<Edge<Weight>>[] g;

    public SparseWeightedGraph(int n,boolean directed){
        this.n=n;
        this.m=0;
        this.directed=directed;

        g=(Vector<Edge<Weight>>[]) new Vector[n];
        for (int i=0;i<n;i++){
            g[i]=new Vector<>(Edge<Weight>);
        }
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
    public void addEdge(Edge e) {

        g[e.v()].add(new Edge(e));
        if (e.v()!=e.w() && !directed)
            g[e.w()].add(new Edge(e.w(),e.v(),e.wt()));
        m++;
    }

    @Override
    public boolean hasEdge(int v, int w) {
        return false;
    }

    @Override
    public void show() {

    }

    @Override
    public Iterable<Edge> adj(int v) {
        return null;
    }
}