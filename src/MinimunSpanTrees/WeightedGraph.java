/*
 * Copyright (c) 2019 maoyan.com
 * All rights reserved.
 *
 */
package MinimunSpanTrees;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2019/2/20
 */
public interface WeightedGraph<Weight extends Number & Comparable> {

    public int V();
    public int E();
    public void addEdge(Edge<Weight> e);
    boolean hasEdge(int v,int w);
    void show();
    public Iterable<Edge<Weight>> adj(int v);

}