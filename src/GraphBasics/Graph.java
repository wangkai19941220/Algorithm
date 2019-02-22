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
public interface Graph {


    public int V();//返回节点个数

    public int E();//返回边的个数

    public void addEdge(int v,int w); //添加一条边

    boolean hasEdge(int v,int w); //是否有边

    void show();// 打印边

    public Vector<Integer> adj(int v); //所有邻边




}