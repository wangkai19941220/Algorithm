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
public class DenseGraph implements Graph {

    private int n;//节点数
    private int m;//边数
    private boolean directed;//是否为有向吐
    private boolean[][] g;   //图的具体数据

    public DenseGraph(int n,boolean directed){
        this.n=n;
        this.m=0;
        this.directed=directed;
        //g初始化为n*n的布尔矩阵，每个g[i][j]均为false,表示没有任何边
        //false 为boolean型变量的默认值
        g=new boolean[n][n];
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

        if (hasEdge(v,w)) return;

        g[v][w]=true;
        if (!directed)
            g[w][v]=true;
        m++;
    }

    @Override
    public boolean hasEdge(int v, int w) {
        return g[v][w];
    }

    @Override
    public void show() {
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(g[i][j]+"\t");
            }
            System.out.println();
        }
    }

    @Override
    public Vector<Integer> adj(int v) {

        Vector<Integer> adjV=new Vector<Integer>();
        for (int i=0;i<n;i++)
            if (g[v][i])
                adjV.add(i);

        return adjV;
    }
}